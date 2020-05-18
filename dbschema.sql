-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2020 at 05:50 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `taxi24`
--

-- --------------------------------------------------------

--
-- Table structure for table `driver`
--

CREATE TABLE IF NOT EXISTS `driver` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `distance` double NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `license_plate` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  `vehicle_model` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `driver`
--

INSERT INTO `driver` (`id`, `distance`, `first_name`, `last_name`, `license_plate`, `location`, `phone_number`, `status`, `vehicle_model`) VALUES
(1, 3, 'George', 'Gitere', 'ABC 3232', 'Kigali', '43847387', b'1', 'Toyota Vitz');

-- --------------------------------------------------------

--
-- Table structure for table `rider`
--

CREATE TABLE IF NOT EXISTS `rider` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `rider`
--

INSERT INTO `rider` (`id`, `first_name`, `last_name`, `phone_number`, `status`) VALUES
(1, 'pesh', 'masaa', '3894839', b'1');

-- --------------------------------------------------------

--
-- Table structure for table `trip`
--

CREATE TABLE IF NOT EXISTS `trip` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `distance` double NOT NULL,
  `driver_id` bigint(20) NOT NULL,
  `end_time` datetime DEFAULT NULL,
  `rider_id` bigint(20) NOT NULL,
  `start_time` datetime DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `trip`
--

INSERT INTO `trip` (`id`, `distance`, `driver_id`, `end_time`, `rider_id`, `start_time`, `status`) VALUES
(1, 88, 1, '2020-05-18 06:09:16', 1, '2020-05-18 05:39:34', 'Completed');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
