package com.example.testTecnico.controller;

import com.example.testTecnico.DTO.EmpleadosDTO;
import com.example.testTecnico.entity.Empleados;
import com.example.testTecnico.repositories.PersonasRepository;
import com.example.testTecnico.servicios.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("list")
    public List<Empleados> getAll(){
        return empleadoService.empleadosList();
    }

    @GetMapping("page/employ")
    public ResponseEntity<?> getEmployPage(){
        return new ResponseEntity<>(empleadoService.empleadosPage(), HttpStatus.OK);
    }


}
