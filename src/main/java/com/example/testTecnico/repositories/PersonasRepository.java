package com.example.testTecnico.repositories;

import com.example.testTecnico.DTO.EmpleadosDTO;
import com.example.testTecnico.entity.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface PersonasRepository extends JpaRepository<Personas, BigInteger> {

    //utilizando JPQL y proyeccion
    //en JPQL se de utilizar el nombre de las clases y atributos
    @Query(
            "SELECT new com.example.testTecnico.DTO.EmpleadosDTO(e.numEmpleado, p.nombres,p.apellidos,r.role)" +
                    " FROM Personas p, Roles r, Empleados e" +
                    " WHERE p.rol.Id = r.Id" +
                    " AND e.id = p.empleados.Id"
    )
    List<EmpleadosDTO> getEmpleados();
}
