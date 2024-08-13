CREATE TABLE rin_book.trn_books (
    id integer primary key,
    title varchar(50) not null,
    author varchar(30),
    edition integer,
    issue_date timestamp,
    add_date timestamp default current_timestamp,
    upd_date timestamp default current_timestamp,
    version integer not null default 1,
    is_valid boolean not null default true
);
