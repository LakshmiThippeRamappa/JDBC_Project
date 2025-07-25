-- Create database
CREATE DATABASE IF NOT EXISTS wipro;

-- Use the database
USE wipro;

-- Create department table
CREATE TABLE IF NOT EXISTS department (
    deptId INT PRIMARY KEY AUTO_INCREMENT,
    deptName VARCHAR(100) NOT NULL,
    location VARCHAR(100) NOT NULL
);

-- Optional: Insert sample data
INSERT INTO department (deptName, location) VALUES ('HR', 'New York');
