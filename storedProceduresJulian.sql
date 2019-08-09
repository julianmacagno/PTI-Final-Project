delimiter $$

drop procedure if exists loginUser $$
create procedure loginUser (
	in parameter_username varchar(30),
	in parameter_password varchar(30)
)
begin
  	select * from person
   	where username = parameter_username
     	and password = parameter_password;
end $$

#---------------------------------------------------------------------------------------------------

drop procedure if exists registerUser $$
create procedure registerUser (
	in parameter_name varchar(30),
	in parameter_surname varchar(30),
	in parameter_dni integer,
	in parameter_birthDate date,
	in parameter_userType integer,
	in parameter_cuil_cuit varchar(15),
	in parameter_email varchar(50),
	in parameter_username varchar(30),
	in parameter_password varchar(30),
	in parameter_phoneNumber varchar(20),
	in parameter_address varchar(100),
	in parameter_rating integer,
	in parameter_bussinessName varchar(50)
)
begin
  	insert into person (
      	name,
		surname, 
		dni, 
		birthDate, 
		userType, 
		cuil_cuit, 
		email, 
		username, 
		password, 
		phoneNumber, 
		address, 
		rating, 
		bussinessName )
	values (
		parameter_name, 
		parameter_surname, 
		parameter_dni, 
		parameter_birthDate, 
		parameter_userType, 
		parameter_cuil_cuit, 
		parameter_email, 
		parameter_username, 
		parameter_password, 
		parameter_phoneNumber, 
		parameter_address, 
		parameter_rating, 
		parameter_bussinessName );
end $$

#---------------------------------------------------------------------------------------------------

drop procedure if exists registerTruckDriverAndLicense $$
create procedure registerTruckDriverAndLicense (
	in parameter_dni integer,
	in parameter_expirationDate date,
	in parameter_licenseType varchar(5),
	in parameter_emergencyNumber varchar(20)
)
begin
  	insert into license (ownerDni, expirationDate, licenseType, emergencyNumber)
	values (parameter_dni, parameter_expirationDate, parameter_licenseType, parameter_emergencyNumber);

	set @licenseId = (
	select license_key
	from license
	where ownerDni = parameter_dni);

  	set @personId = (
	select person_key
	from person
	where dni = parameter_dni);

  	insert into truckDriver (person_key, license_key, available)
  	values (@personId, @licenseId, 'S');

end $$

#---------------------------------------------------------------------------------------------------

drop procedure if exists getUserTypes $$
create procedure getUserTypes()
begin
    select *
    from userType;
end $$

drop procedure if exists getTruckTypes $$
create procedure getTruckTypes()
begin
    select *
    from truckType;
end $$

#---------------------------------------------------------------------------------------------------

drop procedure if exists registerTruck $$
create procedure registerTruck (
    in parameter_owner integer,
    in parameter_plate varchar(10),
    in parameter_brand varchar(30),
    in parameter_model varchar(30),
    in parameter_year smallint,
    in parameter_tare smallint,
    in parameter_maxWeigth integer,
    in parameter_maxVolume integer,
    in parameter_axlesNum integer,
    in parameter_chassisNum integer,
    in parameter_truckType integer
)
begin
    insert into truck(owner, plate, brand, model, year, tare, maxWeigth, maxVolume, axlesNum, chassisNum, truckType)
    values (parameter_owner, parameter_plate, parameter_brand, parameter_model, parameter_year, parameter_tare,
            parameter_maxWeigth, parameter_maxVolume, parameter_axlesNum, parameter_chassisNum, parameter_truckType);
end $$

#---------------------------------------------------------------------------------------------------

delimiter ;