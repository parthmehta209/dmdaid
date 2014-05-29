# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table company (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  constraint pk_company primary key (id))
;

create table computer (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  introduced                datetime,
  discontinued              datetime,
  company_id                bigint,
  constraint pk_computer primary key (id))
;

create table contact (
  id                        integer auto_increment not null,
  relation                  varchar(255),
  groupname                 varchar(255),
  username                  varchar(255),
  name                      varchar(255),
  address                   varchar(255),
  miscinfo                  varchar(255),
  email                     varchar(255),
  constraint pk_contact primary key (id))
;

create table phone (
  id                        integer auto_increment not null,
  number                    varchar(255),
  type                      varchar(255),
  contact_id                integer,
  constraint pk_phone primary key (id))
;

create table qolstatement (
  email                     varchar(255) not null,
  statement                 LONGTEXT,
  constraint pk_qolstatement primary key (email))
;

create table account (
  email                     varchar(255) not null,
  firstname                 varchar(255),
  lastname                  varchar(255),
  password                  varchar(255),
  awareid                   varchar(255),
  age                       integer,
  constraint pk_account primary key (email))
;

alter table computer add constraint fk_computer_company_1 foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_computer_company_1 on computer (company_id);
alter table phone add constraint fk_phone_contact_2 foreign key (contact_id) references contact (id) on delete restrict on update restrict;
create index ix_phone_contact_2 on phone (contact_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table company;

drop table computer;

drop table contact;

drop table phone;

drop table qolstatement;

drop table account;

SET FOREIGN_KEY_CHECKS=1;
