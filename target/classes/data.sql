 


  DROP TABLE IF EXISTS customer;

  create table customer (id integer not null, customer_id varchar(255),  customer_type integer,first_name varchar(255), last_name varchar(255), joining_date timestamp, primary key (id));
  insert into customer values (1,'vinil@gmail.com',3,'vinil','v','2017-01-01'),
                               (2,'testone@gmail.com',2,'xxx','testcustomer','2015-01-01'),  
                               (3,'testtwo@gmail.com',1,'xxx','TestAffiliate','2016-01-01');
                               



