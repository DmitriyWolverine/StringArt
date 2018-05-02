-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.7.21-log - MySQL Community Server (GPL)
-- Операционная система:         Win64
-- HeidiSQL Версия:              9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных art_gallery
CREATE DATABASE IF NOT EXISTS `art_gallery` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `art_gallery`;

-- Дамп структуры для таблица art_gallery.artists
CREATE TABLE IF NOT EXISTS `artists` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `surname` varchar(50) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `style` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `style` (`style`),
  CONSTRAINT `FK_artists_styles` FOREIGN KEY (`style`) REFERENCES `styles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы art_gallery.artists: ~3 rows (приблизительно)
DELETE FROM `artists`;
/*!40000 ALTER TABLE `artists` DISABLE KEYS */;
INSERT INTO `artists` (`id`, `name`, `surname`, `birthday`, `style`) VALUES
	(1, 'Antony', 'Shadrin', '1992-02-21', 5),
	(2, 'Igor', 'Vasnecov', '1853-04-21', 4),
	(3, 'Viktor', 'Shishkin', '1970-01-01', 1);
/*!40000 ALTER TABLE `artists` ENABLE KEYS */;

-- Дамп структуры для таблица art_gallery.orders
CREATE TABLE IF NOT EXISTS `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `describtion` text,
  `status` tinyint(4) DEFAULT NULL,
  `client_id` int(11) DEFAULT NULL,
  `picture_id` int(11) DEFAULT NULL,
  `get_date` date DEFAULT NULL,
  `done_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_orders_users` (`client_id`),
  KEY `FK_orders_pictures` (`picture_id`),
  CONSTRAINT `FK_orders_pictures` FOREIGN KEY (`picture_id`) REFERENCES `pictures` (`id`),
  CONSTRAINT `FK_orders_users` FOREIGN KEY (`client_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы art_gallery.orders: ~0 rows (приблизительно)
DELETE FROM `orders`;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;

-- Дамп структуры для таблица art_gallery.pictures
CREATE TABLE IF NOT EXISTS `pictures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `style` int(11) NOT NULL DEFAULT '0',
  `name` varchar(50) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `size` int(11) DEFAULT NULL,
  `img` blob,
  `artist` int(11) DEFAULT NULL,
  `ready` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_pictures_styles` (`style`),
  KEY `FK_pictures_artists` (`artist`),
  KEY `FK_pictures_standarts` (`size`),
  CONSTRAINT `FK_pictures_artists` FOREIGN KEY (`artist`) REFERENCES `artists` (`id`),
  CONSTRAINT `FK_pictures_standarts` FOREIGN KEY (`size`) REFERENCES `standarts` (`id`),
  CONSTRAINT `FK_pictures_styles` FOREIGN KEY (`style`) REFERENCES `styles` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Дамп данных таблицы art_gallery.pictures: ~0 rows (приблизительно)
DELETE FROM `pictures`;
/*!40000 ALTER TABLE `pictures` DISABLE KEYS */;
/*!40000 ALTER TABLE `pictures` ENABLE KEYS */;

-- Дамп структуры для таблица art_gallery.standarts
CREATE TABLE IF NOT EXISTS `standarts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `width` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы art_gallery.standarts: ~7 rows (приблизительно)
DELETE FROM `standarts`;
/*!40000 ALTER TABLE `standarts` DISABLE KEYS */;
INSERT INTO `standarts` (`id`, `name`, `height`, `width`) VALUES
	(1, 'A0', 1189, 841),
	(2, 'A1', 594, 841),
	(3, 'A2', 594, 420),
	(4, 'A3', 594, 297),
	(5, 'A4', 297, 210),
	(6, 'A5', 210, 148),
	(7, 'other', 0, 0);
/*!40000 ALTER TABLE `standarts` ENABLE KEYS */;

-- Дамп структуры для таблица art_gallery.styles
CREATE TABLE IF NOT EXISTS `styles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы art_gallery.styles: ~5 rows (приблизительно)
DELETE FROM `styles`;
/*!40000 ALTER TABLE `styles` DISABLE KEYS */;
INSERT INTO `styles` (`id`, `name`) VALUES
	(1, 'landscapes'),
	(2, 'portraits'),
	(3, 'string'),
	(4, 'sea landscapes'),
	(5, 'universal');
/*!40000 ALTER TABLE `styles` ENABLE KEYS */;

-- Дамп структуры для таблица art_gallery.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `role` tinyint(4) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы art_gallery.users: ~1 rows (приблизительно)
DELETE FROM `users`;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `login`, `password`, `role`, `email`) VALUES
	(1, 'admin', 'admin', 1, 'shabundzmy@gmail.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
