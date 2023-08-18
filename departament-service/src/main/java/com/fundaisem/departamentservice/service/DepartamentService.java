package com.fundaisem.departamentservice.service;

import com.fundaisem.departamentservice.entity.Departament;
import com.fundaisem.departamentservice.repository.DepartamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentService {

    public final DepartamentRepository departamentRepository;

    public DepartamentService(DepartamentRepository departamentRepository) {
        this.departamentRepository = departamentRepository;
    }

    public Departament crearDepartament(Departament departament){
        return departamentRepository.save(departament);
    }

    public Departament getDepartamentById(Integer id){
        return departamentRepository.findById(id).get();
    }

    public Departament guardar(Departament departament){
        return departamentRepository.save(departament);
    }

    public List<Departament> getDepartaments(){
        return departamentRepository.findAll();
    }
}
