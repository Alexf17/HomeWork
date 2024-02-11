create table comments
(
    id         int primary key auto_increment,
    created_at timestamp default current_timestamp,
    title      varchar(64),
    content    varchar(128) not null,
    author_id  int          not null,
    track_id   int          not null,
    foreign key (author_id) references users (id),
    foreign key (track_id) references tracks (id)
);

insert into comments(title, content, author_id, track_id)
values ("Hello", "Good track", 2, 2),
       ("Hi", "Hello world", 2, 1),
       ("Good", "Nice", 2, 2),
       ("No", "Good track", 2, 3);

select tracks.title, count(*) as comments_count
from tracks
         join comments on comments.track_id = tracks.id
group by tracks.title;

-- И там у меня видимо пропущенная домашка за 10.01 висит не проверенная , гляньне плиз.