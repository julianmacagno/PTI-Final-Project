create table userType (
  userType_key integer not null auto_increment,
  type varchar(20) not null,
  primary key (userType_key)
);

create table person (
  person_key integer not null auto_increment,
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
  primary key (person_key),
  foreign key (userType) references userType(userType_key)
);

create table license (
  licence_key integer not null auto_increment,
  expirationDate date not null,
  licenseType varchar(5) not null,
  emergencyNumber varchar(20) not null,
  primary key (licence_key)
);

create table truckDriver (
  truckDriver_key integer not null auto_increment,
  person_key integer not null,
  licence_key integer not null,
  available char(1) not null,
  primary key (truckDriver_key),
  foreign key (person_key) references person(person_key),
  foreign key (licence_key) references license(licence_key)
);

create table truckType (
  truckType_key integer not null auto_increment,
  type varchar(30) not null,
  primary key (truckType_key)
);

create table truck (
  truck_key integer auto_increment not null,
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
  primary key (truck_key),
  foreign key (owner) references truckDriver(truckDriver_key),
  foreign key (truckType) references truckType(truckType_key)
);

create table productType (
  productType_key int not null auto_increment,
  type varchar (30) not null,
  primary key (productType_key)
);

create table product (
  product_key int not null auto_increment,
  name varchar(30) not null,
  productType_key int not null,
  primary key(product_key),
  foreign key (productType_key) references productType(productType_key)
);

create table shipment (
  shipment_key integer not null auto_increment,
  origin varchar(30) not null,
  destination varchar(30) not null,
  distance smallint not null,
  initDate date not null, 
  arrivalDate date not null,
  acepted char(1) not null,
  product integer not null,
  quantity int not null,
  unit varchar(5) not null,
  owner int not null, 
  primary key (shipment_key),
  foreign key (product) references product(product_key),
  foreign key (owner) references person(person_key)
);

create table truckDriverTravel (
  truckDriverTravel_key integer not null auto_increment,
  truck integer not null,
  shipment integer not null,
  primary key (truckDriverTravel_key),
  foreign key (truck) references truck(truck_key),
  foreign key (shipment) references shipment(shipment_key)
);

create table userTravel (
  userTravel_key integer not null auto_increment,
  truckQuantity integer not null,
  shipment integer not null,
  primary key (userTravel_key),
  foreign key (shipment) references shipment(shipment_key)
);

create table product_truck (
  product_truck_key int not null auto_increment,
  product_key int not null,
  truck_key int not null,
  primary key (product_truck_key),
  foreign key (product_key) references product(product_key),
  foreign key (truck_key) references truck(truck_key)
);

create table calification (
  calification_key int not null auto_increment,
  person_key int not null,
  score int not null,
  review varchar(400) not null,
  primary key (calification_key),
  foreign key (person_key) references person(person_key)
);