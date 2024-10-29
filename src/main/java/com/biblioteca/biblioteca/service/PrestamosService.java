package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.Prestamos;
import com.biblioteca.biblioteca.repository.IPrestamosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamosService implements IPrestamosService {

    @Autowired
    IPrestamosRepository prestamosRepository;

    @Override
    public List<Prestamos> findAll() {
        return prestamosRepository.findAll();
    }

    @Override
    public List<Prestamos> findByFechaPrestamoLessThan(String fechaPrestamo) {
        return prestamosRepository.findByFechaPrestamoLessThan(fechaPrestamo);
    }

    @Override
    public List<Prestamos> findByFechaDevolucionLessThan(String fechaDevolucion) {
        return prestamosRepository.findByFechaDevolucionLessThan(fechaDevolucion);
    }

    @Override
    public List<Prestamos> findAllSortByFechaPrestamo() {
        return prestamosRepository.findAllSortByFechaPrestamo();
    }

    @Override
    public Prestamos findById(Long id) {
        return prestamosRepository.findById(id).orElse(null);
    }

    @Override
    public Prestamos save(Prestamos prestamo) {
        return prestamosRepository.save(prestamo);
    }

    @Override
    public void deleteById(Long id) {
        prestamosRepository.deleteById(id);
    }
}
