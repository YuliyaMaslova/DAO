create table if not exists CUSTOMERS(
                          id serial primary key,
                          name varchar(15),
                          surname varchar(25),
                          age INTEGER,
                          phone_number varchar(25)
);

create table if not exists ORDERS(
                       id serial primary key,
                       date DATE,
                       product_name varchar(255),
                       amount INTEGER,
                       customer_id INTEGER references CUSTOMERS(id)
);