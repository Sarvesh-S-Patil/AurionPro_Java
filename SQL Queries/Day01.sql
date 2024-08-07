use organization;

INSERT INTO DEPT values (10,'Accounting','New York');
INSERT INTO DEPT values (20,'Research','Dallas');
INSERT INTO DEPT values (30,'Sales','Chiacago');
INSERT INTO DEPT values (40,'Operations','Boston');

INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'1981-05-1',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'1981-06-9',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'1981-4-2',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'1981-9-28',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'1981-2-20',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'1981-9-8',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'1981-12-3',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'1981-2-22',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'1981-12-3',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'1982-12-09',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'1983-1-12',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'1982-1-23',1300,NULL,10);






















#1. Display all employee names in ascending order

SELECT *
FROM EMP
ORDER BY EMP.empName;


#2. Display all employees(all columns) in department 20 and 30

select *
from emp
where 
deptno = 20 or deptno = 30;

#3. Display all the employees who are managers

select *
from emp
where job='Manager';

#4. Display all the employees whose salary is between 2000 and 5000

select *
from emp
where salary between 2000 and 5000;

#5. Display all the employees whose commission is null

select *
from emp
where commission is null;

#6. Display emp_name,salary,comission,ctc(calculated column)

select *, (emp.salary+emp.commission) as CTC
from emp;


#7. Display hire_date, current_date, tenure(calculated col) of the empl

select hiredate,datediff(curdate(),hiredate) as Tenure
from emp;



#8. Display all the employees whose name starts with s

select *
from emp 
where empName like 's%';


#9. Display unique department numbers from the employee table

select distinct deptNo
from emp;


 #10. Display emp_name and job in lower case

select lower(empName),lower(job)
from emp;

#11. Select top 3 salary earning employee

select *
from emp
order by salary desc
limit 3;


#12. Select clerks and Managers in department 10

select *
from emp
where 
	deptNo=10
    and (job ='clerk' or job = 'manager');
    
    
    
    
#13. Display all clerks in asscending order of the department number 
select *
from emp
where job = 'clerk'
order by deptNo;



#16. Display All employees in the same dept of 'SCOTT' 
select  *
from emp where 
deptno = (
			SELECT deptNO
            FROM EMP
            WHERE EMPNAME ='Scott'
            LIMIT 1
		 );
         
         
         
#17. Employees having same designation of SMITH
select  *
from emp where 
job = (
			SELECT job
            FROM EMP
            WHERE empname ='Smith'
            LIMIT 1
		 );







#18. Employee who are reproting under KING
select *
from emp
where manager = (
					select empNo
                    from emp
                    where empName='KING'
				);



#19. Employees who have same salary of BLAKE
select * 
from emp
where salary = (
				 select salary 
                 from emp 
                 where empName = 'blake'
				);
 
 
#20. Display departmentwise number of employees
select count(deptNo) as employeeCount ,deptNo
from emp
group by deptNo;


#21. Display jobwise number of employees
select count(job) as jobCount ,job
from emp
group by job;


#22. Display deptwise jobwise number of employees
select deptName, job,count(empName) as employeeCount
from emp
inner join dept 
on emp.deptNo=dept.deptNo
group by deptName,job;


#23. Display deptwise  employees greater than  3 
select count(deptNo) as employeeCount ,deptNo
from emp
group by deptNo
having employeeCount>3;


#24. Display designation wise employees count greater than 3 
select count(empName) as jobCount ,job
from emp
group by job
having jobCount>3;



#25. Display Employee name,deptname and location
select emp.empName as EmployeeName ,dept.deptName as departmentName ,dept.departLoc as departmentLocation
from emp
inner join dept
on emp.deptNo = dept.deptNo;


#26. display all deptnames and corresponding employees if ANY
select deptName,empName
from dept
left join emp
on dept.deptNo = emp.deptNo;

#27. dipslay all deptnames where there are no employees
select deptName,empName
from dept
left join emp
on dept.deptNo = emp.deptNo
where emp.deptNo is null;


#28. display deptname wise employee count greater than 3, display in descending order of deptname
select deptName, count(empNo) as employeeCount
from emp
inner join dept
on emp.deptNo = dept.deptNo
group by deptName
having employeeCount >3 
order by deptName desc;

#29. Display all the empname and their manager names as bossName
select A.empName as employee, deptName as departmentName, B.empName as bossName
from emp A 
join emp B
on  A.manager = B.empNo
join dept
on A.deptNo = dept.deptNo
order by bossName;



#29. Display all the empname and their manager names
select deptName as dName,A.empName as eName, B.empName as Managers
from emp A 
join emp B
on  A.manager = B.empNo
join dept
on A.deptNo = dept.deptNo;





