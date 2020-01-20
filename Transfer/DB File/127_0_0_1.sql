-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 20, 2020 at 12:10 PM
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
-- Database: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `test`;
--
-- Database: `ty_blr_springboot_product`
--
CREATE DATABASE IF NOT EXISTS `ty_blr_springboot_product` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ty_blr_springboot_product`;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(30);

-- --------------------------------------------------------

--
-- Table structure for table `productbean`
--

CREATE TABLE `productbean` (
  `id` int(11) NOT NULL,
  `cost` double DEFAULT NULL,
  `imageUrl` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `productbean`
--

INSERT INTO `productbean` (`id`, `cost`, `imageUrl`, `name`) VALUES
(3, 69999, 'https://cdn.pixabay.com/photo/2016/11/29/05/08/apple-1867461__340.jpg', 'Apple'),
(4, 8000, 'https://cdn.pixabay.com/photo/2014/05/02/21/50/home-office-336378__340.jpg', 'MacBook'),
(5, 75000, 'https://cdn.pixabay.com/photo/2017/04/22/10/44/camera-2251051__340.jpg', 'Canon DSLR'),
(6, 5600, 'https://cdn.pixabay.com/photo/2015/03/26/09/58/headphones-690685__340.jpg', 'Boat Headset'),
(7, 6299, 'https://cdn.pixabay.com/photo/2017/02/10/14/10/virtual-2055227__340.png', 'VR Play'),
(8, 40000, 'https://cdn.pixabay.com/photo/2018/05/20/09/47/oneplus-3415375__340.jpg', 'One Plus'),
(15, 20000, 'https://cdn.pixabay.com/photo/2016/11/03/20/03/music-on-your-smartphone-1796117__340.jpg', 'Samsung'),
(18, 55000, 'https://cdn.pixabay.com/photo/2018/10/11/05/11/google-pixel-3-3738925_960_720.png', 'Google Pixel 3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `productbean`
--
ALTER TABLE `productbean`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_abm8be5o2syl5j8u8twwxlvia` (`imageUrl`);
--
-- Database: `ty_boot_user_angular`
--
CREATE DATABASE IF NOT EXISTS `ty_boot_user_angular` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ty_boot_user_angular`;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(24);

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE `user_info` (
  `id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) NOT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`id`, `email`, `gender`, `name`, `password`, `phone`, `role`) VALUES
