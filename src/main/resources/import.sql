-- Create sequence first
CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

-- Then insert your data
INSERT INTO Episode(id,title,description) VALUES (nextval('hibernate_sequence'), 'e1', 'Setup and dev mode');
INSERT INTO Episode(id,title,description) VALUES (nextval('hibernate_sequence'), 'e2', 'Compile native');
INSERT INTO Episode(id,title,description) VALUES (nextval('hibernate_sequence'), 'e3', 'REST Client');