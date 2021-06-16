-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-06-2021 a las 02:12:37
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
(100, 'Sencilla', 800, 1, 'Ocupada'),
(101, 'Doble', 1200, 1, 'Desocupada'),
(102, 'Sencilla', 800, 1, 'Desocupada'),
(103, 'Sencilla', 800, 1, 'Desocupada'),
(104, 'Doble', 1200, 1, 'Ocupada'),
(105, 'Sencilla', 800, 1, 'Descupada'),
(106, 'Triple', 1600, 1, 'Desocupada'),
(107, 'Triple', 1600, 1, 'Desocupada'),
(108, 'Triple', 1600, 1, 'Desocupada'),
(109, 'Sencilla', 800, 1, 'Desocupada'),
(110, 'Doble', 1200, 1, 'Desocupada'),
(111, 'Sencilla', 800, 1, 'Desocupada'),
(112, 'Sencilla', 800, 1, 'Desocupada'),
(113, 'Doble', 1200, 1, 'Desocupada'),
(114, 'Sencilla', 800, 1, 'Desocupada'),
(115, 'Sencilla', 800, 2, 'Desocupada'),
(116, 'Triple', 1600, 2, 'Desocupada'),
(117, 'Doble', 1200, 2, 'Desocupada'),
(118, 'Doble', 1200, 2, 'Desocupada'),
(119, 'Doble', 1200, 2, 'Desocupada'),
(120, 'Triple', 1600, 2, 'Desocupada'),
(121, 'Sencilla', 800, 2, 'Desocupada'),
(122, 'Sencilla', 800, 2, 'Desocupada'),
(123, 'Sencilla', 800, 2, 'Desocupada'),
(124, 'Triple', 1600, 2, 'Desocupada'),
(125, 'Doble', 1200, 2, 'Desocupada'),
(126, 'Doble', 1200, 2, 'Desocupada'),
(127, 'Doble', 1200, 2, 'Desocupada'),
(128, 'Triple', 1600, 2, 'Desocupada'),
(129, 'Sencilla', 800, 2, 'Desocupada');

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
(62, 3150);

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
(100, 'Sencilla', 800, 1, 0, 'Adrian', 'Ags', '2021-06-13', '2021-06-14'),
(104, 'Doble', 1200, 2, 0, 'Luis', 'Zacatecas', '2021-06-14', '2021-06-16');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
