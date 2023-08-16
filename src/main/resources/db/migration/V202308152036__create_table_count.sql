create sequence public.seq_count;

create table public.count(
    id numeric(20) not null,
    number varchar(40) not null,
    agency varchar(9) not null,
    balance decimal(10, 2) not null,
    expirationDate date not null
);