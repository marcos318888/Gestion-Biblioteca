# 📚 Gestión Biblioteca

Una aplicación desarrollada en **Java con Spring Boot** destinada a gestionar el sistema de una biblioteca: préstamos, libros, usuarios, etc.  
La persistencia de datos se realiza con **PostgreSQL** y se usa **Lombok** para reducir la verbosidad del código.

---

## 🔍 Descripción

Este proyecto tiene como objetivo la **gestión de una biblioteca**, permitiendo administrar libros, usuarios y préstamos.  
Está desarrollado en **Java (Spring Boot)** con **Maven** como gestor de dependencias y utilizando **PostgreSQL** como base de datos principal.  

Se incorpora **Lombok** para automatizar la creación de constructores, getters, setters y métodos comunes, facilitando un código más limpio y mantenible.

---

## ✅ Características principales

- 📖 **Gestión de libros**: creación, edición, eliminación y consulta.  
- 👥 **Gestión de usuarios**: registro y administración de usuarios.  
- 🔄 **Préstamos y devoluciones**: control de préstamos activos y fechas de devolución.  
- 🛠️ **Arquitectura con Spring Boot + Maven**: incluye `pom.xml` para gestión de dependencias.  
- 🗄️ **Base de datos PostgreSQL**: integración con JPA/Hibernate para el acceso a datos.  
- ✨ **Uso de Lombok**: elimina código repetitivo (constructores, getters/setters, `toString`, etc.).  

---

## ⚙️ Instalación y ejecución

1. **Clonar el repositorio**  
   ```bash
   git clone https://github.com/marcos318888/Gestion-Biblioteca.git
   cd Gestion-Biblioteca
2. Configurar la base de datos en PostgreSQL
  Crear una base de datos llamada biblioteca.
  Ajustar las credenciales en src/main/resources/application.properties:

    spring.datasource.url=jdbc:postgresql://localhost:5432/biblioteca
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_password
    spring.jpa.hibernate.ddl-auto=update

3. Compilar y ejecutar con Maven
   
  mvn spring-boot:run
  O generar el .jar y ejecutarlo:
  mvn clean install
  java -jar target/Gestion-Biblioteca-0.0.1-SNAPSHOT.jar

📌 Requisitos previos
Java 17+
Maven 3.8+
PostgreSQL 13+
Dependencia Lombok (ya incluida en pom.xml, pero requiere instalación del plugin en tu IDE).
