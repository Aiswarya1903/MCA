create database department;
use department;

create table department(
	dept_no int primary key,
    dept_name varchar(25),
    location varchar(20));
    
insert into department values
	(100,"MCA","newyork"),
    (101,"stati","london");
create table employee(
	emp_no int primary key,
    emp_name varchar(25),
    salary int,
    dept_no int,
    foreign key(dept_no) references department(dept_no));
insert into employee values
	(1,"Aishu",20000,100),
    (2,"pookie",8000,101),
    (3,"chai",80999,100);
    
#Write a query to display the details of employees who work in the department located in ‘New York’.
select * 
from employee
where dept_no=(select dept_no from department where location="newyork");

#. Find the number of employees in each department 
select count(emp_no) as count,dept_no
from employee
group by dept_no;

select count(emp_no) as count ,d.dept_name as dept
from employee as e
join department as d
on e.dept_no=d.dept_no
group by d.dept_no;

#Write a query to increase the salary of all employees in the ‘mca’ department by 10%
update employee 
set salary=salary+salary*0.1
where dept_no=(select dept_no from department where dept_name="MCA");

select * from employee;

#Write a stored procedure CheckAndPromoteEmployee that:
#•	Takes one input: p_emp_no (Employee number)
#	Checks if the salary of that employee is less than 30000
#	If yes, increase their salary by 5000
#	If not, just print a message saying "No promotion needed"

call CheckAndPromoteEmployee(2);
select * from employee;

delimiter $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `CheckAndPromoteEmployee`(in p_emp_no int)
BEGIN
	declare res varchar(20);
    IF ( select salary from employee where emp_no=p_emp_no ) < 30000
    then
		update employee
        set salary=salary+5000
        where emp_no=p_emp_no;
        set res="promoted";
	else
		set res="no promotion needed";
		
	end if;
    select res as message;
END $$
DELIMITER ;


