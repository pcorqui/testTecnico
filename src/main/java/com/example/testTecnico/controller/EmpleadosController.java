package com.example.testTecnico.controller;

import com.example.testTecnico.DTO.EmpleadosDTO;
import com.example.testTecnico.repositories.PersonasRepository;
import com.example.testTecnico.servicios.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {


    @Autowired
    EmpleadoService empleadoService;

    @Autowired
    PersonasRepository personasRepository;

    @GetMapping
    public List<EmpleadosDTO> getEmpleados(){
        return empleadoService.getAllEmpleados();
    }


}
