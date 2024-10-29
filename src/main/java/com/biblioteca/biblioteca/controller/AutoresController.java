package com.biblioteca.biblioteca.controller;


import com.biblioteca.biblioteca.entity.Autores;
import com.biblioteca.biblioteca.service.AutoresService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutoresController {
    private final AutoresService autoresService;

    public AutoresController(AutoresService autoresService) {
        this.autoresService = autoresService;
    }

    @GetMapping
    public List<Autores> findAll() {
        return autoresService.findAll();
    }

    @GetMapping("/nombre/{nombre}")
    public List<Autores> findByNombreContaining(@PathVariable String nombre) {
        return autoresService.findByNombreContaining(nombre);
    }

    @GetMapping("/apellido/{apellido}")
    public List<Autores> findByApellidoContaining(@PathVariable String apellido) {
        return autoresService.findByApellidoContaining(apellido);
    }

    @GetMapping("/fechaNacimiento/{fechaNacimiento}")
    public List<Autores> findByFechaNacimientoLessThan(@PathVariable String fechaNacimiento) {
        return autoresService.findByFechaNacimientoLessThan(fechaNacimiento);
    }

    @GetMapping("/sort/nombre")
    public List<Autores> findAllSortByNombre() {
        return autoresService.findAllSortByNombre();
    }

    @GetMapping("/id/{id}")
    public Autores findById(@PathVariable Long id) {
        return autoresService.findById(id);
    }

    @PostMapping
    public Autores save(@RequestBody Autores autor) {
        return autoresService.save(autor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        autoresService.deleteById(id);
    }
}
