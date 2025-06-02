create database college;
use college;

create table student(
	rollno int primary key,
    name varchar(30),
    marks int not null,
    grade varchar(1),
    city varchar(20));
    
insert into student values
	(101,"anil",78,"C","Pune"),
    (102,"bhumika",93,"A","Mumbai"),
    (103,"Chetan",85,"B","Mumbai"),
    (104,"Dhruv",96,"A","Delhi"),
    (105,"emanuel",12,"F","Delhi"),
    (106,"farah",82,"B","Delhi");
    
select * from student;
select name,grade from student;
#show unique values
select distinct city from student;

#using of where clause
select name from student where city="Mumbai";

#using of between 
select name,marks from student where marks between 80 and 90;

#use limit clause with where clause
select 
name,marks
from student
where marks>70
limit 3;

#using group by clause groups the rows.
select city,count(rollno) as stud_count
from student
group by city;

#find average marks in each city in ascending order
select city ,avg(marks) as mark_avg
from student
group by city
order by avg(marks) asc;

#group by count with grade
select grade,count(rollno) as total
from student
group by grade;

#having clause(used to apply conditions on group by clauses)
#count number of students in each city where max marks cross 90
select city,count(*) as students
from student
where marks=(select max(marks) from student as s where s.city=student.city)
group by city
Having max(marks)>90;


create database payment;
use payment;
create table payment(
	customer_id int primary key,
    customer varchar(45),
    mode varchar(25),
    city varchar(25));
    
insert into payment values
	(101,"Olivia Barret","Netbanking","Poland"),
    (102,"ethan Sinclair","Credit card","Miami"),
    (103,"Maya Hernandez","Credit card","Seattle"),
    (104,"Liam Donovan","Netbanking","Denver"),
    (105,"Sophia nyugen","Credit card","New Oriens"),
    (106,"Caleb Foster","Debit card","Minneapolis"),
    (107,"Ava Patel","Debit card","Phoenix"),
    (108,"Lucas Carter","Netbanking","Boston"),
    (109,"Isabelle Matinez","Netbanking","Nashville"),
    (110,"Jackson Brooks","Credit card","Boston");
    
#find total payment according to each payment method
select mode,count(customer) as payments
from payment
group by mode;







