package com.example.Ex8.Controllers;

import com.example.Ex8.Models.Departamento;
import com.example.Ex8.Services.ServicoDepartamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Departamentos")
public class Controles {

    @Autowired
    private ServicoDepartamento servico;

    @PostMapping
    public Departamento criar(@RequestBody Departamento departamento){
        return servico.criar(departamento);
    }

    @GetMapping
    public List<Departamento> listar(){
        return servico.listar();
    }

    @GetMapping("/{id}")
    public Departamento buscar(@PathVariable Long id){
        return servico.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        servico.deletar(id);
    }
}
