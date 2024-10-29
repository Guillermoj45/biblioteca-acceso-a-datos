package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface IUsuariosRepository extends JpaRepository<Usuarios, Long> {
    @Query("FROM Usuarios u WHERE u.nombre like :nombre")
    List<Usuarios> findByNombreContaining(@Param("nombre") String nombre);

    @Query("FROM Usuarios u WHERE u.apellido like :apellido")
    List<Usuarios> findByApellidoContaining(@Param("apellido") String apellido);


    @Query("FROM Usuarios u ORDER BY nombre ASC")
    public List<Usuarios> findAllSortByNombre();
}
