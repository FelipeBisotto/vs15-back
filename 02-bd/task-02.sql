-- Task - Aula 02 - Task 02
-- Selecionar todos os paises ordenados por nome em ordem decrescente
SELECT * FROM PAIS
ORDER BY NOME DESC

-- Selecionar logradouro e cep dos endereços que comecem com a letra:  A ou a 
FROM ENDERECO 
WHERE UPPER(SUBSTR(logradouro, 1, 1)) = 'A'

-- Selecionar todos os endereços que tenham cep com final 0
SELECT cep
FROM ENDERECO 
WHERE SUBSTR(cep, -1) = '0'

-- Selecionar todos os endereços que tenham números entre 1 e 100 - USO DER BETWEEN
SELECT *
FROM ENDERECO
WHERE TO_NUMBER(numero) BETWEEN 1 AND 100;

-- Selecionar todos os enderecos que comecem por RUA e ordenar pelo cep de forma decrescente
SELECT *
FROM ENDERECO
WHERE UPPER(logradouro) LIKE 'RUA%'
ORDER BY cep DESC

-- Selecionar a quantidade de enderecos cadastrados na tabela
SELECT COUNT(id_endereco) AS total_end
FROM ENDERECO

-- Selecionar a quantidade de enderecos cadastrados agrupados pelo id da cidade
SELECT id_cidade, COUNT(*) AS total_end
FROM ENDERECO
GROUP BY id_cidade
ORDER BY id_cidade