package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.Autores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IAutoresRepository extends JpaRepository<Autores, Long> {
    @Query("FROM Autores a WHERE a.nombre like :nombre")
    List<Autores> findByNombreContaining(@Param("nombre") String nombre);

    @Query("FROM Autores a WHERE a.apellido like :apellido")
    List<Autores> findByApellidoContaining(@Param("apellido") String apellido);

    @Query("FROM Autores a WHERE a.fechaNacimiento <= :fechaNacimiento")
    List<Autores> findByFechaNacimientoLessThan(@Param("fechaNacimiento") String fechaNacimiento);

    @Query("FROM Autores a ORDER BY nombre ASC")
    public List<Autores> findAllSortByNombre();
}
