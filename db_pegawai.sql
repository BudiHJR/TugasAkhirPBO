/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 10.1.16-MariaDB : Database - db_pegawai
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_pegawai` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_pegawai`;

/*Table structure for table `tbl_pegawai` */

DROP TABLE IF EXISTS `tbl_pegawai`;

CREATE TABLE `tbl_pegawai` (
  `ID` int(15) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(30) DEFAULT NULL,
  `TempatLahir` varchar(20) DEFAULT NULL,
  `TanggalLahir` varchar(20) DEFAULT NULL,
  `JenisKelamin` varchar(15) DEFAULT NULL,
  `Alamat` varchar(20) DEFAULT NULL,
  `Nope` varchar(15) DEFAULT NULL,
  `Jabatan` varchar(15) DEFAULT NULL,
  `PendidikanTerakhir` varchar(3) DEFAULT NULL,
  `TanggalMasuk` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `Nama` (`Nama`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_pegawai` */

insert  into `tbl_pegawai`(`ID`,`Nama`,`TempatLahir`,`TanggalLahir`,`JenisKelamin`,`Alamat`,`Nope`,`Jabatan`,`PendidikanTerakhir`,`TanggalMasuk`) values (26,'yanto','-','-','Laki - Laki','-','-','Karyawan','S2','04-01-2017'),(27,'ardi','-','-','Laki - Laki','-','-','Kepala Bidang','S1','04-01-2017');

/*Table structure for table `tbl_pegawai2` */

DROP TABLE IF EXISTS `tbl_pegawai2`;

CREATE TABLE `tbl_pegawai2` (
  `Nama` varchar(30) NOT NULL,
  `JabatanSekarang` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`Nama`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_pegawai2` */

insert  into `tbl_pegawai2`(`Nama`,`JabatanSekarang`) values ('ardi','Karyawan');

/*Table structure for table `tbl_pegawai3` */

DROP TABLE IF EXISTS `tbl_pegawai3`;

CREATE TABLE `tbl_pegawai3` (
  `Nama` varchar(30) NOT NULL,
  `JabatanTerakhir` varchar(15) DEFAULT NULL,
  `TanggalKeluar` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Nama`),
  CONSTRAINT `tbl_pegawai3_ibfk_1` FOREIGN KEY (`Nama`) REFERENCES `tbl_pegawai` (`Nama`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_pegawai3` */

insert  into `tbl_pegawai3`(`Nama`,`JabatanTerakhir`,`TanggalKeluar`) values ('yanto','Kepala Bidang','04-01-2017');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
