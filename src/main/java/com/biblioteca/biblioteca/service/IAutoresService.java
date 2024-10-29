package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.Autores;

import java.util.List;

public interface IAutoresService {
    public List<Autores> findAll();
    public List<Autores> findByNombreContaining(String nombre);
    public List<Autores> findByApellidoContaining(String apellido);
    public List<Autores> findByFechaNacimientoLessThan(String fechaNacimiento);
    public List<Autores> findAllSortByNombre();
    public Autores findById(Long id);
    public Autores save(Autores autor);
    public void deleteById(Long id);
}
