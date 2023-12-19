--test veritabanınızda employee isimli sütun bilgileri
--id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);


--_______________________________________________________________________________________________________
---------------------------------------------------------------------------------------------------------
--Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (name, birthday, email) values ('Nancey Chauvey', null, 'nchauvey0@histats.com');
insert into employee (name, birthday, email) values ('Ellyn Rohfsen', '1995/09/29', 'erohfsen1@wunderground.com');
insert into employee (name, birthday, email) values ('Josepha McCrone', '1964/03/29', 'jmccrone2@blogs.com');
insert into employee (name, birthday, email) values ('Carlos Crutch', '1998/08/11', null);
insert into employee (name, birthday, email) values ('Janette Malafe', '1963/09/14', 'jmalafe4@jugem.jp');
insert into employee (name, birthday, email) values ('Margarette Boothroyd', '1991/05/04', 'mboothroyd5@friendfeed.com');
insert into employee (name, birthday, email) values ('Andee Millward', '1959/05/13', 'amillward6@tinyurl.com');
insert into employee (name, birthday, email) values ('Abran Trewett', '1982/03/15', 'atrewett7@state.gov');
insert into employee (name, birthday, email) values ('Odo Carwardine', '1982/08/13', 'ocarwardine8@bravesites.com');
insert into employee (name, birthday, email) values ('Dalenna Stolting', '2005/10/03', 'dstolting9@yelp.com');
insert into employee (name, birthday, email) values ('Rosanna Penketh', '1979/06/06', 'rpenketha@hexun.com');
insert into employee (name, birthday, email) values ('Trumann Lethcoe', '1984/04/25', 'tlethcoeb@cmu.edu');
insert into employee (name, birthday, email) values ('Ellsworth Opfer', '1994/02/15', 'eopferc@comsenz.com');
insert into employee (name, birthday, email) values ('Torre Normanvell', '1953/04/17', 'tnormanvelld@hc360.com');
insert into employee (name, birthday, email) values ('Nanice Ditchburn', '1977/10/29', 'nditchburne@clickbank.net');
insert into employee (name, birthday, email) values ('Tildy Hansill', '1998/02/20', 'thansillf@geocities.jp');
insert into employee (name, birthday, email) values ('Ron Ingliby', '1954/08/09', 'ringlibyg@tinypic.com');
insert into employee (name, birthday, email) values ('Ramonda Bissatt', '1991/03/01', 'rbissatth@is.gd');
insert into employee (name, birthday, email) values ('Nedda Tomasino', '2005/05/10', 'ntomasinoi@ustream.tv');
insert into employee (name, birthday, email) values ('Patty Boake', '1988/06/26', 'pboakej@discovery.com');
insert into employee (name, birthday, email) values ('Colly Neeves', '1979/11/12', 'cneevesk@marriott.com');
insert into employee (name, birthday, email) values ('Mela Fenton', '1993/04/29', 'mfentonl@narod.ru');
insert into employee (name, birthday, email) values ('Sisile Yardy', '1997/09/29', 'syardym@example.com');
insert into employee (name, birthday, email) values ('Sammie Fewtrell', '1965/10/01', null);
insert into employee (name, birthday, email) values ('Jewelle Blackboro', '1972/05/06', 'jblackboroo@artisteer.com');
insert into employee (name, birthday, email) values ('Donnajean Bruun', null, 'dbruunp@unc.edu');
insert into employee (name, birthday, email) values ('Nikita Borham', '1974/11/13', 'nborhamq@hp.com');
insert into employee (name, birthday, email) values ('Marv Andreev', '1966/07/03', 'mandreevr@tmall.com');
insert into employee (name, birthday, email) values ('Jeffrey Ezele', '1967/05/20', 'jezeles@vimeo.com');
insert into employee (name, birthday, email) values ('Rozanne McGrory', '1986/02/26', 'rmcgroryt@wufoo.com');
insert into employee (name, birthday, email) values ('Karyl Najera', '1994/06/09', 'knajerau@google.de');
insert into employee (name, birthday, email) values ('Pru Buckles', '1967/04/12', null);
insert into employee (name, birthday, email) values ('Chaim Ragot', null, 'cragotw@simplemachines.org');
insert into employee (name, birthday, email) values ('Mart Harfoot', '1954/03/27', 'mharfootx@fema.gov');
insert into employee (name, birthday, email) values ('Inna De Avenell', '1964/09/13', 'idey@comcast.net');
insert into employee (name, birthday, email) values ('Akim Stokes', '1957/03/23', 'astokesz@edublogs.org');
insert into employee (name, birthday, email) values ('Eleonora Grassick', '1985/02/24', null);
insert into employee (name, birthday, email) values ('Vaughn McGebenay', '1959/11/04', null);
insert into employee (name, birthday, email) values ('Lorianna Asple', '1995/10/10', 'lasple12@macromedia.com');
insert into employee (name, birthday, email) values ('Gusti O''Rudden', '1989/05/02', 'gorudden13@google.ru');
insert into employee (name, birthday, email) values ('Clair Coffee', '1994/02/23', 'ccoffee14@who.int');
insert into employee (name, birthday, email) values ('Stephanus Luetkemeyers', '1953/12/30', 'sluetkemeyers15@macromedia.com');
insert into employee (name, birthday, email) values ('Cynthia Boorn', '1975/10/23', 'cboorn16@cdc.gov');
insert into employee (name, birthday, email) values ('Christiana Wimpenny', '1969/01/09', 'cwimpenny17@yellowpages.com');
insert into employee (name, birthday, email) values ('Waiter Ravilus', '1958/08/07', 'wravilus18@i2i.jp');
insert into employee (name, birthday, email) values ('Regina Takos', '1996/08/19', 'rtakos19@cbslocal.com');
insert into employee (name, birthday, email) values ('Dollie Blything', '1973/10/09', 'dblything1a@blogspot.com');
insert into employee (name, birthday, email) values ('Valaree Lain', '1960/01/02', 'vlain1b@globo.com');
insert into employee (name, birthday, email) values ('Orelia Gehring', null, 'ogehring1c@webs.com');
insert into employee (name, birthday, email) values ('Whitney Locke', '1986/08/17', 'wlocke1d@theatlantic.com');


--_______________________________________________________________________________________________________
---------------------------------------------------------------------------------------------------------
--Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET name = 'Fatih KARA',
	birthday = '1995-08-18',
	email = 'fkara1667@gmail.com'
WHERE id = 1;

UPDATE employee
SET name = 'Yasin KARA',
	email = 'ykara67@gmail.com'
WHERE name = 'Ellyn Rohfsen';

UPDATE employee
SET name = 'Hatice KARA',
	email = 'hkara67@gmail.com'
WHERE name LIKE '%Whitney%';

UPDATE employee
SET birthday = '1993-09-11'
WHERE name = 'Yasin KARA';

UPDATE employee
SET birthday = '1971-06-23'
WHERE name LIKE '%Hatice%';

UPDATE employee
SET name = 'Murat KARA',
	birthday = '1970-06-23'
WHERE EXTRACT(YEAR FROM birthday::date) = 1972;


--_______________________________________________________________________________________________________
---------------------------------------------------------------------------------------------------------
--Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE EXTRACT(YEAR FROM birthday::date) < 1960;

DELETE FROM employee
WHERE name LIKE '% % %';

DELETE FROM employee
WHERE id = 3;

DELETE FROM employee
WHERE name LIKE 'O%';

DELETE FROM employee
WHERE email IS NULL;