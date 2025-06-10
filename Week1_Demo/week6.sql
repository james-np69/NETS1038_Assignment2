CREATE DATABASE week6;
USE week6;

CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    userName VARCHAR(100),
    userEmail VARCHAR(100),
    password VARCHAR(100),
    preferredName VARCHAR(100),
    name VARCHAR(100)
);