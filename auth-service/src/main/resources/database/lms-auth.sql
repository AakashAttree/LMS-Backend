-- MySQL dump 10.13  Distrib 8.0.29, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: lms-auth
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (id, account_non_expired, account_non_locked, credentials_non_expired, enabled, password, username) VALUES (1,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','tgridley@utoronto.ca'),(2,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','aanglish@utoronto.ca'),(3,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','cslatten@utoronto.ca'),(4,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','vetchell@utoronto.ca'),(5,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','aadamek@utoronto.ca'),(6,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','acocozza@utoronto.ca'),(7,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','ecadwell@utoronto.ca'),(8,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','ctanslie@utoronto.ca'),(9,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','hsiveyer@utoronto.ca'),(10,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','lcatley@utoronto.ca'),(11,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','vcowderay@utoronto.ca'),(12,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','swray@utoronto.ca'),(13,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','mluciani@utoronto.ca'),(14,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','kclohisey@utoronto.ca'),(15,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','hfassum@utoronto.ca'),(16,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','avasilevich@utoronto.ca'),(17,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','ijoskovitch@utoronto.ca'),(18,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','dwillshear@utoronto.ca'),(19,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','wgeyton@utoronto.ca'),(20,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','vfilpi@utoronto.ca'),(21,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','bjanczewski@utoronto.ca'),(22,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','vbiles@utoronto.ca'),(23,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','lmackay@utoronto.ca'),(24,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','jkewish@utoronto.ca'),(25,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','vgally@utoronto.ca'),(26,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','vnormabell@utoronto.ca'),(27,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','wpriddie@utoronto.ca'),(28,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','badamec@utoronto.ca'),(29,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','eambrose@utoronto.ca'),(30,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','cparkin@utoronto.ca'),(31,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','gerricker@utoronto.ca'),(32,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','chilary@utoronto.ca'),(33,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','poseman@utoronto.ca'),(34,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','sranklin@utoronto.ca'),(35,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','jsmalecombe@utoronto.ca'),(36,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','aglassard@utoronto.ca'),(37,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','cfouch@utoronto.ca'),(38,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','gbenmore@utoronto.ca'),(39,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','lwhistlecroft@utoronto.ca'),(40,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','cgunn@utoronto.ca'),(41,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','gmizzen@utoronto.ca'),(42,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','skaming@utoronto.ca'),(43,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','alampkin@utoronto.ca'),(44,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','rkersting@utoronto.ca'),(45,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','dcreany@utoronto.ca'),(46,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','lwishart@utoronto.ca'),(47,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','nclaypoole@utoronto.ca'),(48,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','wvoaden@utoronto.ca'),(49,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','nmaginot@utoronto.ca'),(50,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','jdumsday@utoronto.ca'),(51,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','klambeth@utoronto.ca'),(52,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','sallberry@utoronto.ca'),(53,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','mlendon@utoronto.ca'),(54,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','jhugues@utoronto.ca'),(55,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','rnellies@utoronto.ca'),(56,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','rdu hamel@utoronto.ca'),(57,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','dboyd@utoronto.ca'),(58,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','akynge@utoronto.ca'),(59,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','lscatchard@utoronto.ca'),(60,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','bcoghill@utoronto.ca'),(61,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','wmatschek@utoronto.ca'),(62,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','mvoaden@utoronto.ca'),(63,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','gweine@utoronto.ca'),(64,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','rsandeman@utoronto.ca'),(65,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','kbraney@utoronto.ca'),(66,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','gdurning@utoronto.ca'),(67,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','mdemer@utoronto.ca'),(68,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','murien@utoronto.ca'),(69,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','mfant@utoronto.ca'),(70,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','itice@utoronto.ca'),(71,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','tfitchett@utoronto.ca'),(72,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','mnials@utoronto.ca'),(73,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','sbonnick@utoronto.ca'),(74,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','ibewsey@utoronto.ca'),(75,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','lburdoun@utoronto.ca'),(76,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','cmarquese@utoronto.ca'),(77,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','trappport@utoronto.ca'),(78,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','jivashkov@utoronto.ca'),(79,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','eyedy@utoronto.ca'),(80,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','hfidelli@utoronto.ca'),(81,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','hgrishechkin@utoronto.ca'),(82,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','fthackray@utoronto.ca'),(83,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','kgilloran@utoronto.ca'),(84,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','mvelte@utoronto.ca'),(85,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','nedy@utoronto.ca'),(86,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','esebring@utoronto.ca'),(87,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','emates@utoronto.ca'),(88,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','lburtwistle@utoronto.ca'),(89,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','tstopp@utoronto.ca'),(90,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','ebrobeck@utoronto.ca'),(91,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','hewins@utoronto.ca'),(92,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','bkrug@utoronto.ca'),(93,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','sadamou@utoronto.ca'),(94,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','sstarkey@utoronto.ca'),(95,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','bteek@utoronto.ca'),(96,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','dwillison@utoronto.ca'),(97,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','wdietmar@utoronto.ca'),(98,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','dhunte@utoronto.ca'),(99,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','plehon@utoronto.ca'),(100,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','ckimmons@utoronto.ca'),(101,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','cohollegan@utoronto.ca'),(102,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','ffellowes@utoronto.ca'),(103,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','tpinches@utoronto.ca'),(104,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','dcapper@utoronto.ca'),(105,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','ngeraldini@utoronto.ca'),(106,1,1,1,1,'$2a$10$E1YPtuH.jGsCw/45wnm3NuzrC2VFT14TdNf5i3kChoJd.Y8jSox6u','jmasurel@utoronto.ca');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` (user_id, role_id) VALUES (102,2),(103,2),(104,2),(105,2),(106,2),(1,3),(2,3),(3,3),(4,3),(5,3),(6,3),(7,3),(8,3),(9,3),(10,3),(11,3),(12,3),(13,3),(14,3),(15,3),(16,3),(17,3),(18,3),(19,3),(20,3),(21,3),(22,3),(23,3),(24,3),(25,3),(26,3),(27,3),(28,3),(29,3),(30,3),(31,3),(32,3),(33,3),(34,3),(35,3),(36,3),(37,3),(38,3),(39,3),(40,3),(41,3),(42,3),(43,3),(44,3),(45,3),(46,3),(47,3),(48,3),(49,3),(50,3),(51,3),(52,3),(53,3),(54,3),(55,3),(56,3),(57,3),(58,3),(59,3),(60,3),(61,4),(62,4),(63,4),(64,4),(65,4),(66,4),(67,4),(68,4),(69,4),(70,4),(71,4),(72,4),(73,4),(74,4),(75,4),(76,4),(77,4),(78,4),(79,4),(80,4),(81,4),(82,4),(83,4),(84,4),(85,4),(86,4),(87,4),(88,4),(89,4),(90,4),(91,4),(92,4),(93,4),(94,4),(95,4),(96,4),(97,4),(98,4),(99,4),(100,4),(101,4);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-04 20:27:43