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
-- Table structure for table `resultado_busqueda`
--

DROP TABLE IF EXISTS `resultado_busqueda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resultado_busqueda` (
  `idresultado_busqueda` int NOT NULL AUTO_INCREMENT,
  `resultado` varchar(5000) NOT NULL,
  PRIMARY KEY (`idresultado_busqueda`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resultado_busqueda`
--

LOCK TABLES `resultado_busqueda` WRITE;
/*!40000 ALTER TABLE `resultado_busqueda` DISABLE KEYS */;
INSERT INTO `resultado_busqueda` VALUES (1,'[AlumnoCursoVO{idAlumnoCurso=4, alumnoVO=AlumnoVO{idAlumno=1, nombre=Fernanda, apellido=Gomez, direccion=Callao MzL lt5, edaad=15}\n, cursoVO=CursoVO{idCurso=5, nombre=Quimica, aula=LAB02, horas=2.5}\n}\n, AlumnoCursoVO{idAlumnoCurso=7, alumnoVO=AlumnoVO{idAlumno=2, nombre=Aldo, apellido=Gomez, direccion=Callao MzL lt5, edaad=15}\n, cursoVO=CursoVO{idCurso=5, nombre=Quimica, aula=LAB02, horas=2.5}\n}\n]'),(2,'[AlumnoCursoVO{idAlumnoCurso=4, alumnoVO=AlumnoVO{idAlumno=1, nombre=Fernanda, apellido=Gomez, direccion=Callao MzL lt5, edaad=15}\n, cursoVO=CursoVO{idCurso=5, nombre=Quimica, aula=LAB02, horas=2.5}\n}\n, AlumnoCursoVO{idAlumnoCurso=7, alumnoVO=AlumnoVO{idAlumno=2, nombre=Aldo, apellido=Gomez, direccion=Callao MzL lt5, edaad=15}\n, cursoVO=CursoVO{idCurso=5, nombre=Quimica, aula=LAB02, horas=2.5}\n}\n, AlumnoCursoVO{idAlumnoCurso=12, alumnoVO=AlumnoVO{idAlumno=3, nombre=Mario, apellido=ribera, direccion=Callao MzL lt15, edaad=15}\n, cursoVO=CursoVO{idCurso=5, nombre=Quimica, aula=LAB02, horas=2.5}\n}\n]'),(3,'[AlumnoCursoVO{idAlumnoCurso=3, alumnoVO=AlumnoVO{idAlumno=1, nombre=Fernanda, apellido=Gomez, direccion=Callao MzL lt5, edaad=15}\n, cursoVO=CursoVO{idCurso=7, nombre=Letras, aula=A1010, horas=2.8}\n}\n, AlumnoCursoVO{idAlumnoCurso=8, alumnoVO=AlumnoVO{idAlumno=2, nombre=Aldo, apellido=Gomez, direccion=Callao MzL lt5, edaad=15}\n, cursoVO=CursoVO{idCurso=7, nombre=Letras, aula=A1010, horas=2.8}\n}\n, AlumnoCursoVO{idAlumnoCurso=15, alumnoVO=AlumnoVO{idAlumno=4, nombre=Juan, apellido=Gutti, direccion=Callao MzN lt2, edaad=16}\n, cursoVO=CursoVO{idCurso=7, nombre=Letras, aula=A1010, horas=2.8}\n}\n, AlumnoCursoVO{idAlumnoCurso=20, alumnoVO=AlumnoVO{idAlumno=5, nombre=Ana, apellido=Diaz, direccion=Callao Mzb lt30, edaad=14}\n, cursoVO=CursoVO{idCurso=7, nombre=Letras, aula=A1010, horas=2.8}\n}\n]');
/*!40000 ALTER TABLE `resultado_busqueda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-07  6:49:49
