CREATE TABLE loads(
load_id INT PRIMARY KEY AUTO_INCREMENT,
shipping_city VARCHAR(255) NOT NULL,
shipping_state VARCHAR(12) NOT NULL,
receiving_city VARCHAR(255) NOT NULL,
receiving_state VARCHAR(12) NOT NULL,
weight INT,
commodity VARCHAR(255) NOT NULL,
shipping_date DATE,
receiving_date DATE
);