package com.academia.bibliotecapalabras.negocio.service;

import com.academia.bibliotecapalabras.negocio.model.Libros;
import com.academia.bibliotecapalabras.persistencia.repository.RepositorioLibros;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ServicioLibros {
    private final RepositorioLibros repositorio;

    public ServicioLibros(RepositorioLibros repositorio) {
        this.repositorio = repositorio;
    }
    public List<Libros> listar() {
        return repositorio.listar();
    };
    public Libros obtener(Long id){
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new NoSuchElementException("No existe ese libro "+ id));
    }
}
