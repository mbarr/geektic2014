ALTER TABLE possede ADD CONSTRAINT fk_possede_interet 
	FOREIGN KEY (id_interet) REFERENCES interet (id_interet);

ALTER TABLE possede ADD CONSTRAINT fk_possede_geek 
	FOREIGN KEY (id_geek) REFERENCES geek (id_geek);

ALTER TABLE audit ADD CONSTRAINT fk_audit_geek 
	FOREIGN KEY (id_geek) REFERENCES geek (id_geek);
	