package com.academia.bibliotecapalabras.persistencia.repository;

import com.academia.bibliotecapalabras.negocio.model.Libros;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class RepositorioLibrosMemoria implements RepositorioLibros{

    private final List<Libros> libros = new ArrayList<>();

    @Override
    public Optional<Libros> buscarPorId(Long id) {
        for (Libros libro : libros) {
            if (libro.getId().equals(id)) {
                return Optional.of(libro);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Libros> listar() {
        return new ArrayList<>(libros);
    }
}
