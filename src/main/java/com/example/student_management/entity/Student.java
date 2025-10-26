package com.example.student_management.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

@Entity
@Table(name = "students")
@Schema(description = "Entité représentant un étudiant")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Identifiant unique de l'étudiant", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @NotBlank(message = "Le nom est obligatoire")
    @Column(nullable = false)
    @Schema(description = "Nom complet de l'étudiant", example = "Ahmed Bennani", required = true)
    private String name;

    @NotBlank(message = "L'email est obligatoire")
    @Email(message = "L'email doit être valide")
    @Column(nullable = false, unique = true)
    @Schema(description = "Adresse email de l'étudiant", example = "ahmed@example.com", required = true)
    private String email;

    @NotNull(message = "L'année est obligatoire")
    @Positive(message = "L'année doit être positive")
    @Column(nullable = false)
    @Schema(description = "Année d'étude de l'étudiant", example = "2", required = true)
    private Integer year;

    @Column(name = "date_naissance")
    @Schema(description = "Date de naissance de l'étudiant", example = "2003-05-15")
    private LocalDate dateNaissance;

    // Constructeurs
    public Student() {
    }

    public Student(String name, String email, Integer year) {
        this.name = name;
        this.email = email;
        this.year = year;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", year=" + year +
                ", dateNaissance=" + dateNaissance +
                '}';
    }
}