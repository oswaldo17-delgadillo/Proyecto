-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-06-2021 a las 21:21:14
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areas`
--

CREATE TABLE `areas` (
  `area` varchar(20) NOT NULL,
  `imagen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `areas`
--

INSERT INTO `areas` (`area`, `imagen`) VALUES
('Alberca', 'src/imagenes/alberca.jpg'),
('Bar', 'src/imagenes/bar.jpg'),
('Guarderia', 'src/imagenes/guarderia.jpg'),
('Gym', 'src/imagenes/gym.jpg'),
('Habitacion Doble', 'src/imagenes/habitacionDoble.jpg'),
('Habitacion Sencilla', 'src/imagenes/habitacionSencilla.jpg'),
('Habitacion Triple', 'src/imagenes/habitacionTriple.jpg'),
('Lavanderia', 'src/imagenes/lavanderia.jpeg'),
('Restaurante', 'src/imagenes/restaurante.jpg'),
('Spa', 'src/imagenes/spa.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE `cuentas` (
  `cuenta` varchar(10) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cuenta`, `password`) VALUES
('Adrian', 'f18b84f0fc3d9040999e9ec1ff858d98'),
('Gonzalo', 'daf349dbdd8426b406c51809c20fe486'),
('oswaldo', '90f40386cd0b411561aa5a51fa08c8a7');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `habitacion` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `costo` int(11) NOT NULL,
  `piso` int(11) NOT NULL,
  `estado` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`habitacion`, `tipo`, `costo`, `piso`, `estado`) VALUES
(100, 'Sencilla', 800, 1, 'Descupada'),
(101, 'Doble', 1200, 1, 'Descupada'),
(102, 'Sencilla', 800, 1, 'Descupada'),
(103, 'Sencilla', 800, 1, 'Descupada'),
(104, 'Doble', 1200, 1, 'Descupada'),
(105, 'Sencilla', 800, 1, 'Descupada'),
(106, 'Triple', 1600, 1, 'Ocupada'),
(107, 'Triple', 1600, 1, 'Desocupada'),
(108, 'Triple', 1600, 1, 'Desocupada'),
(109, 'Sencilla', 800, 1, 'Desocupada'),
(110, 'Doble', 1200, 1, 'Ocupada'),
(111, 'Sencilla', 800, 1, 'Ocupada'),
(112, 'Sencilla', 800, 1, 'Desocupada'),
(113, 'Doble', 1200, 1, 'Desocupada'),
(114, 'Sencilla', 800, 1, 'Ocupada'),
(115, 'Sencilla', 800, 2, 'Ocupada'),
(116, 'Triple', 1600, 2, 'Descupada'),
(117, 'Doble', 1200, 2, 'Desocupada'),
(118, 'Doble', 1200, 2, 'Ocupada'),
(119, 'Doble', 1200, 2, 'Desocupada'),
(120, 'Triple', 1600, 2, 'Ocupada'),
(121, 'Sencilla', 800, 2, 'Desocupada'),
(122, 'Sencilla', 800, 2, 'Ocupada'),
(123, 'Sencilla', 800, 2, 'Desocupada'),
(124, 'Triple', 1600, 2, 'Desocupada'),
(125, 'Doble', 1200, 2, 'Desocupada'),
(126, 'Doble', 1200, 2, 'Desocupada'),
(127, 'Doble', 1200, 2, 'Ocupada'),
(128, 'Triple', 1600, 2, 'Ocupada'),
(129, 'Sencilla', 800, 2, 'Descupada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresos`
--

CREATE TABLE `ingresos` (
  `id` int(11) NOT NULL,
  `ingreso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ingresos`
--

INSERT INTO `ingresos` (`id`, `ingreso`) VALUES
(59, 4580),
(60, 3100),
(61, 1650),
(62, 3150),
(63, 800),
(64, 3980),
(65, 5850),
(66, 2850),
(67, 2150),
(68, 3200),
(69, 2400),
(70, 4080),
(71, 2400),
(72, 4000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

CREATE TABLE `registros` (
  `habitacion` int(11) NOT NULL,
  `tipoHabitacion` varchar(45) NOT NULL,
  `costo` int(11) DEFAULT NULL,
  `numOcupantes` int(11) NOT NULL,
  `ocupantesEx` int(11) DEFAULT NULL,
  `Nombre` varchar(45) NOT NULL,
  `ciudadOrigen` varchar(45) NOT NULL,
  `fechaEntrada` date NOT NULL,
  `fechaSalida` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `registros`
--

INSERT INTO `registros` (`habitacion`, `tipoHabitacion`, `costo`, `numOcupantes`, `ocupantesEx`, `Nombre`, `ciudadOrigen`, `fechaEntrada`, `fechaSalida`) VALUES
(106, 'Triple', 1600, 3, 1, 'Juan Herandez', 'Monterrey', '2021-06-15', '2021-06-17'),
(110, 'Doble', 1200, 2, 1, 'Luis Adrian Valdez', 'Aguascalientes', '2021-06-16', '2021-06-18'),
(111, 'Sencilla', 800, 1, 1, 'Jesus Rodriguez', 'Guadalajara', '2021-06-16', '2021-06-18'),
(114, 'Sencilla', 800, 1, 0, 'Gonzalo Rodriguez', 'Zacatecas', '2021-06-16', '2021-06-18'),
(115, 'Sencilla', 800, 1, 2, 'Jose Castro', 'Quintana Roo', '2021-06-16', '2021-06-18'),
(118, 'Doble', 1200, 2, 0, 'Eduardo Davila', 'Toluca', '2021-06-16', '2021-06-17'),
(120, 'Triple', 1600, 1, 0, 'aaron perez', 'cd mex', '2021-06-16', '2021-06-18'),
(122, 'Sencilla', 800, 1, 0, 'Gonzalo Castorena', 'Tijuana', '2021-06-16', '2021-06-19'),
(127, 'Doble', 1200, 2, 0, 'Antonio Garcia', 'Baja California Sur', '2021-06-16', '2021-06-20'),
(128, 'Triple', 1600, 3, 0, 'Andrea Mendez', 'San Luis Potosi', '2021-06-16', '2021-06-20');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `areas`
--
ALTER TABLE `areas`
  ADD PRIMARY KEY (`area`);

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  ADD PRIMARY KEY (`cuenta`);

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`habitacion`);

--
-- Indices de la tabla `ingresos`
--
ALTER TABLE `ingresos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `registros`
--
ALTER TABLE `registros`
  ADD PRIMARY KEY (`habitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ingresos`
--
ALTER TABLE `ingresos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
