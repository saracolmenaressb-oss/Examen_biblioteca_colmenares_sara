package com.academia.bibliotecapalabras.presentacion.controlador;

import com.academia.bibliotecapalabras.negocio.model.Libros;
import com.academia.bibliotecapalabras.negocio.service.ServicioLibros;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class ControladorLibros {
    private final ServicioLibros servicio;

    public ControladorLibros(ServicioLibros servicio) {
        this.servicio = servicio;
    }
    @GetMapping
    public List<Libros> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public Libros obtener(@PathVariable Long id) {
        return servicio.obtener(id);
    }
}
