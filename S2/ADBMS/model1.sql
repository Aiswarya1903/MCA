create database sales;
use sales;
create table salesman(
	salesman_id int primary key,
    name varchar(50) not null,
    city varchar(40),
    commision varchar(50));

insert into salesman values
	(101,"Paul Adam","mumbai","7000"),
    (102,"Arandrew","banglore","700"),
    (105,"jacod","pune","500");
    
-- Add more customers from New York
INSERT INTO customer VALUES
    (17, 'Michael', 'New York', 'B', 102),
    (18, 'Sarah', 'New York', 'A', 101);

-- Add corresponding orders
INSERT INTO orders VALUES
    (548, 25000, '2012-10-11', 17, 102),
    (549, 35000, '2012-10-12', 18, 101);
    
create table customer(
	customer_id int primary key,
    customer_name varchar(25),
    city varchar(40),
    grade varchar(2),
    salesman_id int,
    FOREIGN KEY customer(salesman_id) references salesman(salesman_id));
    
insert into customer values
	(10,"jancy","mumbai","A",101),
    (11,"princy","delhi","A",102),
    (15,"lanny","punjab","C",101);
    
insert into customer values
	(16,"prince","Newyork","A",102);

create table orders(
	ord_no int primary key,
    purch_amnt int,
    ord_date date,
    customer_id int,
    salesman_id int,
    FOREIGN KEY (customer_id) references customer(customer_id),
    FOREIGN KEY (salesman_id) references salesman(salesman_id));
    
insert into orders values
	(541,10000,'2012-10-10',10,101),
    (543,60000,'2012-10-10',11,102),
    (547,89900,'2012-10-10',10,101);

select * from orders;

#find all order details issued by the salesman 'paul adam'
select ord_no,purch_amnt,ord_date,name
from orders as o
join salesman as s 
on o.salesman_id=s.salesman_id
where s.name="Paul Adam";

#find the order values greater than the average order value on 10 oct 2012
select ord_no,purch_amnt as order_value
from orders
where ord_date='2012-10-10'
AND purch_amnt>(select avg(purch_amnt) from orders where ord_date='2012-10-10');

#find all orders generated in new york city
select ord_no,purch_amnt
from orders as o
join customer as c
on o.customer_id=c.customer_id
where c.city='New York';

#display grade of the customer with order no="543"
select grade 
from customer as c
join orders as o
on c.customer_id=o.customer_id
where o.ord_no=543;
    
