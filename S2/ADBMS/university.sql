create database university;
use university;

#STUDENT
create table student(
	Name varchar(20),
    Student_no int,
    class int,
    major varchar(10));
    
Insert into student values
	("smith",17,1,"cs"),("brown",8,2,"cs");
    
alter table student add
primary key(student_no);

#COURSE
create table course(
	Course_name varchar(35),
	Course_no varchar(20),
    credit_hours int,
    Department varchar(5));

insert into course values
	("intro to cs","CS1310",4,"CS"),("Data structure","CS3320",4,"CS"),
    ("Discrete mathematics","MATH2410",3,"MATH"),("DBMS","CS3380",3,"CS");
    
alter table course add
primary key(course_no);
    
#SECTION
CREATE TABLE SECTION(
	section_identifier int primary key,
    course_no varchar(20),
    semester varchar(15),
    year int,
    instructor varchar(10));
    
insert into section values
	(85,"MATH2410","FALL",07,"KING"),(92,"CS1310","FALL",07,"ANDERSON"),
    (102,"CS3320","SPRING",08,"KNUTH"),(112,"MATH2410","FALL",08,"CHANG"),
    (119,"CS1310","FALL",08,"ANDERSON"),(135,"CS3380","FALL",08,"STONE");

alter table section add
Foreign key(course_no) references course(course_no);
    
#GRADE_REPORT
create table grade_report(
	student_no int,
    section_identifier int,
    grade varchar(3),
    primary key(student_no,section_identifier),
    foreign key(student_no) references student(student_no),
    foreign key(section_identifier) references section(section_identifier));
    
insert into grade_report values
	(17,112,"B"),(17,119,"c"),(8,85,"a"),
    (8,92,"A"),(8,102,"B"),(8,135,"A");
    
CREATE TABLE PREREQUISITE(
	course_no varchar(20),
    prerequisite varchar(20),
    primary key(course_no,prerequisite),
    foreign key(course_no) references course(course_no),
    foreign key(prerequisite) references course(course_no));
    
insert into prerequisite values
	("CS3380","CS3320"),("CS3380","MATH2410"),("CS3320","CS1310");
    
SELECT * FROM STUDENT;
SELECT * FROM COURSE;
SELECT * FROM SECTION;
SELECT * FROM GRADE_REPORT;
SELECT *FROM PREREQUISITE;

#COURSE AND GRADE OF SMITH
select course.Course_name,grade_report.grade
from student join grade_report
on student.Student_no=grade_report.Student_no
join section on section.section_identifier=grade_report.section_identifier
join course on course.course_no=section.course_no
where student.name="smith";

#list the name of students who took the set of database course offered in fall 2008 and their grades in that section
select student.name
from course join section 
on course.course_no=section.course_no
join grade_report on section.section_identifier=grade_report.section_identifier
join student on grade_report.student_no=student.student_no
where course.course_name="dbms" and section.semester="fall" and section.year=8;

#list the prerequisites of database course
select prerequisite from prerequisite
where course_no=(select course_no from course where course_name="dbms");

select c.course_name
from course join prerequisite
on course.course_no=prerequisite.course_no
join course as c on prerequisite.prerequisite=c.course_no
where course.course_name='DBMS';



CREATE VIEW STUDENTS AS SELECT * FROM STUDENT WHERE CLASS=2;
SELECT * FROM STUDENTS;

    
    