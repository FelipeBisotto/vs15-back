-- Task - Aula 03 - Task 03

-- PASSO A PASSO

-- RIGHT JOIN
-- I. Fazer um RIGHT JOIN entre Pessoa e Contato
SELECT *
FROM Pessoa p
RIGHT JOIN Contato c
ON p.id_pessoa = c.id_pessoa;

-- II. Fazer um RIGHT JOIN entre Pessoa, Pessoa_X_Pessoa_Endereco e Endereco_Pessoa
SELECT *
FROM Pessoa p
RIGHT JOIN Pessoa_X_Pessoa_Endereco pessoaxPE
ON p.id_pessoa = pessoaxPE.id_pessoa
RIGHT JOIN Endereco_Pessoa ep
ON pessoaxPE.id_endereco = ep.id_endereco;

-- III. Fazer um RIGHT JOIN entre todas as tabelas começando por Pessoa
SELECT *
FROM Pessoa p
RIGHT JOIN Contato c
ON p.id_pessoa = c.id_pessoa
RIGHT JOIN Pessoa_X_Pessoa_Endereco pessoaxPE
ON p.id_pessoa = pessoaxPE.id_pessoa
RIGHT JOIN Endereco_Pessoa ep
ON pessoaxPE.id_endereco = ep.id_endereco;


-- FULL JOIN
-- I. Fazer um FULL JOIN entre Pessoa e Contato
SELECT *
FROM Pessoa p
FULL JOIN Contato c
ON p.id_pessoa = c.id_pessoa;

-- II. Fazer um FULL JOIN entre Pessoa, Pessoa_X_Pessoa_Endereco e Endereco_Pessoa
SELECT *
FROM Pessoa p
FULL JOIN Pessoa_X_Pessoa_Endereco pessoaxPE
ON p.id_pessoa = pessoaxPE.id_pessoa
FULL JOIN Endereco_Pessoa ep
ON pessoaxPE.id_endereco = ep.id_endereco;

-- III. Fazer um FULL JOIN entre todas as tabelas começando por Pessoa
SELECT *
FROM Pessoa p
FULL JOIN Contato c
ON p.id_pessoa = c.id_pessoa
FULL JOIN Pessoa_X_Pessoa_Endereco pessoaxPE
ON p.id_pessoa = pessoaxPE.id_pessoa
FULL JOIN Endereco_Pessoa ep
ON pessoaxPE.id_endereco = ep.id_endereco;


-- EXISTS
-- I. Utilizando o EXISTS, selecione as pessoas que têm endereço
SELECT p.id_pessoa, p.nome
FROM Pessoa p
WHERE EXISTS (
    SELECT 1
    FROM Pessoa_X_Pessoa_Endereco pessoaxPE
    WHERE pessoaxPE.id_pessoa = p.id_pessoa
);

-- II. Selecione id, nome da tabela Pessoa junto com id, logradouro da tabela Endereco
SELECT p.id_pessoa, p.nome, ep.id_endereco, ep.logradouro
FROM Pessoa p
JOIN Pessoa_X_Pessoa_Endereco pessoaxPE
ON p.id_pessoa = pessoaxPE.id_pessoa
JOIN Endereco_Pessoa ep
ON pessoaxPE.id_endereco = ep.id_endereco;
