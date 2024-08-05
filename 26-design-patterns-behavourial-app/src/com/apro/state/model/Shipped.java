package com.apro.state.model;

public class Shipped implements IPacketState{

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		packet.packetState= new Delivered();
		System.out.println("Packet is moved to delivered");
		
	}

	@Override
	public void previous(Packet packet) {
		// TODO Auto-generated method stub
		packet.packetState=new Ordered();
		System.out.println("Packet is moved to ordered");
		
	}

	@Override
	public void current(Packet packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is in Shipped state");
		
	}

}
