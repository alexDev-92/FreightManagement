CREATE TABLE loads(
load_id BIGINT AUTO_INCREMENT,
shipping_city VARCHAR(255),
shipping_state VARCHAR(12),
receiving_city VARCHAR(255),
receiving_state VARCHAR(12),
weight BIGINT,
commodity VARCHAR(255),
shipping_date DATE,
receiving_date DATE, 
PRIMARY KEY (load_id),
);