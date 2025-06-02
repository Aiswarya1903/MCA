create database student;
use student;

create table student(
	rollno int primary key,
    name varchar(25),
    address varchar(40),
    totalmarks int);

insert into student values
	(100,"aishu","Kuppakkad kulavanmokku",100),
    (101,"pookie","kallikkad",100),
    (103,"chaii","thrissue",99);

insert into student values
	(104,"nanduT","kannur",99);
		
    
create table course(
	cid int primary key,
    coursename varchar(20),
    fees int,
    student_count int);
    
insert into course values
	(300,"DBMS",500,10),
    (301,"ACN",800,5);
    
create table admission(
	rollno int,
    cid int,
    sem varchar(1),
    primary key(rollno,cid),
    foreign key(rollno) references student(rollno),
    foreign key(cid) references course(cid));
    
insert into admission values
	(100,300,1),
    (101,301,1);
insert into admission values
	(103,300,1);
insert into admission values
	(104,300,2);

select * from admission;
 
 
 #create a trigger that updates the student_count when new admision takes place
delimiter $$
create trigger updateadmissionS
after insert on admission
for each row
BEGIN
	UPDATE COURSE
    SET student_count=student_count+1
    where cid=new.cid;
END $$
DELIMITER ;

#4.	Create a view from the above schema to list the names and addresses of students who are not enrolled in any course.
create view no_course_stud as
select name,address 
from student 
where rollno not in (select rollno from admission);

select * from no_course_stud;

#5.	Find the total fees to be remitted by a student whose rollno is 100
select sum(c.fees) as fee
from course as c
join admission as a
on c.cid=a.cid
where a.rollno=100;

#write a query to find the number of students in each semester
select a.sem as sem,count(a.sem) as count
from admission as a
group by a.sem;



