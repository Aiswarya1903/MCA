create database hotel;
use hotel;

create table hotel(
	h_id int primary key,
    h_name varchar(20),
    no_of_rooms int,
    rate int);
insert into hotel values
	(101,"paramount",14,1000),
    (102,"nandanam",10,800);
    
create table guest(
	g_id int primary key,
    g_name varchar(25),
    address varchar(40),
    phone_no int,
    no_of_days int,
    h_id int,
    foreign key(h_id) references hotel(h_id));

insert into guest values
	(10,"Aishu","kuppakkad house kulavanmokku",9089786767,5,101),
    (11,"pookie","kallikkad house palakkad",8976564534,3,102);
    
create table staff(
	s_id int primary key,
    s_name varchar(25),
    h_id int,
    salary int,
    design varchar(20),
    foreign key(h_id) references hotel(h_id));
    
insert into staff values
	(1,"misi",101,1000,"cleaner"),
    (2,"chai",101,10000,"receptionist");
    
#find the guest stayed in paramount hotel
select g_name
from guest
where h_id=(select h_id from hotel where h_name="paramount");

#find hotel names having their guest stayed more than 3 days
select h_name as name
from hotel
where h_id=(select h_id from guest where no_of_days>3);

#display the details of cleaner of paramount hotel
select s_id,s_name
from staff
where design="cleaner" and 
h_id=(select h_id from hotel where h_name="paramount");

#details of staffs whose salary greater than the average salary of all the staffs
select s_id,s_name 
from staff
where salary>(select avg(salary) from staff);