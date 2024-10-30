package com.biblioteca.biblioteca.controller;


import com.biblioteca.biblioteca.entity.Prestamos;
import com.biblioteca.biblioteca.service.PrestamosService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
public class PrestamosController {
    private final PrestamosService prestamosService;

    public PrestamosController(PrestamosService prestamosService) {
        this.prestamosService = prestamosService;
    }

    @GetMapping
    public List<Prestamos> findAll() {
        return prestamosService.findAll();
    }

    @GetMapping("/fechaPrestamo/{fechaPrestamo}")
    public List<Prestamos> findByFechaPrestamoLessThan(@RequestBody String fechaPrestamo) {
        return prestamosService.findByFechaPrestamoLessThan(fechaPrestamo);
    }

    @GetMapping("/fechaDevolucion/{fechaDevolucion}")
    public List<Prestamos> findByFechaDevolucionLessThan(@RequestBody String fechaDevolucion) {
        return prestamosService.findByFechaDevolucionLessThan(fechaDevolucion);
    }

    @GetMapping("/sort/fechaPrestamo")
    public List<Prestamos> findAllSortByFechaPrestamo() {
        return prestamosService.findAllSortByFechaPrestamo();
    }

    @GetMapping("/id/{id}")
    public Prestamos findById(@PathVariable Long id) {
        return prestamosService.findById(id);
    }

    @PostMapping
    public Prestamos save(@RequestBody Prestamos prestamo) {
        return prestamosService.save(prestamo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@RequestBody Long id) {
        prestamosService.deleteById(id);
    }
}
