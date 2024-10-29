package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.Libros;

import java.util.Date;
import java.util.List;

public interface ILibrosService {
    public List<Libros> findAll();
    public List<Libros> findByTituloContaining(String titulo);
    public List<Libros> findByFechaPublicacionLessThan(Date fechaPublicacion);
    public List<Libros> findAllSortByTitulo();
    public Libros findById(Long id);
    public Libros save(Libros libro);
    public void deleteById(Long id);
}
