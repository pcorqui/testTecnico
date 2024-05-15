package com.example.testTecnico.servicios;

import com.example.testTecnico.DTO.EmpleadosDTO;
import com.example.testTecnico.entity.Personas;
import com.example.testTecnico.repositories.PersonasPage;
import com.example.testTecnico.repositories.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonasServices {

    @Autowired
    PersonasRepository personasRepository;

    @Autowired
    PersonasPage personasPage;

    public Page<Personas> finAllByPage(){
        Pageable pageable = PageRequest.of(3,5);
        return personasPage.findAll(pageable);
    }

    public List<Personas> getPersonas(){
        return personasRepository.findAll();
    }

    public List<EmpleadosDTO> getEmpleados(){
        return personasRepository.getEmpleados();
    }
}
