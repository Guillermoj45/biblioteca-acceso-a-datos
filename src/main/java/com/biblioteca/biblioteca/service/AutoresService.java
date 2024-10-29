package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.Autores;
import com.biblioteca.biblioteca.repository.IAutoresRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoresService implements IAutoresService {
    @Autowired
    private IAutoresRepository autoresRepository;

    @Override
    public List<Autores> findAll() {
        return autoresRepository.findAll();
    }

    @Override
    public List<Autores> findByNombreContaining(String nombre) {
        return autoresRepository.findByNombreContaining(nombre);
    }

    @Override
    public List<Autores> findByApellidoContaining(String apellido) {
        return autoresRepository.findByApellidoContaining(apellido);
    }

    @Override
    public List<Autores> findByFechaNacimientoLessThan(String fechaNacimiento) {
        return autoresRepository.findByFechaNacimientoLessThan(fechaNacimiento);
    }

    @Override
    public List<Autores> findAllSortByNombre() {
        return autoresRepository.findAllSortByNombre();
    }

    @Override
    public Autores findById(Long id) {
        return autoresRepository.findById(id).orElse(null);
    }

    @Override
    public Autores save(Autores autor) {
        return autoresRepository.save(autor);
    }

    @Override
    public void deleteById(Long id) {
        autoresRepository.deleteById(id);
    }
}
