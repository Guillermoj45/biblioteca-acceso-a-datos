package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.entity.Libros;
import com.biblioteca.biblioteca.service.LibrosService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibrosController {
    LibrosService librosService;

    public LibrosController(LibrosService librosService) {
        this.librosService = librosService;
    }

    @GetMapping
    public List<Libros> findAll() {
        return librosService.findAll();
    }

    @GetMapping("/titulo/{titulo}")
    public List<Libros> findByTituloContaining(@PathVariable String titulo) {
        return librosService.findByTituloContaining(titulo);
    }

    @GetMapping("/fechaPublicacion/{fechaPublicacion}")
    public List<Libros> findByFechaPublicacionLessThan(@PathVariable Date fechaPublicacion) {
        return librosService.findByFechaPublicacionLessThan(fechaPublicacion);
    }

    @GetMapping("/sort/titulo")
    public List<Libros> findAllSortByTitulo() {
        return librosService.findAllSortByTitulo();
    }

    @GetMapping("/id/{id}")
    public Libros findById(@PathVariable Long id) {
        return librosService.findById(id);
    }

    @PostMapping
    public Libros save(@RequestBody Libros libro) {
        return librosService.save(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        librosService.deleteById(id);
    }

}
