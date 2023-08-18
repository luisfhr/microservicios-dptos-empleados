package com.fundaisem.departamentservice.controller;

import com.fundaisem.departamentservice.entity.Departament;
import com.fundaisem.departamentservice.service.DepartamentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departaments")
public class DepartamentController {

    public final DepartamentService departamentService;

    public DepartamentController(DepartamentService departamentService) {
        this.departamentService = departamentService;
    }

    @PostMapping
    public Departament createDepartament(@RequestBody Departament departament){
        return departamentService.crearDepartament(departament);
    }

    @GetMapping("/{id}")
    public Departament getDepartamentById(@PathVariable Integer id){
        return departamentService.getDepartamentById(id);
    }

    @GetMapping
    public List<Departament> obtenerDepartaments(){
        return departamentService.getDepartaments();
    }
}
