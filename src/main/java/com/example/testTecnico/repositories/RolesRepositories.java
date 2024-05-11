package com.example.testTecnico.repositories;

import com.example.testTecnico.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface RolesRepositories extends JpaRepository<Roles, BigInteger> {
}
