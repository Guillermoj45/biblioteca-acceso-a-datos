package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.Libros;
import com.biblioteca.biblioteca.repository.ILibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LibrosService implements ILibrosService {

    @Autowired
    private ILibrosRepository librosRepository;

    @Override
    public List<Libros> findAll() {
        return librosRepository.findAll();
    }

    @Override
    public List<Libros> findByTituloContaining(String titulo) {
        return librosRepository.findByTituloContaining(titulo);
    }

    @Override
    public List<Libros> findByFechaPublicacionLessThan(Date fechaPublicacion) {
        return librosRepository.findByFechaPublicacionLessThan(fechaPublicacion);
    }

    @Override
    public List<Libros> findAllSortByTitulo() {
        return librosRepository.findAllSortByTitulo();
    }

    @Override
    public Libros findById(Long id) {
        return librosRepository.findById(id).orElse(null);
    }

    @Override
    public Libros save(Libros libro) {
        return librosRepository.save(libro);
    }

    @Override
    public void deleteById(Long id) {
        librosRepository.deleteById(id);
    }
}
