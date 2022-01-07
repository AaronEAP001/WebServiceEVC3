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
-- Table structure for table `alumno_curso`
--

DROP TABLE IF EXISTS `alumno_curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno_curso` (
  `idAlumnoCurso` int NOT NULL AUTO_INCREMENT,
  `idAlumno` int DEFAULT NULL,
  `idCurso` int DEFAULT NULL,
  PRIMARY KEY (`idAlumnoCurso`),
  KEY `idAlumno` (`idAlumno`),
  KEY `idCurso` (`idCurso`),
  CONSTRAINT `alumno_curso_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  CONSTRAINT `alumno_curso_ibfk_2` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno_curso`
--

LOCK TABLES `alumno_curso` WRITE;
/*!40000 ALTER TABLE `alumno_curso` DISABLE KEYS */;
INSERT INTO `alumno_curso` VALUES (1,1,2),(2,1,1),(3,1,7),(4,1,5),(5,2,2),(6,2,3),(7,2,5),(8,2,7),(9,3,1),(10,3,4),(11,3,6),(12,3,5),(13,4,2),(14,4,1),(15,4,7),(16,4,5),(17,5,2),(18,5,3),(19,5,4),(20,5,7),(21,6,1),(22,6,4),(23,6,6),(24,6,5),(25,7,2),(26,7,1),(27,7,6),(28,7,5),(29,8,2),(30,8,3),(31,8,4),(32,8,7),(33,1,3),(34,2,1),(35,3,2),(36,4,4),(37,5,1),(38,7,2),(39,8,6),(40,1,2),(41,1,1),(42,1,7),(43,1,5),(44,1,3),(45,2,2),(46,2,3),(47,2,5),(48,2,7),(49,2,1),(50,3,1),(51,3,4),(52,3,6),(53,3,5),(54,3,2),(55,4,2),(56,4,1),(57,4,7),(58,4,5),(59,4,4),(60,5,2),(61,5,1),(62,5,3),(63,5,4),(64,5,7),(65,6,1),(66,6,3),(67,6,4),(68,6,6),(69,6,5),(70,7,2),(71,7,1),(72,7,2),(73,7,6),(74,7,5),(75,8,2),(76,8,3),(77,8,4),(78,8,6),(79,8,7);
/*!40000 ALTER TABLE `alumno_curso` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-07  6:49:48
