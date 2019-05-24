create table userType (
  id integer not null auto_increment,
  type varchar(20) not null,
  primary key (id)
);

create table person (
  id integer not null auto_increment,
  name varchar(30) not null,
  surname varchar(30) not null,
  dni integer not null,
  birthDate date not null,
  userType integer not null,
  cuil_cuit varchar(15) not null,
  email varchar(50) not null,
  username varchar(30) not null,
  password varchar(30) not null,
  phoneNumber varchar(20) not null,
  address varchar(100) not null,
  rating integer not null,
  bussinessName varchar(50) not null,
  primary key (id),
  foreign key (userType) references userType(id)
);

create table license (
  id integer not null auto_increment,
  expirationDate date not null,
  licenseType varchar(5) not null,
  emergencyNumber varchar(20) not null,
  primary key (id)
);

create table truckDriver (
  id integer not null auto_increment,
  idPerson integer not null,
  idLicense integer not null,
  primary key (id),
  foreign key (idPerson) references person(id),
  foreign key (idLicense) references license(id)
);

create table truckType (
  id integer not null auto_increment,
  type varchar(30) not null,
  primary key (id)
);

create table truck (
  id integer auto_increment not null,
  owner integer not null,
  plate varchar(10) not null,
  brand varchar (30) not null,
  model varchar (30) not null,
  year smallint not null,
  tare smallint not null,
  maxWeigth integer not null,
  maxVolume integer not null,
  axlesNum integer not null,
  chassisNum integer not null,
  truckType integer not null,
  primary key (id),
  foreign key (owner) references truckDriver(id),
  foreign key (truckType) references truckType(id)
);

create table shipment (
  id integer not null auto_increment,
  origin varchar(50) not null,
  destination varchar(50) not null,
  distance smallint not null,
  initDate date not null, 
  arrivalDate date not null,
  primary key (id)
); /*Agergar coordenadas*/

create table truckDriverTravel (
  id integer not null auto_increment,
  truck integer not null,
  shipment integer not null,
  primary key (id),
  foreign key (truck) references truck(id),
  foreign key (shipment) references shipment(id)
);

create table userTravel (
  id integer not null auto_increment,
  truckQuantity integer not null,
  shipment integer not null,
  loadType integer not null, /*hay que hacer la tabla de tipos de carga*/
  product integer not null, /*hay que hacer la tabla de productos*/
  primary key (id),
  foreign key (shipment) references shipment(id)/*,
  foreign key (loadType) references loadType(id),
  foreign key (product) references product(id)*/
);


