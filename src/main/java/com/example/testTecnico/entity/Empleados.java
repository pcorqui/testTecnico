package com.example.testTecnico.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "EMPLEADOS")
@Entity
public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "Num_Empleado", columnDefinition = "varchar(12)")
    private String numEmpleado;

    @Column(name = "Fecha_Ingreso")
    private String FechaIngreso;

    @OneToOne
    private Personas persona;

//    @ManyToMany
//    private List<Roles> rol;

}
