DROP TABLE IF EXISTS employee;
 
CREATE TABLE employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL
  
);
 
INSERT INTO employee (first_name, last_name) VALUES
  ('James', 'mill')