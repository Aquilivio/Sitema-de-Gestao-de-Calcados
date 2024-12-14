
#CREATE DATABASE crud_aquilivio;
#USE crud_aquilivio;
#CREATE TABLE calcados (
    nomeCalcado VARCHAR(50) NOT NULL,
    tamanhoCalcado INT NOT NULL,
    categoriaCalcado VARCHAR(50) NOT NULL,
    corCalcado VARCHAR(30) NOT NULL,
    precoCalcado DECIMAL(10, 2) NOT NULL,
    marcaCalcado VARCHAR(64) NOT NULL,
    dataCadastroCalcado VARCHAR(14) NOT NULL,
    quantidadeEstoqueCalcado INT NOT NULL,
    descricaoCalcado VARCHAR(200) NOT NULL,
    PRIMARY KEY (nomeCalcado)
);


#INSERT INTO calcados (
    nomeCalcado, tamanhoCalcado, categoriaCalcado, corCalcado, precoCalcado, 
    marcaCalcado, dataCadastroCalcado, quantidadeEstoqueCalcado, descricaoCalcado
) VALUES
('Tênis Esportivo', 42, 'Esportivo', 'Preto', 299.99, 'Nike', '20231211', 50, 'Tênis para corrida e treino.'),
('Sandália Casual', 38, 'Casual', 'Bege', 89.90, 'Havaianas', '20231210', 200, 'Sandália leve e confortável.'),
('Bota Trekking', 44, 'Aventura', 'Marrom', 459.90, 'Timberland', '20231208', 30, 'Bota impermeável para trilhas.'),
('Sapato Social', 40, 'Formal', 'Preto', 349.99, 'Ferracini', '20231209', 20, 'Sapato social clássico para eventos.'),
('Chinelo Básico', 39, 'Casual', 'Azul', 29.90, 'Ipanema', '20231207', 500, 'Chinelo prático e resistente.'),
('Tênis Casual', 41, 'Casual', 'Branco', 199.99, 'Adidas', '20231206', 70, 'Tênis casual estiloso e confortável.'),
('Mocassim Masculino', 42, 'Formal', 'Castanho', 279.99, 'Ferracini', '20231210', 25, 'Sapato elegante e casual.'),
('Sandália Esportiva', 40, 'Esportivo', 'Verde', 129.90, 'Keen', '20231209', 80, 'Sandália robusta para trilhas leves.'),
('Bota Militar', 43, 'Aventura', 'Preto', 599.90, 'Guartelá', '20231208', 10, 'Bota resistente para terrenos difíceis.'),
('Tênis de Caminhada', 39, 'Esportivo', 'Cinza', 259.90, 'Asics', '20231211', 60, 'Tênis confortável para caminhadas longas.'),
('Chinelo Anatômico', 37, 'Casual', 'Rosa', 49.90, 'Rider', '20231207', 300, 'Chinelo com design ergonómico.'),
('Sapatilha Feminina', 36, 'Casual', 'Vermelho', 99.90, 'Vizzano', '20231206', 150, 'Sapatilha confortável para o dia a dia.'),
('Tênis Skate', 40, 'Esportivo', 'Preto', 319.90, 'Vans', '20231205', 100, 'Tênis durável para prática de skate.'),
('Chuteira de Campo', 42, 'Esportivo', 'Amarelo', 389.99, 'Puma', '20231204', 50, 'Chuteira profissional para futebol de campo.'),
('Bota Country', 44, 'Aventura', 'Marrom', 499.99, 'Texan', '20231203', 20, 'Bota estilosa para uso casual e eventos.');


