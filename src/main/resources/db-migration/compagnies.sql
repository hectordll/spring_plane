-- SEQUENCE Oracle pour la table COMPAGNIES_AERIENNES
-- À exécuter dans Oracle SQLcl

CREATE SEQUENCE SEQ_COMPAGNIES_AERIENNES
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;

-- Cette SEQUENCE est créée pour respecter les contraintes du schéma.
-- Elle n'est pas utilisée pour générer l'ID_COMPAGNIE (qui reste VARCHAR2 saisi par l'admin)
-- mais reste disponible si le besoin change à l'avenir.
