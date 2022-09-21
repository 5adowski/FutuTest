INSERT INTO CAMPAIGNS(NAME, KEY_WORDS, BID, FUND, STATUS, TOWN, RADIUS) VALUES
('test name1', ARRAY['hello', 'world', 'from', '1'], 25000, 20000, 'ON', 'Warsaw', 12),
('test name2', ARRAY['hello', 'world', 'from', '2'], 35000, 30000, 'ON', 'Warsaw', 12),
('test name3', ARRAY['hello', 'world', 'from', '3'], 12000, 9999, 'ON', 'Warsaw', 12),
('test name4', ARRAY['hello', 'world', 'from', '4'], 1099.99, 1212.11, 'ON', 'Warsaw', 12);
INSERT INTO TOWNS(NAME) VALUES
('Warsaw'),
('Cracow'),
('Gdansk'),
('Sopot'),
('Poznan');
INSERT INTO KEYWORDS(NAME) VALUES
('random'),
('words'),
('inserted'),
('z palca'),
('manually');