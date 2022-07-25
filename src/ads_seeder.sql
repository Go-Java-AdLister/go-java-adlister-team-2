USE adlister_db;

INSERT INTO ads (user_id, title, description, category, likes, isFlagged)
VALUES (1, 'Johnny Depp won', 'So glad Johnny Depp won the trial', 'Entertainment', 0, false),
       (2, 'My cat survived', 'The noble feline made it through surgery', 'News', 0, false),
       (3, 'Winter is coming', 'Winter is like an Alaskan Spring in Texas, it''s on its way soon...', 'Weather', 0,
        false),
       (4, 'I bought a boat', 'Now I can go deep-sea fishing anytime!', 'Other', 0, false);
