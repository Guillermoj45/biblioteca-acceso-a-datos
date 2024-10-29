package com.biblioteca.biblioteca.service;


import com.biblioteca.biblioteca.entity.Usuarios;
import com.biblioteca.biblioteca.repository.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UsuariosService implements IUsuariosService {

    @Autowired
    private IUsuariosRepository usuariosRepository;


    @Override
    public List<Usuarios> findAll() {
        return usuariosRepository.findAll();
    }

    @Override
    public List<Usuarios> findByNombreContaining(@RequestBody String nombre) {
        return usuariosRepository.findByNombreContaining(nombre);
    }

    @Override
    public List<Usuarios> findByApellidoContaining(@RequestBody String apellido) {
        return findByApellidoContaining(apellido);
    }

    @Override
    public List<Usuarios> findAllSortByNombre() {
        return usuariosRepository.findAllSortByNombre();
    }

    @Override
    public Usuarios findById(@RequestBody Long id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    @Override
    public Usuarios save(@RequestBody Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    @Override
    public void deleteById(@RequestBody Long id) {
        usuariosRepository.deleteById(id);
    }
}
