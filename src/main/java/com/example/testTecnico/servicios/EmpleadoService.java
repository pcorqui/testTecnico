package com.example.testTecnico.servicios;

import com.example.testTecnico.DTO.EmpleadosDTO;
import com.example.testTecnico.entity.Empleados;
import com.example.testTecnico.repositories.EmpleadosPageRepository;
import com.example.testTecnico.repositories.EmpleadosRepository;
import com.example.testTecnico.repositories.PersonasRepository;
import com.example.testTecnico.repositories.RolesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadosRepository empleadosRepository;

    @Autowired
    PersonasRepository personasRepository;

    @Autowired
    RolesRepositories rolesRepositories;

    @Autowired
    EmpleadosPageRepository empleadosPageRepository;

    public List<EmpleadosDTO> getAllEmpleados(){
        //logica para obtener los empleados
        List<EmpleadosDTO> lista = new ArrayList<EmpleadosDTO>();

//        lista.add(new EmpleadosDAO("1","paul","cortes","admin"));
//        lista.add(new EmpleadosDAO("2", "cortes","paul", "user"));

        return lista;

        //obtener EmpleadoDao
        //List<Empleados> empleados = empleadosRepository.findAll();
    }

    public List<Empleados> empleadosList(){
        return empleadosRepository.findAll();
    }

    public Page<Empleados> empleadosPage(){
        Pageable pageable = PageRequest.of(1,4);
        return empleadosPageRepository.findAll(pageable);
    }
}