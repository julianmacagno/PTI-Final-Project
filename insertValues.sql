insert into userType (type)
values ('Despachante'), ('Camionero');

insert into person (name, surname, dni, birthDate, userType, cuil_cuit, email, username, password, phoneNumber, address, rating, bussinessName) 
values ('Julian', 'Macagno', '40028514', '1997-02-04', 2, '20400285145', 'julian.macagno55@gmail.com', 'julianmacagno', 'rivadavia850', '3572552389', 'Rivadavia 850, Oncativo, Cordoba, Argentina', 5, 'Macagno S.A.');

insert into license (expirationDate, licenseType, emergencyNumber) 
values ('2019-08-02', 'B1', '3572466395');

insert into truckDriver (idPerson, idLicense)
values (1,1);

insert into truckType (type) 
values ('Cerealeros'), ('Cisterna Alimenticios'), ('Cisterna Combustibles'), ('Cisterna Quimicos'), ('Playo - Maquinarias'), ('Cargas Generales - Tarimas'), ('Contenedores'), ('Animales'), ('Frigorificos'), ('Volcadores');

insert into truck (owner, plate, brand, model, year, tare, maxWeigth, maxVolume, axlesNum, chassisNum, truckType) 
values (1, 'PHD 862', 'Scania', 'Baby', 1962, 12000, 33000, 20, 4, 2, 1);

insert into shipment (origin, destination, distance, initDate, arrivalDate) 
values ('Oncativo, Cordoba, Argentina', 'Rosario, Santa Fe, Argentina', 325, '2019-05-25', '2019-05-26');

insert into truckDriverTravel (truck, shipment) 
values (1, 1);

insert into userTravel (truckQuantity, shipment, loadType, product) 
values (1, 1, 1/*cereal*/, 1/*Soja*/);