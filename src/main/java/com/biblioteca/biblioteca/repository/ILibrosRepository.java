package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.Libros;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ILibrosRepository extends JpaRepository<Libros, Long> {
    @Query("FROM Libros l WHERE l.titulo like :titulo")
    List<Libros> findByTituloContaining(@Param("titulo") String titulo);

    @Query("FROM Libros l WHERE l.anioPublicacion <= :fechaPublicacion")
    List<Libros> findByFechaPublicacionLessThan(@Param("fechaPublicacion") Date fechaPublicacion);

    @Query("FROM Libros l ORDER BY l.titulo ASC")
    public List<Libros> findAllSortByTitulo();
}