(11, 'haren@gmail.com', 'male', 'Harendra', '$2a$10$cv50cA7ma2.3B6hb0N0gGOHR7FinH8J2AfIkLOs3a6YoSgi0xX6Me', '9916771904', 'admin'),
(15, 'sweta@gmail.com', 'female', 'Sweta', '$2a$10$YnBTJNEgbhX4bleAikIO4.2yX1JPI9rjVUd/H9oYx3ehk2UFQ/jv6', '9856231245', 'user'),
(20, 'giri@gmail.com', 'male', 'Giri', '$2a$10$UPosDq6ePi949hwR/cDOk.F/c3YhxuquUBWWG9cjdcBxcNdxHKaam', '9865124875', 'admin'),
(21, 'prakhar@gmail.com', 'male', 'Prakhar', '$2a$10$QBP.EmTcHOgxZR7nOTPOt.9mc9OKhur9oD7ca6CKnMUJ0Z.RiCOAu', '9874561512', 'admin'),
(23, 'shiraaz@gmail.com', 'male', 'Shiraaz', '$2a$10$L208yMQ1aCtvdyUI5HWwz.5qpHuh66y3W2gqxkSzhXLdd.JCveaUu', '9858251412', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_info`
--
ALTER TABLE `user_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_gnu0k8vv6ptioedbxbfsnan9g` (`email`),
  ADD UNIQUE KEY `UK_5m9cb1vslu82sm2y4nd2xaj4f` (`phone`);
--
-- Database: `ty_cg_nov6`
--
CREATE DATABASE IF NOT EXISTS `ty_cg_nov6` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ty_cg_nov6`;

-- --------------------------------------------------------

--
-- Table structure for table `employeeexperience`
--

CREATE TABLE `employeeexperience` (
  `expId` int(11) NOT NULL,
  `company` varchar(255) DEFAULT NULL,
  `numberOfYears` int(11) DEFAULT NULL,
  `eid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employeeexperience`
--

INSERT INTO `employeeexperience` (`expId`, `company`, `numberOfYears`, `eid`) VALUES
(6001, 'Infy', 5, 515),
(6002, 'TCS', 2, 515);

-- --------------------------------------------------------

--
-- Table structure for table `employeepersonal`
--

CREATE TABLE `employeepersonal` (
  `eid` int(11) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ename` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employeepersonal`
--

INSERT INTO `employeepersonal` (`eid`, `age`, `email`, `ename`, `pass`) VALUES
(501, 26, 'prakhar@gmail.com', 'Prakhar', '12345'),
(511, 26, 'puja@gmail.com', 'Puja', '12345'),
(512, 26, 'gita@gmail.com', 'Gita', '12345'),
(515, 24, 'ramesh@gmail.com', 'Ramesh', '12345'),
(599, 26, 'prakhar@gmail.com', 'Prakhar', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `employeepersonal_traininginfo`
--

CREATE TABLE `employeepersonal_traininginfo` (
  `tid` int(11) NOT NULL,
  `eid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employeepersonal_traininginfo`
--

INSERT INTO `employeepersonal_traininginfo` (`tid`, `eid`) VALUES
(1001, 511),
(1001, 512);

-- --------------------------------------------------------

--
-- Table structure for table `employeeprofessional`
--

CREATE TABLE `employeeprofessional` (
  `pid` int(11) NOT NULL,
  `company` varchar(255) DEFAULT NULL,
  `pan` varchar(255) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `eid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employeeprofessional`
--

INSERT INTO `employeeprofessional` (`pid`, `company`, `pan`, `salary`, `eid`) VALUES
(104, 'DTDC', 'CKFHD1634R', 400, 501),
(146, 'DTDC', 'CKFHD1634R', 400, 599);

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE `movie` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `rating` varchar(10) NOT NULL,
  `year` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`id`, `name`, `rating`, `year`) VALUES
(101, 'Pink', 'Very good', 2006),
(102, 'Black', 'Good', 2006),
(103, 'Red', 'Bad', 2006);

-- --------------------------------------------------------

--
-- Table structure for table `pma__bookmark`
--

CREATE TABLE `pma__bookmark` (
  `id` int(10) UNSIGNED NOT NULL,
  `dbase` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `user` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `label` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `query` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Bookmarks';

-- --------------------------------------------------------

--
-- Table structure for table `pma__central_columns`
--

CREATE TABLE `pma__central_columns` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_length` text COLLATE utf8_bin,
  `col_collation` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_isNull` tinyint(1) NOT NULL,
  `col_extra` varchar(255) COLLATE utf8_bin DEFAULT '',
  `col_default` text COLLATE utf8_bin
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Central list of columns';

-- --------------------------------------------------------

--
-- Table structure for table `pma__column_info`
--

CREATE TABLE `pma__column_info` (
  `id` int(5) UNSIGNED NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `column_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `mimetype` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Column information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__designer_settings`
--

CREATE TABLE `pma__designer_settings` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `settings_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Settings related to Designer';

--
-- Dumping data for table `pma__designer_settings`
--

INSERT INTO `pma__designer_settings` (`username`, `settings_data`) VALUES
('root', '{\"relation_lines\":\"true\",\"angular_direct\":\"direct\",\"snap_to_grid\":\"off\"}');

-- --------------------------------------------------------

--
-- Table structure for table `pma__export_templates`
--

CREATE TABLE `pma__export_templates` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `export_type` varchar(10) COLLATE utf8_bin NOT NULL,
  `template_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `template_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved export templates';

-- --------------------------------------------------------

--
-- Table structure for table `pma__favorite`
--

CREATE TABLE `pma__favorite` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Favorite tables';

-- --------------------------------------------------------

--
-- Table structure for table `pma__history`
--

CREATE TABLE `pma__history` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `timevalue` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `sqlquery` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='SQL history for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__navigationhiding`
--

CREATE TABLE `pma__navigationhiding` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Hidden items of navigation tree';

-- --------------------------------------------------------

--
-- Table structure for table `pma__pdf_pages`
--

CREATE TABLE `pma__pdf_pages` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `page_nr` int(10) UNSIGNED NOT NULL,
  `page_descr` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='PDF relation pages for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__recent`
--

CREATE TABLE `pma__recent` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Recently accessed tables';

-- --------------------------------------------------------

--
-- Table structure for table `pma__relation`
--

CREATE TABLE `pma__relation` (
  `master_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Relation table';

-- --------------------------------------------------------

--
-- Table structure for table `pma__savedsearches`
--

CREATE TABLE `pma__savedsearches` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved searches';

-- --------------------------------------------------------

--
-- Table structure for table `pma__table_coords`
--

CREATE TABLE `pma__table_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pdf_page_number` int(11) NOT NULL DEFAULT '0',
  `x` float UNSIGNED NOT NULL DEFAULT '0',
  `y` float UNSIGNED NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for phpMyAdmin PDF output';

-- --------------------------------------------------------

--
-- Table structure for table `pma__table_info`
--

CREATE TABLE `pma__table_info` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `display_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__table_uiprefs`
--

CREATE TABLE `pma__table_uiprefs` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `prefs` text COLLATE utf8_bin NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tables'' UI preferences';

-- --------------------------------------------------------

--
-- Table structure for table `pma__tracking`
--

CREATE TABLE `pma__tracking` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `version` int(10) UNSIGNED NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `schema_snapshot` text COLLATE utf8_bin NOT NULL,
  `schema_sql` text COLLATE utf8_bin,
  `data_sql` longtext COLLATE utf8_bin,
  `tracking` set('UPDATE','REPLACE','INSERT','DELETE','TRUNCATE','CREATE DATABASE','ALTER DATABASE','DROP DATABASE','CREATE TABLE','ALTER TABLE','RENAME TABLE','DROP TABLE','CREATE INDEX','DROP INDEX','CREATE VIEW','ALTER VIEW','DROP VIEW') COLLATE utf8_bin DEFAULT NULL,
  `tracking_active` int(1) UNSIGNED NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Database changes tracking for phpMyAdmin';

-- --------------------------------------------------------

--
-- Table structure for table `pma__userconfig`
--

CREATE TABLE `pma__userconfig` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `timevalue` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `config_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User preferences storage for phpMyAdmin';

--
-- Dumping data for table `pma__userconfig`
--

INSERT INTO `pma__userconfig` (`username`, `timevalue`, `config_data`) VALUES
('root', '2019-12-31 18:12:59', '{\"Console\\/Mode\":\"collapse\"}');

-- --------------------------------------------------------

--
-- Table structure for table `pma__usergroups`
--

CREATE TABLE `pma__usergroups` (
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL,
  `tab` varchar(64) COLLATE utf8_bin NOT NULL,
  `allowed` enum('Y','N') COLLATE utf8_bin NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User groups with configured menu items';

-- --------------------------------------------------------

--
-- Table structure for table `pma__users`
--

CREATE TABLE `pma__users` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Users and their assignments to user groups';

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `pId` int(11) NOT NULL,
  `pName` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `traininginfo`
--

CREATE TABLE `traininginfo` (
  `tid` int(11) NOT NULL,
  `tname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `traininginfo`
--

INSERT INTO `traininginfo` (`tid`, `tname`) VALUES
(1001, 'MeanStack');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_Id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `full_Name` varchar(255) DEFAULT NULL,
  `mobile_Number` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `postal_Code` int(11) DEFAULT NULL,
  `street_Add1` varchar(255) DEFAULT NULL,
  `street_Add2` varchar(255) DEFAULT NULL,
  `town` varchar(255) DEFAULT NULL,
  `user_Type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE `user_info` (
  `userid` int(10) NOT NULL,
  `username` varchar(35) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`userid`, `username`, `email`, `password`) VALUES
(2019001, 'Haren', 'haren7474@gmail.com', '12345'),
(2019005, 'Swati', 'swati1@gmail.com', 'panda07'),
(2019009, 'Prakhar', 'prakhar@gmail.com', '12345'),
(2019078, 'Amit', 'am@gmail.com', '12345'),
(2019099, 'Damini', 'daman@gmail.com', 'damini'),
(2019112, 'Shreya', 'shr@gmail.com', '12345'),
(2019121, 'Nitin', 'nitin@gmail.com', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employeeexperience`
--
ALTER TABLE `employeeexperience`
  ADD PRIMARY KEY (`expId`),
  ADD KEY `FKaqsv70iw5kjjmk19f0axracrp` (`eid`);

--
-- Indexes for table `employeepersonal`
--
ALTER TABLE `employeepersonal`
  ADD PRIMARY KEY (`eid`);

--
-- Indexes for table `employeepersonal_traininginfo`
--
ALTER TABLE `employeepersonal_traininginfo`
  ADD KEY `FKjt92g124uqly0d8yp1apxx5uv` (`eid`),
  ADD KEY `FKqpxmyitsemmjenpcd82kgranc` (`tid`);

--
-- Indexes for table `employeeprofessional`
--
ALTER TABLE `employeeprofessional`
  ADD PRIMARY KEY (`pid`),
  ADD KEY `FKf975ixchsenkgp7tp995oo6b3` (`eid`);

--
-- Indexes for table `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pma__central_columns`
--
ALTER TABLE `pma__central_columns`
  ADD PRIMARY KEY (`db_name`,`col_name`);

--
-- Indexes for table `pma__column_info`
--
ALTER TABLE `pma__column_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `db_name` (`db_name`,`table_name`,`column_name`);

--
-- Indexes for table `pma__designer_settings`
--
ALTER TABLE `pma__designer_settings`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_user_type_template` (`username`,`export_type`,`template_name`);

--
-- Indexes for table `pma__favorite`
--
ALTER TABLE `pma__favorite`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__history`
--
ALTER TABLE `pma__history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`,`db`,`table`,`timevalue`);

--
-- Indexes for table `pma__navigationhiding`
--
ALTER TABLE `pma__navigationhiding`
  ADD PRIMARY KEY (`username`,`item_name`,`item_type`,`db_name`,`table_name`);

--
-- Indexes for table `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  ADD PRIMARY KEY (`page_nr`),
  ADD KEY `db_name` (`db_name`);

--
-- Indexes for table `pma__recent`
--
ALTER TABLE `pma__recent`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__relation`
--
ALTER TABLE `pma__relation`
  ADD PRIMARY KEY (`master_db`,`master_table`,`master_field`),
  ADD KEY `foreign_field` (`foreign_db`,`foreign_table`);

--
-- Indexes for table `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_savedsearches_username_dbname` (`username`,`db_name`,`search_name`);

--
-- Indexes for table `pma__table_coords`
--
ALTER TABLE `pma__table_coords`
  ADD PRIMARY KEY (`db_name`,`table_name`,`pdf_page_number`);

--
-- Indexes for table `pma__table_info`
--
ALTER TABLE `pma__table_info`
  ADD PRIMARY KEY (`db_name`,`table_name`);

--
-- Indexes for table `pma__table_uiprefs`
--
ALTER TABLE `pma__table_uiprefs`
  ADD PRIMARY KEY (`username`,`db_name`,`table_name`);

--
-- Indexes for table `pma__tracking`
--
ALTER TABLE `pma__tracking`
  ADD PRIMARY KEY (`db_name`,`table_name`,`version`);

--
-- Indexes for table `pma__userconfig`
--
ALTER TABLE `pma__userconfig`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pma__usergroups`
--
ALTER TABLE `pma__usergroups`
  ADD PRIMARY KEY (`usergroup`,`tab`,`allowed`);

--
-- Indexes for table `pma__users`
--
ALTER TABLE `pma__users`
  ADD PRIMARY KEY (`username`,`usergroup`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`pId`);

--
-- Indexes for table `traininginfo`
--
ALTER TABLE `traininginfo`
  ADD PRIMARY KEY (`tid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_Id`);

--
-- Indexes for table `user_info`
--
ALTER TABLE `user_info`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__column_info`
--
ALTER TABLE `pma__column_info`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__history`
--
ALTER TABLE `pma__history`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  MODIFY `page_nr` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employeeexperience`
--
ALTER TABLE `employeeexperience`
  ADD CONSTRAINT `FKaqsv70iw5kjjmk19f0axracrp` FOREIGN KEY (`eid`) REFERENCES `employeepersonal` (`eid`);

--
-- Constraints for table `employeepersonal_traininginfo`
--
ALTER TABLE `employeepersonal_traininginfo`
  ADD CONSTRAINT `FKjt92g124uqly0d8yp1apxx5uv` FOREIGN KEY (`eid`) REFERENCES `employeepersonal` (`eid`),
  ADD CONSTRAINT `FKqpxmyitsemmjenpcd82kgranc` FOREIGN KEY (`tid`) REFERENCES `traininginfo` (`tid`);

--
-- Constraints for table `employeeprofessional`
--
ALTER TABLE `employeeprofessional`
  ADD CONSTRAINT `FKf975ixchsenkgp7tp995oo6b3` FOREIGN KEY (`eid`) REFERENCES `employeepersonal` (`eid`);
--
-- Database: `ty_employee_blr_springboot`
--
CREATE DATABASE IF NOT EXISTS `ty_employee_blr_springboot` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ty_employee_blr_springboot`;

-- --------------------------------------------------------

--
-- Table structure for table `employee_address_info`
--

CREATE TABLE `employee_address_info` (
  `id` int(11) NOT NULL,
  `add_type` varchar(255) NOT NULL,
  `address1` varchar(255) DEFAULT NULL,
  `address2` varchar(255) DEFAULT NULL,
  `emp_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee_address_info`
--

INSERT INTO `employee_address_info` (`id`, `add_type`, `address1`, `address2`, `emp_id`) VALUES
(2, 'P', 'Aliganj', 'Etah', NULL),
(3, 'C', 'Austin', 'Blr', NULL),
(5, 'P', 'Aliganj', 'Etah', NULL),
(6, 'C', 'Austin', 'Blr', NULL),
(11, 'P', 'Aliganj', 'Etah', NULL),
(12, 'C', 'Austin', 'Blr', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `employee_info`
--

CREATE TABLE `employee_info` (
  `id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee_info`
--

INSERT INTO `employee_info` (`id`, `email`, `name`, `password`) VALUES
(1, 'sumit@gmail.com', 'Sumit', '$2a$10$vW0ZuZcQ7hsBLimyFJLaOuLZ0w2QVOUW9m4BTHabdGXrJUEhualvO'),
(4, 'amit@gmail.com', 'Amit', '$2a$10$ENAZcCAY21p5x0HA8RmfbeUb2Yk6sZUETbI80q/Rm0ITHAb8lgqLC');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(13),
(13);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee_address_info`
--
ALTER TABLE `employee_address_info`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2vwfvf8wbotst2jwivhyc3jbp` (`emp_id`);

--
-- Indexes for table `employee_info`
--
ALTER TABLE `employee_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_nnscmjlrnr0bjxutd9xbgpo8q` (`email`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employee_address_info`
--
ALTER TABLE `employee_address_info`
  ADD CONSTRAINT `FK2vwfvf8wbotst2jwivhyc3jbp` FOREIGN KEY (`emp_id`) REFERENCES `employee_info` (`id`);
--
-- Database: `ty_employee_blr_springmvc`
--
CREATE DATABASE IF NOT EXISTS `ty_employee_blr_springmvc` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ty_employee_blr_springmvc`;

-- --------------------------------------------------------

--
-- Table structure for table `employee_address_info`
--

CREATE TABLE `employee_address_info` (
  `id` int(11) NOT NULL,
  `addType` varchar(255) NOT NULL,
  `address1` varchar(255) DEFAULT NULL,
  `address2` varchar(255) DEFAULT NULL,
  `emp_id` int(11) DEFAULT NULL,
  `add_type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee_address_info`
--

INSERT INTO `employee_address_info` (`id`, `addType`, `address1`, `address2`, `emp_id`, `add_type`) VALUES
(11, 'P', 'Bull Road', 'Bangalore', 10, ''),
(12, 'C', 'Shivmoga', 'Bangalore', 10, ''),
(14, 'P', 'Aliganj', 'Etah', 13, ''),
(15, 'C', 'Austin', 'Blr', 13, '');

-- --------------------------------------------------------

--
-- Table structure for table `employee_info`
--

CREATE TABLE `employee_info` (
  `id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee_info`
--

INSERT INTO `employee_info` (`id`, `email`, `name`, `password`) VALUES
(10, 'giri@gmail.com', 'Girighar', '$2a$10$ZE8sToa.sPZme11g8sUeiuo12yneBjbzOBxA5oh.E0RIQAzmgXkl6'),
(13, 'haren@gmail.com', 'harendra', '$2a$10$aB3TAIboeyi9okqum8JCl.i7H0vr0aWrckXZQbNSB2oBe4oZojLme');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(31),
(31);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee_address_info`
--
ALTER TABLE `employee_address_info`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2vwfvf8wbotst2jwivhyc3jbp` (`emp_id`);

--
-- Indexes for table `employee_info`
--
ALTER TABLE `employee_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_nnscmjlrnr0bjxutd9xbgpo8q` (`email`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employee_address_info`
--
ALTER TABLE `employee_address_info`
  ADD CONSTRAINT `FK2vwfvf8wbotst2jwivhyc3jbp` FOREIGN KEY (`emp_id`) REFERENCES `employee_info` (`id`);
--
-- Database: `ty_fms_db`
--
CREATE DATABASE IF NOT EXISTS `ty_fms_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ty_fms_db`;

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `bill_Id` int(11) NOT NULL,
  `contract_Id` int(11) NOT NULL,
  `paid_Amount` double NOT NULL,
  `bill_Timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `billing`
--

INSERT INTO `billing` (`bill_Id`, `contract_Id`, `paid_Amount`, `bill_Timestamp`) VALUES
(5001, 501, 150, '2019-12-09 16:59:11'),
(5002, 502, 30, '2019-12-10 06:12:12'),
(5003, 503, 130, '2019-12-10 09:57:27'),
(5008, 504, 500, '2019-12-10 17:39:36'),
(5009, 506, 20, '2019-12-19 12:12:09'),
(5010, 510, 20, '2019-12-21 06:18:35'),
(5011, 509, 15, '2019-12-22 12:51:45'),
(5012, 512, 200, '2019-12-22 14:37:47'),
(5013, 513, 100, '2019-12-24 13:59:41'),
(5014, 514, 50, '2019-12-25 05:44:02');

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
(502, 11, 1002, 10, 25, '2019-12-12', 'Thursday'),
(503, 2, 1003, 7, 10, '2019-09-16', 'Thursday'),
(504, 11, 1006, 10, 30, '2019-12-21', 'Wednesday'),
(506, 2, 1006, 7, 12, '2019-12-12', 'Monday'),
(508, 5, 1006, 7, 10, '2019-05-05', 'Sunday'),
(509, 11, 1001, 7, 10, '2019-12-19', 'Thursday'),
(510, 11, 1004, 12, 10, '2019-12-21', 'Saturday'),
(511, 5, 1003, 12, 10, '2019-12-22', 'Sunday'),
(512, 11, 1010, 10, 30, '2019-12-24', 'Tuesday'),
(513, 18, 1011, 10, 50, '2019-12-26', 'Thursday'),
(514, 16, 1011, 10, 15, '2019-12-28', 'Saturday'),
(515, 5, 1011, 7, 0, '2019-12-29', 'Sunday'),
(516, 5, 1011, 7, 0, '2019-12-29', 'Sunday'),
(517, 11, 1011, 10, 15, '2019-12-29', 'Sunday'),
(518, 5, 1003, 7, 2, '2019-12-28', 'Saturday');

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
(5001, '4', 1600, '12', '78', 6000, 30, 0),
(5002, '3', 2000, '120', '130', 36000, 50, 0),
(5003, '6', 1200, '56', '75', 13000, 25, 1),
(5004, '4', 1500, '26', '49', 13000, 65, 0),
(5005, '3', 2200, '450', '650', 45000, 130, 0),
(5006, '4', 2300, '596', '589', 26000, 50, 0),
(5007, '6', 1230, '125', '56', 22000, 125, 0);

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
(1001, 'Wood', 12, 150, 'This wood is good.', 6),
(1002, 'Timber', 15, 560, 'Limited Stock', 6),
(1003, 'Rubber', 14, 13, 'For short period use only.', 3),
(1004, 'Glue', 15, 3, 'For use with notebooks only.', 4),
(1005, 'Banana', 30, 20, 'Use within a month.', 3),
(1006, 'Pepper', 15, 20, '3 Months validity.', 4),
(1010, 'Stem', 70, 20, 'TO be consumed within 3 months', 14),
(1011, 'Timber', 38, 10, 'this is valid for 5 months', 14);

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
(11, 'Customer', 'Sikha', '5th main', 'Hennur', 'Bangalore', 560049, 'sikha@gmail.com', 9565223311, 'sikha'),
(12, 'Haulier', 'Mansi', '7th Cross', 'Bull Road', 'Bangalore', 563325, 'mansi@gmail.com', 9656231545, '12345'),
(14, 'Owner', 'Swati', '5th Main', 'Munekolal', 'Bangalore', 560037, 'swati@gmail.com', 9865321245, '12345'),
(15, 'Customer', 'Tuhina', '5th Cross', 'Vivek Nagar', 'Delhi', 120012, 'Vivek@gmail.com', 9865231245, '454545'),
(16, 'Customer', 'Deepu', 'Worli Rd', 'Worli', 'Mumbai', 100231, 'deepu@gmail.com', 986532124, '9865321245'),
(17, 'Customer', 'Salim', '1st Main', 'Hegdenagar', 'Bangalore', 568945, 'salim@gmail.com', 9865123212, 'Salim@123'),
(18, 'Customer', 'Salim', '1ts main', 'BTM', 'Bangalore', 560012, 'salim@hmail.com', 9865321010, 'Audi@1234'),
(20, 'Scheduler', 'Giri', 'Lake Road', 'BTM', 'Bangalore', 560029, 'giri@gmail.com', 9865231245, 'Giri@123'),
(21, 'Haulier', 'Nityash', '56th Rd', 'Lake', 'Bangalore', 562345, 'nity@gmail.com', 9898986532, 'Nit@12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`bill_Id`);

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
-- AUTO_INCREMENT for table `billing`
--
ALTER TABLE `billing`
  MODIFY `bill_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5015;

--
-- AUTO_INCREMENT for table `contract`
--
ALTER TABLE `contract`
  MODIFY `contract_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=519;

--
-- AUTO_INCREMENT for table `land`
--
ALTER TABLE `land`
  MODIFY `land_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5008;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `product_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1012;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
--
-- Database: `ty_fms_mapping_db`
--
CREATE DATABASE IF NOT EXISTS `ty_fms_mapping_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ty_fms_mapping_db`;

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `bill_Id` int(11) NOT NULL,
  `bill_Timestamp` datetime DEFAULT NULL,
  `paid_Amount` double DEFAULT NULL,
  `contractId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `billing`
--

INSERT INTO `billing` (`bill_Id`, `bill_Timestamp`, `paid_Amount`, `contractId`) VALUES
(5001, '2020-01-01 11:15:12', 300, 2001);

-- --------------------------------------------------------

--
-- Table structure for table `billing_seq`
--

CREATE TABLE `billing_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `billing_seq`
--

INSERT INTO `billing_seq` (`next_val`) VALUES
(15999);

-- --------------------------------------------------------

--
-- Table structure for table `contract`
--

CREATE TABLE `contract` (
  `contract_Id` int(11) NOT NULL,
  `customer_Id` int(11) DEFAULT NULL,
  `day` varchar(255) DEFAULT NULL,
  `delivery_Date` datetime DEFAULT NULL,
  `haulier_Id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `productId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contract`
--

INSERT INTO `contract` (`contract_Id`, `customer_Id`, `day`, `delivery_Date`, `haulier_Id`, `quantity`, `productId`) VALUES
(2001, 1499, 'Monday', '2020-01-20 05:30:00', 501, 25, 1001),
(2002, 1499, 'Friday', '2020-02-21 00:00:00', 501, 10, 1001),
(4501, 0, NULL, NULL, 0, 20, 2503),
(4502, 0, NULL, '2020-01-16 05:30:00', 0, 10, 4000),
(4503, 1499, 'Sunday', '2020-02-02 05:30:00', 501, 2, 4000),
(4504, 0, 'Tuesday', '2020-01-21 05:30:00', 0, 10, 8515),
(4505, 0, 'Wednesday', '2020-01-22 05:30:00', 0, 20, 8517),
(4506, 0, NULL, '2020-01-16 05:30:00', 0, 10, 8517),
(4507, 5992, 'Thursday', '2020-01-30 05:30:00', 0, 25, 8517),
(4508, 5991, 'Thursday', '2020-01-30 05:30:00', 501, 10, 8515);

-- --------------------------------------------------------

--
-- Table structure for table `contract_seq`
--

CREATE TABLE `contract_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contract_seq`
--

INSERT INTO `contract_seq` (`next_val`) VALUES
(9498);

-- --------------------------------------------------------

--
-- Table structure for table `email_land`
--

CREATE TABLE `email_land` (
  `land_email_Id` int(11) NOT NULL,
  `email_Sender` varchar(255) DEFAULT NULL,
  `email_Text` varchar(255) DEFAULT NULL,
  `email_Timestamp` datetime DEFAULT NULL,
  `landId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `email_land`
--

INSERT INTO `email_land` (`land_email_Id`, `email_Sender`, `email_Text`, `email_Timestamp`, `landId`) VALUES
(8001, 'schedular@fms.com', 'Please pay taxes asap.', '2020-01-01 19:04:40', 6001),
(16501, 'scheduler@fms.com', 'Your taxes are overdue. Pleasse make payments.', '2020-01-01 22:22:17', 6003),
(25000, 'schedular@fms.com', 'Your tax due date is approaching.', '2020-01-02 10:12:02', 6001),
(33499, 'schedular@fms.com', 'Second reminder.', '2020-01-02 10:19:56', 6003),
(41998, 'schedular@fms.com', 'Pay taxes', '2020-01-03 18:46:59', 12501);

-- --------------------------------------------------------

--
-- Table structure for table `email_seq`
--

CREATE TABLE `email_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `email_seq`
--

INSERT INTO `email_seq` (`next_val`) VALUES
(58995);

-- --------------------------------------------------------

--
-- Table structure for table `land`
--

CREATE TABLE `land` (
  `land_Id` int(11) NOT NULL,
  `due_Date` datetime DEFAULT NULL,
  `is_Land_Disputed` bit(1) DEFAULT NULL,
  `land_Area_In_Sq_Feet` int(11) DEFAULT NULL,
  `land_Cost` double DEFAULT NULL,
  `land_Latitude` varchar(255) DEFAULT NULL,
  `land_Longitude` varchar(255) DEFAULT NULL,
  `land_Tax` double DEFAULT NULL,
  `userId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `land`
--

INSERT INTO `land` (`land_Id`, `due_Date`, `is_Land_Disputed`, `land_Area_In_Sq_Feet`, `land_Cost`, `land_Latitude`, `land_Longitude`, `land_Tax`, `userId`) VALUES
(6001, '2020-02-01 00:00:00', b'1', 1200, 36000, '78', '29', 80, 1998),
(6002, '2020-03-01 00:00:00', b'0', 1300, 37000, '78', '49', 90, 1998),
(6003, '2020-01-20 00:00:00', b'1', 1500, 40000, '45', '89', 100, 1998),
(12501, '2020-03-02 00:00:00', b'0', 79, 600, '29', '12', 25, 2497);

-- --------------------------------------------------------

--
-- Table structure for table `land_seq`
--

CREATE TABLE `land_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `land_seq`
--

INSERT INTO `land_seq` (`next_val`) VALUES
(25498);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `product_Id` int(11) NOT NULL,
  `product_Comments` varchar(255) DEFAULT NULL,
  `product_Name` varchar(255) DEFAULT NULL,
  `product_Price` double DEFAULT NULL,
  `product_Quantity` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `product_Image_Url` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_Id`, `product_Comments`, `product_Name`, `product_Price`, `product_Quantity`, `userId`, `product_Image_Url`) VALUES
(1001, 'This is good.', 'Timber', 20, 40, 2, 'https://cdn.pixabay.com/photo/2015/10/12/14/56/axe-984008__340.jpg'),
(2502, 'This is good.', 'Leaves', 30, 30, 2, 'https://cdn.pixabay.com/photo/2012/07/09/07/48/eat-52075__340.jpg'),
(2503, 'This is good.', 'Mint', 36, 15, 2, 'https://cdn.pixabay.com/photo/2018/01/08/19/56/leaf-3070153__340.jpg'),
(4000, 'Test Product', 'Sugar Cane', 230, 8, 2, 'https://cdn.pixabay.com/photo/2014/02/27/21/21/sugar-cane-276242__340.jpg'),
(6998, 'Pets, just for fun, Don\'t mind', 'Buck', 26000, 15, 5491, 'https://bit.ly/38k1oVS'),
(8497, 'Not to be sold loose.', 'Cotton', 70, 30, 2, 'https://cdn.pixabay.com/photo/2015/05/03/10/55/cotton-750982__340.jpg'),
(8515, 'Just 1 per day', 'Candy', 5, 100, 2, 'https://cdn.pixabay.com/photo/2016/10/30/09/30/hot-chocolate-1782623__340.jpg'),
(8517, 'one per day, happy day', 'Apple', 450, 295, 5491, 'https://cdn.pixabay.com/photo/2016/11/30/15/00/orchard-1872997__340.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `product_seq`
--

CREATE TABLE `product_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product_seq`
--

INSERT INTO `product_seq` (`next_val`) VALUES
(11494);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_Id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `full_Name` varchar(255) NOT NULL,
  `mobile_Number` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `postal_Code` int(11) NOT NULL,
  `street_Add1` varchar(255) NOT NULL,
  `street_Add2` varchar(255) DEFAULT NULL,
  `town` varchar(255) NOT NULL,
  `user_Type` varchar(255) NOT NULL,
  `user_Image_Url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_Id`, `email`, `full_Name`, `mobile_Number`, `password`, `postal_Code`, `street_Add1`, `street_Add2`, `town`, `user_Type`, `user_Image_Url`) VALUES
(2, 'shahrukh@gmail.com', 'Sharhrukh Khan', '9856231245', 'qwerty', 560015, 'Mannat', 'Lake Rd', 'Bangalore', 'Owner', 'https://bit.ly/2TBIWUC'),
(501, 'Ranji@gmail.com', 'Rajni Kanth', '9856484878', 'qwerty', 560037, 'Serusuri', '3rd main', 'Bangalore', 'Haulier', 'https://bit.ly/30xQcCd'),
(1000, 'aishwarya@gmail.com', 'Aishwarya Rai', '9456123101', 'qwerty', 560045, '29th Main', 'BTM', 'Bangalore', 'Scheduler', 'https://bit.ly/2NEKjy1'),
(1499, 'nawaz@gmail.com', 'Nawazuddin', '8956231245', 'qwerty', 560124, 'Main Market', 'Houser Rd', 'Bangalore', 'Customer', 'https://bit.ly/2szERoE'),
(1998, 'ayushman@gmail.com', 'Ayushman Khurana', '9856231245', 'qwerty', 562232, '12th Main', 'MG Rd', 'Bangalore', 'LandOwner', 'https://bit.ly/2G2bRJj'),
(2497, 'vicky@gmail.com', 'Vicky Kaushal', '9865231212', 'qwerty', 560045, '1st Block', 'HBR Layout', 'Bangalore', 'LandOwner', 'https://bit.ly/3648bkQ'),
(2996, 'manoj@gmail.com', 'Manoj Bajpayee', '9916771912', 'qwerty', 560047, 'Austin Town', 'Center Rd', 'Bangalore', 'Schedular', 'https://bit.ly/2NC3yZ2'),
(3495, 'dhoni@gmail.com', 'M S Dhoni', '9865231212', 'qwerty', 560045, '1st Block', 'HBR Layout', 'Bangalore', 'LandOwner', 'https://bit.ly/35YvRXW'),
(3496, 'harendra@gmail.com', 'Haren', '9916771904', 'Haren@123', 560047, 'Austin Town', 'Center Rd', 'Bangalore', 'Admin', 'https://bit.ly/360VmrD'),
(4494, 'amit@gmail.com', 'Amitabh Bachchan', '99167748', 'qwerty', 560047, 'Austin Town', 'Center Rd', 'Bangalore', 'Scheduler', 'https://bit.ly/38jgdb2'),
(5491, 'salman@gmail.com', 'Salman Khan', '9823124578', 'qwerty', 1102023, 'Galaxy Apartments', 'Juhu', 'Mumbai', 'Owner', 'https://bit.ly/2R3JpNq'),
(5990, 'aliab@gmail.com', 'Alia Bhatt', '8956231245', 'qwerty', 124523, '12 Main', 'Andheri', 'Mumbai', 'Haulier', 'https://bit.ly/2sFCXTv'),
(5991, 'jeffb@gmail.com', 'Jeff Bezos', '9865231245', 'qwerty', 124578, 'Victoria Rd', 'Lake View', 'Florida', 'Customer', 'https://bit.ly/2ucjMkO'),
(5992, 'paresh@yahoo.in', 'Paresh Rawal', '9856254878', 'qwerty', 231245, '45th Cross', 'Sea view', 'Mumbai', 'Customer', 'https://bit.ly/2TEpVAM');

-- --------------------------------------------------------

--
-- Table structure for table `user_seq`
--

CREATE TABLE `user_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_seq`
--

INSERT INTO `user_seq` (`next_val`) VALUES
(6987);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`bill_Id`),
  ADD KEY `FK1tk74m7b0dhk8u5cw5aguhpr` (`contractId`);

--
-- Indexes for table `contract`
--
ALTER TABLE `contract`
  ADD PRIMARY KEY (`contract_Id`),
  ADD KEY `FKpox11hxjyjayn71t9f3jvkge` (`productId`);

--
-- Indexes for table `email_land`
--
ALTER TABLE `email_land`
  ADD PRIMARY KEY (`land_email_Id`),
  ADD KEY `FKq82ryjje71mlv8x5rxaxeh6yj` (`landId`);

--
-- Indexes for table `land`
--
ALTER TABLE `land`
  ADD PRIMARY KEY (`land_Id`),
  ADD KEY `FKpd22k08qfk5dph55cmluawit1` (`userId`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_Id`),
  ADD KEY `FKga0wlx0p0ikaw0pj3yydi3ub0` (`userId`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_Id`),
  ADD UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `billing`
--
ALTER TABLE `billing`
  ADD CONSTRAINT `FK1tk74m7b0dhk8u5cw5aguhpr` FOREIGN KEY (`contractId`) REFERENCES `contract` (`contract_Id`);

--
-- Constraints for table `contract`
--
ALTER TABLE `contract`
  ADD CONSTRAINT `FKpox11hxjyjayn71t9f3jvkge` FOREIGN KEY (`productId`) REFERENCES `product` (`product_Id`);

--
-- Constraints for table `email_land`
--
ALTER TABLE `email_land`
  ADD CONSTRAINT `FKq82ryjje71mlv8x5rxaxeh6yj` FOREIGN KEY (`landId`) REFERENCES `land` (`land_Id`);

--
-- Constraints for table `land`
--
ALTER TABLE `land`
  ADD CONSTRAINT `FKpd22k08qfk5dph55cmluawit1` FOREIGN KEY (`userId`) REFERENCES `user` (`user_Id`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FKga0wlx0p0ikaw0pj3yydi3ub0` FOREIGN KEY (`userId`) REFERENCES `user` (`user_Id`);
--
-- Database: `ty_tests_modude1`
--
CREATE DATABASE IF NOT EXISTS `ty_tests_modude1` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ty_tests_modude1`;

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `contactId` int(11) NOT NULL,
  `contactName` varchar(50) NOT NULL,
  `contactNumber` varchar(10) NOT NULL,
  `contactGroup` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`contactId`, `contactName`, `contactNumber`, `contactGroup`) VALUES
(2, 'Sweta', '9810562312', 'Student'),
(5, 'Haren', '9916771904', 'Tyss'),
(10, 'Rohit', '9865231545', 'Tyss'),
(11, 'Jatin', '9865324512', 'Cts'),
(12, 'Rahul', '9623145241', 'Tyss'),
(13, 'Anish', '9856234875', 'Student'),
(14, 'Pravin', '9865231245', 'Tyss');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`contactId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contact`
--
ALTER TABLE `contact`
  MODIFY `contactId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- Database: `ty_tests_modude2_db`
--
CREATE DATABASE IF NOT EXISTS `ty_tests_modude2_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ty_tests_modude2_db`;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(5),
(5);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `product_comments` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_price` double DEFAULT NULL,
  `product_quantity` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_id`, `product_comments`, `product_name`, `product_price`, `product_quantity`, `user_id`) VALUES
(2, 'Test Product', 'Mango', 250, 20, 1),
(3, 'Test Product', 'Banana', 250, 20, NULL),
(4, 'Test Product', 'Banana', 250, 20, 1);

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`user_id`, `email`, `name`, `password`) VALUES
(1, 'haren@gmail.com', 'Harendra', '$2a$10$WFk1m4AvmZmYQdb4z94awu5qgQ29qGHKQWlOY43/PXEsJ9RlIF9BG');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `FK5uawi3dnfotcato531wtp91i4` (`user_id`);

--
-- Indexes for table `user_info`
--
ALTER TABLE `user_info`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `UK_gnu0k8vv6ptioedbxbfsnan9g` (`email`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FK5uawi3dnfotcato531wtp91i4` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
