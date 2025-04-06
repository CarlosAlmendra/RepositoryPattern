CREATE TABLE IF NOT EXISTS users (
     uuid TEXT PRIMARY KEY,
     name TEXT NOT NULL,
     email TEXT NOT NULL,
     password TEXT NOT NULL
);
