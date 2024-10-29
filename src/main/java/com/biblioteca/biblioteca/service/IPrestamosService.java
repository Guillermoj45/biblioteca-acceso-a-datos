package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.Prestamos;

import java.util.List;

public interface IPrestamosService {
    public List<Prestamos> findAll();
    public List<Prestamos> findByFechaPrestamoLessThan(String fechaPrestamo);
    public List<Prestamos> findByFechaDevolucionLessThan(String fechaDevolucion);
    public List<Prestamos> findAllSortByFechaPrestamo();
    public Prestamos findById(Long id);
    public Prestamos save(Prestamos prestamo);
    public void deleteById(Long id);
}
