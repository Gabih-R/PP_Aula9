CREATE DATABASE Aula02;

USE Aula02;

CREATE TABLE pais (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    populacao BIGINT,
    area NUMERIC(15,2)
);

INSERT INTO pais (id, nome, populacao, area) VALUES (1, "EUA", "308745538 ", "9371175");
INSERT INTO pais (id, nome, populacao, area) VALUES (2, "Brasil", "207660929", "8515767049");
INSERT INTO pais (id, nome, populacao, area) VALUES (3, "Mexico", "119530753", "1958201");
INSERT INTO pais (id, nome, populacao, area) VALUES (4, "Canada", "	35151728", "9984670");
INSERT INTO pais (id, nome, populacao, area) VALUES (5, "Bolivia", "10969049", "1098581");
