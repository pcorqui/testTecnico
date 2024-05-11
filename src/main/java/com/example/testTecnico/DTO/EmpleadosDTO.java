package com.example.testTecnico.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadosDTO {

    private String numEmpleado;
    private String nombre;
    private String Apellidos;
    private String Role;
}
