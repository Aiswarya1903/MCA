create database books;
use books;

create table book(
	book_id int primary key,
    title varchar(25),
    author varchar(20),
    price int,
    copies_available int);
insert into book values
	(100,"ram c/o","sarath",300,100),
    (101,"malgudi","Rk narayan",270,50);

create table member(
	member_id int primary key,
    name varchar(20),
    contact varchar(10),
    join_date date);
    
insert into member values
	(10,"Aishu",'9089786756','2023-12-19'),
    (11,"misira",'1232435465','2012-10-09');

create table issue(
	issue_id int,
    member_id int,
    book_id int,
    issue_date date,
    return_date date,
    primary key(issue_id,member_id,book_id),
    foreign key(member_id)references member(member_id),
    foreign key(book_id) references book(book_id));
    
insert into issue values
	(1000,10,100,'2024-10-12','2024-10-15');
    
#4.	Create a trigger on the Issue table that decrements copies_available in the corresponding Book record whenever a new issue is recorded.

delimiter $$
create trigger copies_available 
after insert on issue
for each row
BEGIN
	update book
    set copies_available=copies_available-1
    where book_id=new.book_id;
END $$
DELIMITER ;

insert into issue values
	(10001,10,100,'2024-05-10','2024-05-20');
insert into issue values
	(1001,10,100,'2024-05-10',null);
select * from book;

#view that displays list of book currently used along with the member names who borrrowed them

create view current_borrowed as
select b.title,m.name
from member as m
join issue as i
on m.member_id=i.member_id
join book as b
on b.book_id=i.book_id
where i.return_date is null;

select * from current_borrowed;

#Write a query to calculate the total number of books currently issued to a member with member_id = 10.
select count(book_id) as count
from issue 
where member_id=10;

#Write a query to find the members who have borrowed books by a specific.author
select m.name,b.author,i.issue_id
from issue as i
join book as b
on b.book_id=i.book_id
join member as m
on m.member_id=i.member_id
where b.author='sarath';



	
