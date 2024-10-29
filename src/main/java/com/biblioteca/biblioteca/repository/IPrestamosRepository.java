package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.Prestamos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPrestamosRepository extends JpaRepository<Prestamos, Long> {
    @Query("FROM Prestamos p WHERE p.fechaPrestamo <= :fechaPrestamo")
    List<Prestamos> findByFechaPrestamoLessThan(@Param("fechaPrestamo") String fechaPrestamo);

    @Query("FROM Prestamos p WHERE p.fechaDevolucion <= :fechaDevolucion")
    List<Prestamos> findByFechaDevolucionLessThan(@Param("fechaDevolucion") String fechaDevolucion);

    @Query("FROM Prestamos p ORDER BY fechaPrestamo ASC")
    public List<Prestamos> findAllSortByFechaPrestamo();
}
