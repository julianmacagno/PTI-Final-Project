insert into userType (type)
values ('Despachante'), ('Camionero');

insert into person (name, surname, dni, birthDate, userType, cuil_cuit, email, username, password, phoneNumber, address, rating, bussinessName) 
values ('Julian', 'Macagno', '40028514', '1997-02-04', 2, '20400285145', 'julian.macagno55@gmail.com', 'julianmacagno', 'rivadavia850', '3572552389', 'Rivadavia 850, Oncativo, Cordoba, Argentina', 5, 'Macagno S.A.');

insert into license (ownerDni, expirationDate, licenseType, emergencyNumber) 
values (40028514, '2019-08-02', 'B1', '3572466395');

insert into truckDriver (person_key, license_key, available)
values (1, 1, 'S');

insert into truckType (type) 
values ('Cerealeros'), ('Cisterna Alimenticios'), ('Cisterna Combustibles'), ('Cisterna Quimicos'), ('Playo - Maquinarias'), ('Cargas Generales - Tarimas'), ('Contenedores'), ('Animales'), ('Frigorificos'), ('Volcadores');

insert into truck (owner, plate, brand, model, year, tare, maxWeigth, maxVolume, axlesNum, chassisNum, truckType) 
values (1, 'HDP 123', 'Tesla', 'Semi', 2018, 12000, 33000, 20, 4, 2, 1);

insert into productType (type)
values  ("Granel"), 
        ("Cargas generales"),
        ("Contenedores"),
        ("Pallets - Tarimas"),
        ("Contenedores"),
        ("Maquinarias"),
        ("Liquidos");

insert into product (name, productType_key) 
values ("Soja", 1);

insert into shipment (origin, originAddress, destination, destinationAddress, distance, initDate, arrivalDate, acepted, product, quantity, unit, owner) 
values ('-31.9135378,-63.678862', 'Rivadavia 850, Oncativo, Cordoba, Argentina', '-32.9448139,-60.7190005', 'Neuquén 7267, S2008DAM Rosario, Santa Fe, Argentina', '325 km', '2019-05-25', '2019-05-26', 'N', 1, 30000, 'Kg', 1);

insert into truckDriverTravel (truck, shipment) 
values (1, 1);

insert into userTravel (truckQuantity, shipment) 
values (1, 1);

insert into calification (person_key, score, review)
values (1, 5, 'Excelente atencion, muy fachero el tipo');
