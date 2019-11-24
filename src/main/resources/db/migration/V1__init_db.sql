create table company (id bigint not null auto_increment, activity varchar(255), employee_number integer not null, name varchar(255), primary key (id)) engine=InnoDB;
create table production (id bigint not null auto_increment, full_name varchar(255), purchase_price integer not null, shelf_life date, units varchar(255), primary key (id)) engine=InnoDB;
create table supply (id bigint not null auto_increment, capacity integer not null, date date, price integer not null, company_id bigint not null, production_id bigint not null, primary key (id)) engine=InnoDB;
alter table supply add constraint FKadnh6bild4ib12geq6hkp35oa foreign key (company_id) references company (id);
alter table supply add constraint FK94rv7jtks63a8vn9qhn643gs foreign key (production_id) references production (id);