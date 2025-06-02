create database triggers;
use triggers;

create table product(
	product_id int primary key,
    pname varchar(20),
    price double(3,2),
    qtystock int);

create table sale(
	sale_id int primary key,
    delivery_address varchar(50));
    
insert into sale values
	(100,"aishus home"),
    (200,"anjalihome");
    
create table saleitem(
	sale_id int,
    product_id int,
    qty int,
    FOREIGN KEY(sale_id) references sale(sale_id),
    FOREIGN KEY(product_id) references product(product_id),
    primary key(sale_id,product_id));
    
insert into product values
	(101,"pencil",5,10),
    (102,"pen",3,10);
    
delimiter $$
create trigger updateavailability
after insert on saleitem
for each row
update product set product.qtystock=product.qtystock-new.qty where product_id=new.product_id
$$

    
select * from product;
    
    
    