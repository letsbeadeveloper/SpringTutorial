DROP TABLE IF EXISTS NATION;
DROP TABLE IF EXISTS country;

CREATE TABLE country (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);