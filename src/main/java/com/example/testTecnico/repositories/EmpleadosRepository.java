package com.example.testTecnico.repositories;

import com.example.testTecnico.entity.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, BigInteger> {
}
