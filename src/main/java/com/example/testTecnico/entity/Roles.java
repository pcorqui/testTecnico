package com.example.testTecnico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "ROLES")
@Data
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT")
    private Long Id;

    @Column(name = "Role", columnDefinition = "varchar(100)")
    private String role;

    @OneToMany
    private List<Empleados> empleados;

//    @ManyToMany
//    private List<Empleados> empleados;
}
