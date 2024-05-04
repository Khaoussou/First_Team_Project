package test_spring.demo.entities;

import jakarta.persistence.*;


@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String nom;
}
