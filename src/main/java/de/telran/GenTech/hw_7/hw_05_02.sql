create table clients
(
    id          int primary key auto_increment,
    first_Name  varchar(128),
    second_Name varchar(128),
    email       varchar(128),
    country     varchar(128)
);
insert into clients (first_Name, second_Name, email, country)
values ("John", "Smith", "smith@example.com", "USA"),
       ("Emma", "Johnson", "emma.johnson@example.com", "USA"),
       ("Michael", "Williams", "michael.williams@example.com", "UK"),
       ("Sofia", "Brown", "sophia.brown@example.com", "UK"),
       ("James", "Jones", "james.jones@example.com", "DE");


https://dbdiagram.io/d/social-65c3ac87ac844320aeab0fff