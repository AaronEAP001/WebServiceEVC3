-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: localhost    Database: db_cursos
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno` (
  `idAlumno` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `edaad` int DEFAULT NULL,
  PRIMARY KEY (`idAlumno`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES (1,'Fernanda','Gomez','Callao MzL lt5',15),(2,'Aldo','Gomez','Callao MzL lt5',15),(3,'Mario','ribera','Callao MzL lt15',15),(4,'Juan','Gutti','Callao MzN lt2',16),(5,'Ana','Diaz','Callao Mzb lt30',14),(6,'Mafer','Casas','Callao Mze lt9',14),(7,'Dennis','Taborez','Callao Mzt lt8',16),(8,'Armando','Valencia','Callao MzH lt25',15),(9,'Fernanda','Gomez','Callao MzL lt5',15),(10,'Aldo','Gomez','Callao MzL lt5',15),(11,'Mario','ribera','Callao MzL lt15',15),(12,'Juan','Gutti','Callao MzN lt2',16),(13,'Ana','Diaz','Callao Mzb lt30',14),(14,'Mafer','Casas','Callao Mze lt9',14),(15,'Dennis','Taborez','Callao Mzt lt8',16),(16,'Armando','Valencia','Callao MzH lt25',15);
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-07  6:49:52
