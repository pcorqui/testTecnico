package com.example.testTecnico.servicios;

import com.example.testTecnico.DTO.EmpleadosDTO;
import com.example.testTecnico.entity.Personas;
import com.example.testTecnico.repositories.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonasServices {

    @Autowired
    PersonasRepository personasRepository;

    public List<Personas> getPersonas(){
        return personasRepository.findAll();
    }

    public List<EmpleadosDTO> getEmpleados(){
        return personasRepository.getEmpleados();
    }
}
