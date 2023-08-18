package com.fundaisem.departamentservice.repository;

import com.fundaisem.departamentservice.entity.Departament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentRepository extends JpaRepository<Departament, Integer> {
}
