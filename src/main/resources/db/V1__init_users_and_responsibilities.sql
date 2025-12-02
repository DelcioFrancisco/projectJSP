-- Create responsibility table
CREATE TABLE responsibility (
                                id INT PRIMARY KEY AUTO_INCREMENT,
                                description VARCHAR(100) NOT NULL
);

-- Create user table
CREATE TABLE users (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       name VARCHAR(100) NOT NULL,
                       responsibility_id INT,
                       FOREIGN KEY (responsibility_id) REFERENCES responsibility(id)
);

-- Insert some responsibilities
INSERT INTO responsibility (name) VALUES ('Admin');
INSERT INTO responsibility (name) VALUES ('Developer');
INSERT INTO responsibility (name) VALUES ('Manager');

-- Insert some users
INSERT INTO users (name, responsibility_id) VALUES ('Alice', 1);
INSERT INTO users (name, responsibility_id) VALUES ('Bob', 2);
INSERT INTO users (name, responsibility_id) VALUES ('Charlie', 3);
