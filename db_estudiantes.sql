-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-11-2023 a las 09:38:50
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_estudiantes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE `estudiantes` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `edad` int(11) NOT NULL,
  `curso` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estudiantes`
--

INSERT INTO `estudiantes` (`id`, `nombre`, `apellido`, `edad`, `curso`) VALUES
(3, 'Guillermo', 'Callizaya Fernandez', 30, '2DAMP'),
(5, 'Juan', 'Lopez', 26, '11DAU'),
(6, 'Daniel', 'Monedero', 22, '\"DAMP'),
(7, 'Laura', 'Gregorio', 211, '1DAU'),
(8, 'Juan', 'Pérez', 20, 'Matemáticas'),
(9, 'Ana', 'Gómez', 19, 'Física'),
(10, 'Luis', 'Martínez', 21, 'Química'),
(11, 'Sofía', 'Hernández', 22, 'Historia'),
(12, 'Carlos', 'López', 20, 'Biología'),
(13, 'María', 'García', 18, 'Literatura'),
(14, 'Diego', 'Alvarez', 23, 'Filosofía'),
(15, 'Laura', 'Torres', 19, 'Ingeniería'),
(16, 'Sergio', 'Ramírez', 21, 'Arte'),
(17, 'Elena', 'Morales', 22, 'Ciencias Políticas'),
(18, 'Lucía', 'Fernández', 20, 'Historia'),
(19, 'Marta', 'Ruiz', 19, 'Matemáticas'),
(20, 'Javier', 'Santos', 21, 'Física'),
(21, 'Raquel', 'Molina', 22, 'Química'),
(22, 'Antonio', 'Ortiz', 20, 'Literatura'),
(23, 'Carmen', 'Gutiérrez', 18, 'Biología'),
(24, 'Francisco', 'Navarro', 23, 'Filosofía'),
(25, 'Beatriz', 'Dominguez', 19, 'Ingeniería'),
(26, 'Rocío', 'Gil', 21, 'Arte'),
(27, 'Pablo', 'Serrano', 22, 'Ciencias Políticas'),
(28, 'Andrea', 'Romero', 20, 'Historia'),
(29, 'José', 'Torres', 19, 'Matemáticas'),
(30, 'Patricia', 'Herrero', 21, 'Física'),
(31, 'Alberto', 'Marín', 22, 'Química'),
(32, 'Paula', 'Vargas', 20, 'Literatura'),
(33, 'David', 'Carmona', 18, 'Biología'),
(34, 'Sandra', 'Cabrera', 23, 'Filosofía'),
(35, 'Ángel', 'Campos', 19, 'Ingeniería'),
(36, 'Adrián', 'Garrido', 21, 'Arte'),
(37, 'Inés', 'Prieto', 22, 'Ciencias Políticas'),
(38, 'Hugo', 'Vega', 20, 'Historia'),
(39, 'Irene', 'Solís', 19, 'Matemáticas'),
(40, 'Rubén', 'Moya', 21, 'Física'),
(41, 'Teresa', 'Cano', 22, 'Química'),
(42, 'Óscar', 'Bravo', 20, 'Literatura'),
(43, 'Silvia', 'Moreno', 18, 'Biología'),
(44, 'Daniel', 'Lozano', 23, 'Filosofía'),
(45, 'Clara', 'Guerrero', 19, 'Ingeniería'),
(46, 'Mario', 'Pascual', 21, 'Arte'),
(47, 'Laura', 'Rey', 22, 'Ciencias Políticas'),
(48, 'Nuria', 'Calvo', 20, 'Historia'),
(49, 'Enrique', 'Nieto', 19, 'Matemáticas'),
(50, 'Virginia', 'Crespo', 21, 'Física'),
(51, 'Alejandro', 'Vidal', 22, 'Química'),
(52, 'Alicia', 'Sanz', 20, 'Literatura'),
(53, 'Jorge', 'Iglesias', 18, 'Biología'),
(54, 'Blanca', 'Caballero', 23, 'Filosofía'),
(55, 'César', 'Aguilar', 19, 'Ingeniería'),
(56, 'Verónica', 'Peña', 21, 'Arte'),
(57, 'Esteban', 'Castro', 22, 'Ciencias Políticas'),
(58, 'Susana', 'Gallardo', 20, 'Historia'),
(59, 'Marcos', 'Vázquez', 19, 'Matemáticas'),
(60, 'Yolanda', 'Quintana', 21, 'Física'),
(61, 'Lorenzo', 'Sáez', 22, 'Química'),
(62, 'Noelia', 'Cortés', 20, 'Literatura'),
(63, 'Raúl', 'Benítez', 18, 'Biología'),
(64, 'Álvaro', 'Merino', 23, 'Filosofía'),
(65, 'Natalia', 'Acosta', 19, 'Ingeniería'),
(66, 'Gonzalo', 'Tejada', 21, 'Arte'),
(67, 'Carla', 'Robles', 22, 'Ciencias Políticas');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
