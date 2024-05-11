package com.example.testTecnico.controller;

import com.example.testTecnico.DTO.EmpleadosDTO;
import com.example.testTecnico.entity.Personas;
import com.example.testTecnico.servicios.PersonasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("personas")
public class PersonasController {

    @Autowired
    PersonasServices personasServices;

    @GetMapping
    public List<Personas> getPersonas(){
        return personasServices.getPersonas();
    }

    @GetMapping("/empleados")
    public List<EmpleadosDTO> getEmpleados(){
        return personasServices.getEmpleados();
    }
}
