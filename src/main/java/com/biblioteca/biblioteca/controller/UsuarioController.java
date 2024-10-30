package com.biblioteca.biblioteca.controller;


import com.biblioteca.biblioteca.entity.Usuarios;
import com.biblioteca.biblioteca.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuariosService usuariosService;

    @GetMapping
    public List<Usuarios> findAll() {
        return usuariosService.findAll();
    }

    @GetMapping("/nombre/{nombre}")
    public List<Usuarios> findByNombreContaining(@RequestBody String nombre) {
        return usuariosService.findByNombreContaining(nombre);
    }

    @GetMapping("/apellido/{apellido}")
    public List<Usuarios> findByApellidoContaining(@RequestBody String apellido) {
        return usuariosService.findByApellidoContaining(apellido);
    }

    @GetMapping("/sort/nombre")
    public List<Usuarios> findAllSortByNombre() {
        return usuariosService.findAllSortByNombre();
    }

    @GetMapping("/id/{id}")
    public Usuarios findById(@PathVariable Long id) {
        return usuariosService.findById(id);
    }

    @PostMapping
    public Usuarios save(@RequestBody Usuarios usuario) {
        return usuariosService.save(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@RequestBody Long id) {
        usuariosService.deleteById(id);
    }
}
