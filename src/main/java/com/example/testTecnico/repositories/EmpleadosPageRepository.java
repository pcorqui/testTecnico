package com.example.testTecnico.repositories;

import com.example.testTecnico.entity.Empleados;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmpleadosPageRepository extends PagingAndSortingRepository<Empleados,Long> {
}
