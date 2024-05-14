package com.example.testTecnico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Table(name = "PERSONAS")
@Data
public class Personas {

    //Si se quiere que en la base de datos se tenga bigint se debe especificar la
    //propiedad en columnDefinition
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT")
    private Long Id;

    @Column(name = "Nombres", columnDefinition = "varchar(50)")
    private String nombres;

    @Column(name = "Apellidos", columnDefinition = "varchar(50)")
    private String apellidos;

    @Column(name = "Sexo")
    private boolean sexo;

    @OneToOne
    //JoinColumn se usa para darle nombre a la foraing key
    //and unir la entidad dependiente(esta entidad) con su entidad independiente(entidad empleados)
    @JoinColumn(name = "id_empleado")
    private Empleados empleados;

    @ManyToOne
    private Roles rol;

}
