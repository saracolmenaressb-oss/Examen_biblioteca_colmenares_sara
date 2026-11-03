package com.academia.bibliotecapalabras.persistencia.repository;

import com.academia.bibliotecapalabras.negocio.model.Libros;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class RepositorioLibrosMemoria implements RepositorioLibros{
    private long siguienteId = 1;
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

    @Override
    public Libros guardar(Libros libro1) {
        libro1.setId(siguienteId++);
        libro1.add(libro1);
        return libro1;
    }
}
