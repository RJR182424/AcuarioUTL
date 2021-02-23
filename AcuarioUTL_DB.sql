DROP DATABASE IF EXISTS acuarioUTL;
CREATE DATABASE acuarioUTL;
USE acuarioUTL;

DROP TABLE IF EXISTS peces;
CREATE TABLE peces (
    idPeces INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(30),
    especie VARCHAR(30),
    precio FLOAT,
    calif FLOAT,
    foto VARCHAR(500)
);

INSERT INTO peces (nombre, especie, precio, calif, foto)
VALUES('Pez Payaso', 'Amphiprion ocellaris', 400.00, 4.5, 'https://www.anipedia.net/imagenes/pez-payaso.jpg');

INSERT INTO peces (nombre, especie, precio, calif, foto)
VALUES('Pez betta', 'Betta splendens', 550.00, 5, 'https://upload.wikimedia.org/wikipedia/commons/2/24/Betta04.jpg');

INSERT INTO peces (nombre, especie, precio, calif, foto)
VALUES('Pez dorado', 'Carassius auratus', 350.64, 4, 'https://upload.wikimedia.org/wikipedia/commons/e/e9/Goldfish3.jpg');

INSERT INTO peces (nombre, especie, precio, calif, foto)
VALUES('Carpa común', 'Cyprinus carpio', 287.67, 3.5, 'https://infomarina.net/wp-content/uploads/2017/10/Pez-Carpa.jpg');

INSERT INTO peces (nombre, especie, precio, calif, foto)
VALUES('Pez Guppy', 'Poecilia reticulata', 150.00, 4.5, 'https://wiki.nus.edu.sg/download/attachments/219427237/T4254-Poecilia%20reticulate-img-4.jpg?version=1&modificationDate=1537929655923&api=v2');

INSERT INTO peces (nombre, especie, precio, calif, foto)
VALUES('Pez borrón', 'Psychrolutes marcidus', 900.00, 4.5, 'https://estaticos.muyinteresante.es/uploads/images/pyr/5c767f725cafe830d76589a0/pez-borron_0.jpeg');

INSERT INTO peces (nombre, especie, precio, calif, foto)
VALUES('Pez Tilapia del Nilo', 'Oreochromis niloticus', 600.00, 4.5, 'https://upload.wikimedia.org/wikipedia/commons/b/b3/Oreochromis-niloticus-Nairobi.JPG');

INSERT INTO peces (nombre, especie, precio, calif, foto)
VALUES('Pez luna', 'Mola mola', 1500.00, 3, 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Mola_mola.jpg/250px-Mola_mola.jpg');

INSERT INTO peces (nombre, especie, precio, calif, foto)
VALUES('Pez cirujano azul', 'Paracanthurus hepatus', 864.59, 5, 'https://static.wikia.nocookie.net/reinoanimalia/images/0/07/Cirujano_azul_1.png/revision/latest?cb=20140430130542&path-prefix=es');

INSERT INTO peces (nombre, especie, precio, calif, foto)
VALUES('Pez Escalar', 'Pterophyllum scalare', 780.26, 4.5, 'https://cdn.shopify.com/s/files/1/0844/6695/products/Pterophyllum_Scalare_1024x1024_7678d218-7ab0-4cbe-8f0c-d81d3ac97856_grande.jpg?v=1502170949');