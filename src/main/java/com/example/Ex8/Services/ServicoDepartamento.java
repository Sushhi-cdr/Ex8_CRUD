package com.example.Ex8.Services;

import com.example.Ex8.Models.Departamento;
import com.example.Ex8.Repositories.RepositorioDepartamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoDepartamento {

    @Autowired
    private RepositorioDepartamento repositorio;

    public Departamento criar(Departamento departamento){
        return repositorio.save(departamento);
    }

    public List<Departamento> listar(){
        return repositorio.findAll();
    }

    public Departamento buscarPorId(Long id){
        return repositorio.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repositorio.deleteById(id);
    }
}
