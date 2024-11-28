DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS portfolio_item;

-- intentionally naming this table as customer as "user" has some issues
CREATE TABLE customer (
    id int AUTO_INCREMENT primary key,
    name VARCHAR(50),
    balance int
);

CREATE TABLE portfolio_item (
    id int AUTO_INCREMENT primary key,
    customer_id int,
    ticker VARCHAR(10),
    quantity int,
    foreign key (customer_id) references customer(id)
);

insert into customer(name, balance)
    values
        ('Bob', 7000),
        ('Alice', 5000),
        ('John', 2000);