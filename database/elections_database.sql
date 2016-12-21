-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 01, 2015 at 02:57 PM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `elections_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `candidate`
--

CREATE TABLE IF NOT EXISTS `candidate` (
  `candidate_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `date_of_birth` varchar(20) NOT NULL,
  `party_name` varchar(50) NOT NULL,
  PRIMARY KEY (`candidate_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `candidate`
--

INSERT INTO `candidate` (`candidate_id`, `first_name`, `last_name`, `date_of_birth`, `party_name`) VALUES
(1, 'Arvind ', 'Kejriwal', '16/081968', 'AAP'),
(2, 'Narendra ', 'Modi', '17/09/1950', 'BJP');

-- --------------------------------------------------------

--
-- Table structure for table `database_administrator`
--

CREATE TABLE IF NOT EXISTS `database_administrator` (
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `login_id` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `database_administrator`
--

INSERT INTO `database_administrator` (`first_name`, `last_name`, `login_id`, `password`) VALUES
('Gaurav', 'Harchwani', 'admin', 'admin1232');

-- --------------------------------------------------------

--
-- Table structure for table `party`
--

CREATE TABLE IF NOT EXISTS `party` (
  `voter_id` int(11) DEFAULT NULL,
  `candidate_id` int(11) DEFAULT NULL,
  KEY `voter_id` (`voter_id`),
  KEY `candidate_id` (`candidate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `party`
--

INSERT INTO `party` (`voter_id`, `candidate_id`) VALUES
(1, 1),
(3, 2),
(4, 2),
(8, 2);

-- --------------------------------------------------------

--
-- Table structure for table `voter`
--

CREATE TABLE IF NOT EXISTS `voter` (
  `voter_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `localAddress` varchar(50) NOT NULL,
  `city` varchar(50) NOT NULL,
  `state` varchar(50) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `voted` tinyint(1) NOT NULL,
  PRIMARY KEY (`voter_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `voter`
--

INSERT INTO `voter` (`voter_id`, `first_name`, `last_name`, `password`, `dob`, `localAddress`, `city`, `state`, `contact`, `voted`) VALUES
(1, 'Gaurav', 'Harchwani', 'iamgaurav', '24/05/1993', '402,vinodapt,netaji road,ulhasnagar-4', 'Mumbai', 'Maharashtra', '9762342826', 1),
(2, 'Raj', 'Mukta', 'iamraj', '24/08/1993', '504,vinod apt,netaji road', 'mumbai', 'maharashtra', '7709772277', 0),
(3, 'Manav', 'L', '123456', '4/5/3', 'jdhf', 'ddjfhdjfh', 'fhdjfd', '456', 1),
(4, 'jx', 'oj', '123456789123456789', '246512', 'gfg', 'df', 'fgf', '4564', 1),
(5, 'Jaggu', 'Didi', 'iamjaggu', '24/05/1985', '82,Alpha Apt,Andheri', 'Mumbai', 'Maharashtra', '7898745654', 0),
(6, 'dfdfd', 'gff', 'hh123', '24/4/1995', 'hh', 'hh', 'hh', '789456123', 0),
(7, 'janu', 'dingrja', 'janu123', '789', 'bunglow area', 'unr', 'mhrastra', '654', 0),
(8, 'Sandeep', 'T', 'sandeep123', '24/4/93', 'ulhasnaagr-4,darbar', 'thane', 'Maharashtra', '7894567777', 1);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `party`
--
ALTER TABLE `party`
  ADD CONSTRAINT `party_ibfk_1` FOREIGN KEY (`voter_id`) REFERENCES `voter` (`voter_id`),
  ADD CONSTRAINT `party_ibfk_2` FOREIGN KEY (`candidate_id`) REFERENCES `candidate` (`candidate_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
