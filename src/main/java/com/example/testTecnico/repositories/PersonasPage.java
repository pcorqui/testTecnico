package com.example.testTecnico.repositories;

import com.example.testTecnico.entity.Personas;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonasPage extends ListPagingAndSortingRepository<Personas,Long> {
}
