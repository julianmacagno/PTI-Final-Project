#!/bin/sh
sudo mysql -p < resetDatabase.sql
sudo mysql -p cargoFacil < createTables.sql 
sudo mysql -p cargoFacil < insertValues.sql
sudo mysql -p cargoFacil < storedProceduresJulian.sql
sudo mysql -p cargoFacil < storedProceduresChula.sql  