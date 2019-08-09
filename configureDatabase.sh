#!/bin/sh
sudo apt purge --auto-remove mysql-server
sudo apt install mysql-server
sudo systemctl enable mysql
sudo systemctl start mysql
sudo mysql < initDatabase.sql
sudo mysql -p cargoFacil < createTables.sql 
sudo mysql -p cargoFacil < insertValues.sql
sudo mysql -p cargoFacil < storedProceduresJulian.sql
sudo mysql -p cargoFacil < storedProceduresChula.sql   