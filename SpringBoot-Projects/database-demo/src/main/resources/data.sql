-- uncomment this while running jdbc to create the table
/*create table person
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);
*/


INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
   VALUES (10001, 'Rick', 'NYC', CURRENT_DATE()),
   (10002,'Mokito','Tokyo', CURRENT_DATE()),
   (10003,'Morty','Texas',CURDATE());
