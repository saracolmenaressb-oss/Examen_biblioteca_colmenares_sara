package com.academia.bibliotecapalabras.persistencia.repository;

import com.academia.bibliotecapalabras.negocio.model.Libros;

import java.util.List;
import java.util.Optional;

public interface RepositorioLibros {
    Optional<Libros> buscarPorId(Long id);
    List<Libros> listar();
    Libros guardar(Libros estudiante);
}
