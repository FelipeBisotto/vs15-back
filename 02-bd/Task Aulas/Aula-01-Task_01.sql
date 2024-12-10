-- Criar a tabela estudante
CREATE TABLE VEM_SER.ESTUDANTE (
    id_estudante NUMBER PRIMARY KEY,
    nome VARCHAR2(200) NOT NULL,
    data_nascimento DATE NOT NULL,
    nr_matricula NUMBER(10) UNIQUE NOT NULL,
    ativo CHAR(1) CHECK (ativo IN ('S', 'N')) NOT NULL
);

-- Criar seq incremental
CREATE SEQUENCE VEM_SER.SEQ_ESTUDANTE
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- InsERCAO dos nomes na tabela
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo)
VALUES (VEM_SER.SEQ_ESTUDANTE.NEXTVAL, 'Harry Potter', TO_DATE('2000-01-10', 'YYYY-MM-DD'), 1, 'S');
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo)
VALUES (VEM_SER.SEQ_ESTUDANTE.NEXTVAL, 'Sirius Black', TO_DATE('2000-01-11', 'YYYY-MM-DD'), 2, 'S');
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo)
VALUES (VEM_SER.SEQ_ESTUDANTE.NEXTVAL, 'Rony Wisley', TO_DATE('2000-01-12', 'YYYY-MM-DD'), 3, 'S');
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo)
VALUES (VEM_SER.SEQ_ESTUDANTE.NEXTVAL, 'Tio Patinhas', TO_DATE('2000-01-13', 'YYYY-MM-DD'), 4, 'S');
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo)
VALUES (VEM_SER.SEQ_ESTUDANTE.NEXTVAL, 'Pato Donald', TO_DATE('2000-01-14', 'YYYY-MM-DD'), 5, 'S');
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo)
VALUES (VEM_SER.SEQ_ESTUDANTE.NEXTVAL, 'Mickey Mouse', TO_DATE('2000-01-15', 'YYYY-MM-DD'), 6, 'N');
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo)
VALUES (VEM_SER.SEQ_ESTUDANTE.NEXTVAL, 'Michael Jackson', TO_DATE('2000-01-16', 'YYYY-MM-DD'), 7, 'N');
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo)
VALUES (VEM_SER.SEQ_ESTUDANTE.NEXTVAL, 'Elton John', TO_DATE('2000-01-17', 'YYYY-MM-DD'), 8, 'N');
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo)
VALUES (VEM_SER.SEQ_ESTUDANTE.NEXTVAL, 'Freddie Mercury', TO_DATE('2000-01-18', 'YYYY-MM-DD'), 9, 'N');
INSERT INTO VEM_SER.ESTUDANTE (id_estudante, nome, data_nascimento, nr_matricula, ativo)
VALUES (VEM_SER.SEQ_ESTUDANTE.NEXTVAL, 'Roberto Carlos', TO_DATE('2000-01-19', 'YYYY-MM-DD'), 10, 'N');

-- Selecionar todos os estudantes inseridos
SELECT * FROM VEM_SER.ESTUDANTE;
