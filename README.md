# 🎓 Student Management Application

Application Spring Boot pour la gestion des étudiants avec API REST et documentation Swagger.

![Démonstration](./assets/demo.gif)

### 1️⃣ Créer la base de données
```sql
CREATE DATABASE studentdb;
```

### 2️⃣ Lancer l'application
```bash
.\mvnw.cmd spring-boot:run
```

### 3️⃣ Accéder à l'application

**Interface Swagger (Documentation Interactive)** :
```
http://localhost:8080/swagger-ui.html
```

**API Endpoints** :
```
http://localhost:8080/students
```

## 🧪 API Endpoints

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| POST | `/students/save` | Créer un étudiant |
| GET | `/students/all` | Lister tous |
| GET | `/students/count` | Compter |
| DELETE | `/students/delete/{id}` | Supprimer |
| GET | `/students/byYear` | Statistiques |

## 🛠️ Technologies

- Spring Boot 3.5.7
- Spring Data JPA
- MySQL
- Maven
- Java 21
- **Swagger/OpenAPI 3.0** (springdoc-openapi 2.0.2)

## 📝 Configuration

Fichier : `src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=
```

## Auteur
ACHRAF

