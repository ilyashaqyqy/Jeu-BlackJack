-- Database: BlackJack

-- DROP DATABASE IF EXISTS "BlackJack";

CREATE DATABASE "BlackJack"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'French_France.1252'
    LC_CTYPE = 'French_France.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
	
	use BlackJack;
	-- Main(id_main(pk),valeurTotal_main,nbCartes_main) 

						
CREATE TABLE Main (
    id_main INT PRIMARY KEY,
    valeurTotal_main INT,
    nbCartes_main INT
);


CREATE TABLE PaquetCarte (
id_paquetCarte INT PRIMARY KEY ,
taille_paquetCartes INT	
	
);

CREATE TABLE Joueur (
id_joueur INT PRIMARY KEY ,
username_joueur VARCHAR(25)	,
solde_joueur INT,
id_main	INT ,
FOREIGN KEY (id_main) REFERENCES main(id_main)

);


CREATE TABLE Croupier (
id_croupier INT PRIMARY KEY ,
valeurTotalLimit INT ,
id_main INT,
FOREIGN KEY (id_main) REFERENCES main(id_main)

);

CREATE TABLE Catre (
id_carte INT PRIMARY KEY ,
couleur_carte VARCHAR(25) ,
valeur_carte INT	
	
);



