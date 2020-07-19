CREATE TABLE patients (
    id BIGSERIAL NOT NULL PRIMARY KEY,
    full_name VARCHAR(200) NOT NULL,
    email_address VARCHAR(200) NOT NULL
);