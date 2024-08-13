CREATE TABLE rin_book.mst_genres (
    id integer primary key,
    genre varchar(20) not null,
    add_date timestamp default current_timestamp,
    upd_date timestamp default current_timestamp,
    version integer not null default 1,
    is_valid boolean not null default true
);

