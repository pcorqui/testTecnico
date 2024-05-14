package com.example.testTecnico.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    //al usar mappedBy hacemos decimos que esta entidad
    //esta referenciada por empleados en otra relacion
    //lo cual ya no genera una columna en esta entidad
    @JsonIgnore
    @OneToOne(mappedBy = "empleados")
    //al hacer esto la anotacion JoinColum no tiene efecto
    //@JoinColumn(name = "Id")
    private Personas persona;

//    @ManyToMany
//    private List<Roles> rol;

}
