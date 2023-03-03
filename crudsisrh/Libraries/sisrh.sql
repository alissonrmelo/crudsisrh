CREATE DATABASE IF NOT EXISTS `sisrh` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `sisrh`;

DROP TABLE IF EXISTS `administradores`;
CREATE TABLE IF NOT EXISTS `administradores` (
  `login` varchar(12) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `administradores` (`login`, `password`) VALUES
('Valmir', '12345678');

DROP TABLE IF EXISTS `funcionarios`;
CREATE TABLE IF NOT EXISTS `funcionarios` (
  `matricula` int(4) NOT NULL AUTO_INCREMENT COMMENT 'Matrícula',
  `nome` varchar(50) NOT NULL,
  `rg` varchar(10) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `telefoneContato` varchar(14) DEFAULT NULL,
  PRIMARY KEY (`matricula`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

INSERT INTO `funcionarios` (`matricula`, `nome`, `rg`, `cpf`, `telefoneContato`) VALUES
(29, 'Alisson Rodrigo de Santos', '1682879', '837.662.601/97', '(61)98250.6665'),
(30, 'Daniel Ramos de Oliveira Castro', '1682879', '837.662.601/97', '(61)98250.6665'),
(31, 'Aline Santana Santos', '1682873', '837.662.601/97', '(61)99999.9999'),
(32, 'Valmir Ribeiro Carvalho', '55555555', '837.662.601/97', '(61)98250.6665'),
(33, 'Valmir Ribeiro Carvalho', '1682898', '837.662.601/97', '(61)98250.6665');

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) CHARACTER SET latin1 NOT NULL,
  `sexo` varchar(100) CHARACTER SET latin1 NOT NULL,
  `dtNascimento` varchar(100) CHARACTER SET latin1 NOT NULL,
  `cargo` varchar(100) CHARACTER SET latin1 NOT NULL,
  `lotacao` varchar(100) CHARACTER SET latin1 NOT NULL,
  `email` varchar(100) CHARACTER SET latin1 NOT NULL,
  `telefone` varchar(100) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

INSERT INTO `usuarios` (`id`, `nome`, `sexo`, `dtNascimento`, `cargo`, `lotacao`, `email`, `telefone`) VALUES
(8, 'Daniel Ramos', 'Masculino', '01/12/2010', 'Desenvolverdor Junor', 'SEUSO', 'alisson.rodrigo@gmail.com', '(61) 98250-6665'),
(9, 'Alisson Rodrigo de Melo', 'Masculino', '23/03/1978', 'Desenvolvedor Senior', 'COARH', 'alisson.rodrigo@gmail.com', '(61) 98250-6665');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
