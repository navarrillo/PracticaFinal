-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.0.67-community-nt - MySQL Community Edition (GPL)
-- SO del servidor:              Win32
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para proyectoskibd
CREATE DATABASE IF NOT EXISTS `proyectoskibd` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `proyectoskibd`;

-- Volcando estructura para tabla proyectoskibd.proveedores
CREATE TABLE IF NOT EXISTS `proveedores` (
  `cif` varchar(50) NOT NULL,
  `password` varchar(50) default NULL,
  `nombre` varchar(50) default NULL,
  `direccion` varchar(50) default NULL,
  `telefono` bigint(20) default NULL,
  `Provincia` varchar(50) default NULL,
  `dbtabla` varchar(50) default NULL,
  PRIMARY KEY  (`cif`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectoskibd.proveedores: 3 rows
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` (`cif`, `password`, `nombre`, `direccion`, `telefono`, `Provincia`, `dbtabla`) VALUES
	('15A', 'a', 'juan', 'falso', 0, 'Alicante', 'serviciosproveedor'),
	('15B', 'b', 'b', 'b', 0, 'b', 'serviciosproveedor1'),
	('15C', 'c', 'c', 'c', 0, 'c', 'serviciosproveedor2');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;

-- Volcando estructura para tabla proyectoskibd.reservas
CREATE TABLE IF NOT EXISTS `reservas` (
  `id` int(11) NOT NULL auto_increment,
  `fechaEntrada` date default NULL,
  `fechaSalida` date default NULL,
  `nombreCliente` varchar(50) default NULL,
  `emailCliente` varchar(30) default NULL,
  `precio` int(11) default NULL,
  `ski` varchar(50) default NULL,
  `material` varchar(50) default NULL,
  `profesor` varchar(50) default NULL,
  `alojamiento` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectoskibd.reservas: 0 rows
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;

-- Volcando estructura para tabla proyectoskibd.serviciosproveedor
CREATE TABLE IF NOT EXISTS `serviciosproveedor` (
  `CIF` varchar(50) default NULL,
  `ski` int(11) default NULL,
  `material` int(11) default NULL,
  `profesor` int(11) default NULL,
  `alojamiento` int(11) default NULL,
  `oferta` double default NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectoskibd.serviciosproveedor: 1 rows
/*!40000 ALTER TABLE `serviciosproveedor` DISABLE KEYS */;
INSERT INTO `serviciosproveedor` (`CIF`, `ski`, `material`, `profesor`, `alojamiento`, `oferta`) VALUES
	('15A', 10, 15, 5, 30, 1);
/*!40000 ALTER TABLE `serviciosproveedor` ENABLE KEYS */;

-- Volcando estructura para tabla proyectoskibd.serviciosproveedor1
CREATE TABLE IF NOT EXISTS `serviciosproveedor1` (
  `CIF` varchar(50) default NULL,
  `ski` int(11) default NULL,
  `material` int(11) default NULL,
  `profesor` int(11) default NULL,
  `alojamiento` int(11) default NULL,
  `oferta` double default NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectoskibd.serviciosproveedor1: 1 rows
/*!40000 ALTER TABLE `serviciosproveedor1` DISABLE KEYS */;
INSERT INTO `serviciosproveedor1` (`CIF`, `ski`, `material`, `profesor`, `alojamiento`, `oferta`) VALUES
	('15B', 12, 14, 30, 40, 1);
/*!40000 ALTER TABLE `serviciosproveedor1` ENABLE KEYS */;

-- Volcando estructura para tabla proyectoskibd.serviciosproveedor2
CREATE TABLE IF NOT EXISTS `serviciosproveedor2` (
  `CIF` varchar(50) default NULL,
  `ski` int(11) default NULL,
  `material` int(11) default NULL,
  `profesor` int(11) default NULL,
  `alojamiento` int(11) default NULL,
  `oferta` double default NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectoskibd.serviciosproveedor2: 1 rows
/*!40000 ALTER TABLE `serviciosproveedor2` DISABLE KEYS */;
INSERT INTO `serviciosproveedor2` (`CIF`, `ski`, `material`, `profesor`, `alojamiento`, `oferta`) VALUES
	('15C', 45, 23, 15, 60, 1);
/*!40000 ALTER TABLE `serviciosproveedor2` ENABLE KEYS */;

-- Volcando estructura para tabla proyectoskibd.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(50) default NULL,
  `telefono` varchar(9) default NULL,
  `email` varchar(30) default NULL,
  `password` varchar(16) default NULL,
  `direccion` varchar(100) default NULL,
  PRIMARY KEY  (`dni`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla proyectoskibd.usuarios: 2 rows
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`dni`, `nombre`, `telefono`, `email`, `password`, `direccion`) VALUES
	('48669981A', 'Héctor Molina Beneyto', '666666666', 'a@a.a', 'hector', 'C/ Falsa nº1,2,3'),
	('11111111H', 'Melli Melloso Mellaco', '632632632', 'melli@melli.melli', 'melli', 'C/ Acho 0');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
