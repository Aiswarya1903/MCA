create database student;
use student;

create table department(
	d_id int primary key,
    d_name varchar(40));
    
insert into department values
	(101,"dbms"),
    (102,"Acn"),
    (104,"Statistics");
    
create table student(
	s_id int primary key,
    s_name varchar(20),
    mark int,
    percentage int,
    d_id int,
    foreign key(d_id) references department(d_id));
    
insert into student values
	(10,"misira",50,60,101),
    (11,"chai",40,30,102);
    
create table institution(
	i_id int primary key,
    i_name varchar(40),
    city varchar(40),
    no_of_emp int);
    
insert into institution values
	(101,"cet","sreekaryam",100),
    (102,"gec","thrissur",50);
    
create table staff(
	st_id int primary key,
    st_name varchar(40),
    d_id int,
    desig varchar(25),
    i_id int,
    salary int,
    city varchar(40),
    foreign key(d_id) references department(d_id),
    foreign key(i_id) references institution(i_id));
    
insert into staff values
	(1001,"misira",101,"prof",101,20000,"sreekaryam");
    
#display details of all prof whose salary >10000
select st_id,st_name,d_id,salary
from staff
where salary > 10000;

#student details sorted in department wise
select s.s_id,s.s_name,s.mark,d.d_id,d.d_name
from student as s
join department as d
on s.d_id=d.d_id
order by d.d_id;

#display student names with marks percentage > 80 and <90
select s_name,mark,percentage
from student
where percentage between 50 and 80;

#update salary of professors by 10%
update staff
set salary=salary+salary * 0.1
where desig='prof';

select st_name,salary
from staff;

SET SQL_SAFE_UPDATES = 0;

    