package com.biblioteca.biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "libros")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Long idLibro;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @JoinColumn(name = "id_autor", nullable = false)
    @ManyToOne
    private Autores autores;

    @Column(name = "anio_publicacion", nullable = false)
    private Date anioPublicacion;

    @Column(name = "genero", nullable = false)
    private String genero;
}
