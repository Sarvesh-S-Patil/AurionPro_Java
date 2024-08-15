package com.apro.model;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.If;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionUtil {
	
	Connection connection;
	


	public TransactionUtil(Connection connection) {
		super();
		this.connection = connection;
	}
	
	
	public boolean addTransaction(long senderAccountId,long recieverAccountId,String TransactionType,double amount) {
		
		AccountUtil accountUtil = new AccountUtil(connection);
		Date date= new Date();
		java.sql.Date date2 = new java.sql.Date(date.getTime());
		try {
			String creditQuery = "INSERT INTO transaction(`senderAccountid`,`recieveraccountid`,`transactiontype`,`amount`,`date`) VALUES (NULL,?,?,?,?)";
			String debitQuery = "INSERT INTO transaction(`senderAccountid`,`recieveraccountid`,`transactiontype`,`amount`,`date`) VALUES (?,NULL,?,?,?)";
			String transferQuery = "INSERT INTO transaction(`senderAccountid`,`recieveraccountid`,`transactiontype`,`amount`,`date`) VALUES (?, ?,?,?,?)";
			connection.setAutoCommit(false);
			
			boolean status = true;
			if(TransactionType.equals("Credit")) {
				PreparedStatement preparedStatement = connection.prepareStatement(creditQuery);
				preparedStatement.setLong(1, senderAccountId);
				preparedStatement.setString(2, TransactionType);
				preparedStatement.setDouble(3, amount);
				preparedStatement.setDate(4, date2);
				int rowsAffected = preparedStatement.executeUpdate();
				if(rowsAffected==0) {
					connection.rollback();
					return false;
				}
				status =accountUtil.credit(recieverAccountId, amount);	
			}
			else if(TransactionType.equals("Debit")) {
				PreparedStatement preparedStatement = connection.prepareStatement(debitQuery);
				preparedStatement.setLong(1, recieverAccountId);
				preparedStatement.setString(2, TransactionType);
				preparedStatement.setDouble(3, amount);
				preparedStatement.setDate(4, date2);
				int rowsAffected = preparedStatement.executeUpdate();
				if(rowsAffected==0) {
					connection.rollback();
					return false;
				}
					
				status=accountUtil.debit(senderAccountId, amount);
			}
			else {
				PreparedStatement preparedStatement = connection.prepareStatement(transferQuery);
				preparedStatement.setLong(1, senderAccountId);
				preparedStatement.setLong(2, recieverAccountId);
				preparedStatement.setString(3, TransactionType);
				preparedStatement.setDouble(4, amount);
				preparedStatement.setDate(5, date2);
				int rowsAffected = preparedStatement.executeUpdate();
				if(rowsAffected==0) {
					connection.rollback();
					return false;
				}
						
				status=accountUtil.debit(senderAccountId, amount);
				if(status==false) {
					connection.rollback();
					return false;
				}	
				status=accountUtil.credit(recieverAccountId, amount);
			}
			if(status==false) {
				connection.rollback();
				return false;
			}
			else {
				connection.commit();
			}
			connection.setAutoCommit(true);
			return status;            
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	public List<Transaction> viewTransactions() {
		String query = "Select * from transaction order by date desc limit 20";
		List<Transaction> transactions = new ArrayList<Transaction>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			 ResultSet resultSet =preparedStatement.executeQuery();
			 while(resultSet.next()) {
					long transactionId=resultSet.getLong(1);
					long senderAccountId=resultSet.getLong(2);
					long recieverAccountId=resultSet.getLong(3);
					String transactionType=resultSet.getString(4);
					double amount=resultSet.getDouble(5);
					Date sqlDate = resultSet.getDate(6);
					String date = (sqlDate != null) ? sqlDate.toString() : "";
					
					Transaction transaction = new Transaction(transactionId, senderAccountId, recieverAccountId, transactionType, amount, date);
					transactions.add(transaction);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return transactions;
	}
	
	


}
