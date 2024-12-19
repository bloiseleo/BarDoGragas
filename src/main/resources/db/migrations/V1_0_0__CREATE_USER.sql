CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    profileIconName VARCHAR(12) NOT NULL,
    password TEXT NOT NULL,
    email TEXT NOT NULL
);