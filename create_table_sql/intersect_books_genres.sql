CREATE TABLE rin_book.intersect_books_genres (
    book_id integer,
    genre_id integer,
    FOREIGN KEY(book_id) REFERENCES trn_books(id),
    FOREIGN KEY(genre_id) REFERENCES mst_genres(id),
    primary key(book_id,genre_id)
);

