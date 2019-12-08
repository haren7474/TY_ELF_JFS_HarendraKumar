-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2019 at 06:42 PM
-- Server version: 5.5.27
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ty_fms_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `contract`
--

CREATE TABLE `contract` (
  `contract_Id` int(11) NOT NULL,
  `customer_Id` int(11) NOT NULL,
  `product_Id` int(11) NOT NULL,
  `haulier_Id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `delivery_Date` date NOT NULL,
  `day` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contract`
--

INSERT INTO `contract` (`contract_Id`, `customer_Id`, `product_Id`, `haulier_Id`, `quantity`, `delivery_Date`, `day`) VALUES
(501, 2, 1005, 7, 10, '2019-12-13', 'Monday'),
(502, 11, 1002, 10, 25, '2019-12-12', 'Thursday');

-- --------------------------------------------------------

--
-- Table structure for table `land`
--

CREATE TABLE `land` (
  `land_Id` int(11) NOT NULL,
  `owner_Id` varchar(20) DEFAULT NULL,
  `land_Area_In_Sq_Feet` int(11) DEFAULT NULL,
  `land_Latitude` varchar(10) DEFAULT NULL,
  `land_Longitude` varchar(10) DEFAULT NULL,
  `land_Cost` double DEFAULT NULL,
  `land_Tax` double DEFAULT NULL,
  `is_Land_Disputed` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `land`
--

INSERT INTO `land` (`land_Id`, `owner_Id`, `land_Area_In_Sq_Feet`, `land_Latitude`, `land_Longitude`, `land_Cost`, `land_Tax`, `is_Land_Disputed`) VALUES
(5001, '4', 1600, '12', '78', 6000, 40, 0),
(5002, '3', 2000, '120', '130', 36000, 50, 0),
(5003, '6', 1200, '56', '75', 13000, 25, 1),
(5004, '4', 1500, '26', '49', 13000, 65, 0);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `product_Id` int(11) NOT NULL,
  `product_Name` varchar(20) NOT NULL,
  `product_Quantity` int(11) NOT NULL,
  `product_Price` double NOT NULL,
  `productComments` varchar(60) NOT NULL,
  `productOwnerId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_Id`, `product_Name`, `product_Quantity`, `product_Price`, `productComments`, `productOwnerId`) VALUES
(1001, 'Wood', 120, 150, 'This wood is good.', 6),
(1002, 'Timber', 15, 560, 'Limited Stock', 6),
(1003, 'Rubber', 250, 13, 'For short period use only.', 3),
(1004, 'Glue', 15, 3, 'For use with notebooks only.', 4),
(1005, 'Banana', 1000, 20, 'Use within a month.', 3),
(1006, 'Pepper', 150, 20, '3 Months validity.', 4);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_Id` int(11) NOT NULL,
  `user_Type` varchar(15) NOT NULL,
  `full_Name` varchar(30) NOT NULL,
  `street_Add1` varchar(40) NOT NULL,
  `street_Add2` varchar(40) NOT NULL,
  `town` varchar(15) NOT NULL,
  `postal_Code` int(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `mobile_Number` bigint(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_Id`, `user_Type`, `full_Name`, `street_Add1`, `street_Add2`, `town`, `postal_Code`, `email`, `mobile_Number`, `password`) VALUES
(2, 'Customer', 'Haren', 'Center Rd', '5th Square', 'Austin Town', 560047, 'haren@gmail.com', 9916771904, '12345'),
(3, 'Owner', 'Abbas', 'Jama', 'Market', 'Bangalore', 560046, 'abbas@gmail.com', 9656231245, '12347'),
(4, 'Owner', 'Harry', '1st Main', '5th Rd', 'Victoria', 560044, 'harry@gmail.com', 9865858585, '12345'),
(5, 'Customer', 'Sweta', 'Lake Raod', 'BTM', 'Bangalore', 560029, 'sweta@gmail.com', 9865221102, '12345'),
(6, 'Owner', 'Rohit', '6Th Main', 'Marathalli', 'Bnagalore', 560035, 'rohit@gmail.com', 9565231214, '123456789'),
(7, 'Haulier', 'Rahul', '7th Cross', 'Bilakhalli', 'Bangalore', 560014, 'rahul@hmail.com', 9652314125, 'rohit12'),
(8, 'Admin', 'Prakhar', '1st Sector', 'HSR', 'Bangalore', 560041, 'prkhr@yahoo.in', 8887651214, 'prakhar'),
(9, 'Admin', 'Haren', '5th Square', 'Austin Town', 'Bangalore', 560047, 'sunny@gmail.com', 9916771904, 'haren'),
(10, 'Haulier', 'Surya', '3rd Cross', '1st Main', 'Coimbatore', 560042, 'surya@gmail.com', 9865321456, 'surya'),
(11, 'Customer', 'Shikha', '5th main', 'Hennur', 'Bangalore', 560049, 'sikha@gmail.com', 9565223311, 'shikha');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contract`
--
ALTER TABLE `contract`
  ADD PRIMARY KEY (`contract_Id`);

--
-- Indexes for table `land`
--
ALTER TABLE `land`
  ADD PRIMARY KEY (`land_Id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_Id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contract`
--
ALTER TABLE `contract`
  MODIFY `contract_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=503;

--
-- AUTO_INCREMENT for table `land`
--
ALTER TABLE `land`
  MODIFY `land_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5005;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `product_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1010;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
