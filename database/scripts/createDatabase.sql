
CREATE TABLE geek (
	id_geek INT NOT NULL,
	nom_geek VARCHAR(30) NOT NULL,
	prenom_geek VARCHAR(30) NOT NULL,
	pseudo_geek VARCHAR(30) NOT NULL,
	mail_geek VARCHAR(50) NOT NULL,
	CONSTRAINT pk_geek PRIMARY KEY (id_geek)
)

CREATE TABLE interet (
	id_interet INT NOT NULL,
	lib_interet VARCHAR(80) NOT NULL,
	CONSTRAINT pk_interet PRIMARY KEY (id_interet)
)

CREATE TABLE possede (
	id_geek INT NOT NULL,
	id_interet INT NOT NULL,
	CONSTRAINT pk_possede PRIMARY KEY (id_geek,id_interet),
	FOREIGN KEY (id_interet) REFERENCES interet (id_interet),
	FOREIGN KEY (id_geek) REFERENCES geek (id_geek)
)

CREATE TABLE audit (
	id_audit INT NOT NULL,
	id_geek INT NOT NULL,
	compteur_audit INT NOT NULL,
	heure_consultation_audit DATETIME NOT NULL,
	ip_visiteur_audit VARCHAR(15) NOT NULL,
	CONSTRAINT pk_audit PRIMARY KEY (id_audit),
	FOREIGN KEY (id_geek) REFERENCES geek (id_geek)
)