package com.biblioteca.biblioteca.service;


import com.biblioteca.biblioteca.entity.Usuarios;

import java.util.List;

public interface IUsuariosService {
    public List<Usuarios> findAll();
    public List<Usuarios> findByNombreContaining(String nombre);
    public List<Usuarios> findByApellidoContaining(String apellido);
    public List<Usuarios> findAllSortByNombre();
    public Usuarios findById(Long id);
    public Usuarios save(Usuarios usuario);
    public void deleteById(Long id);
}
