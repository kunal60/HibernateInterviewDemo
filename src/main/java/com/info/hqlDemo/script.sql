CREATE TABLE books (
   book_id VARCHAR2(20),
   title VARCHAR2(50)
      CONSTRAINT title_not_null NOT NULL,
   author_last_name VARCHAR2(30)
      CONSTRAINT last_name_not_null NOT NULL,
   author_first_name VARCHAR2(30),
   rating NUMBER,
   CONSTRAINT books_pk PRIMARY KEY (book_id),
   CONSTRAINT rating_1_to_10 CHECK (rating IS NULL OR
      (rating >= 1 and rating <= 10)),
   CONSTRAINT author_title_unique UNIQUE (author_last_name, title));
   
   
   
   INSERT INTO books VALUES ('A1111', 'Moby Dick', 'Melville', 'Herman', 10);
INSERT INTO books VALUES ('A2222', 'Get Rich Really Fast', 'Scammer', 'Ima', 1);
INSERT INTO books VALUES ('A3333', 'Finding Inner Peace', 'Blissford', 'Serenity', null);
INSERT INTO books VALUES ('A4444', 'Great Mystery Stories', 'Whodunit', 'Rodney', 5);
INSERT INTO books VALUES ('A5555', 'Software Wizardry', 'Abugov', 'D.', 10);

commit;