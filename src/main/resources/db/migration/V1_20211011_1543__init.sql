CREATE TABLE account
(
    account_id SERIAL,
    name       TEXT NOT NULL
);
INSERT INTO account (account_id, name)
VALUES (1, 'Test');
