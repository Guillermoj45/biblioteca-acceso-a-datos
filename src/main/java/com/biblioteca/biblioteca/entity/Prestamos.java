package com.biblioteca.biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "prestamos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Prestamos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prestamo")
    private Long idPrestamo;

    @JoinColumn(name = "id_libro", nullable = false)
    @ManyToOne
    private Libros libros;

    @JoinColumn(name = "id_usuario", nullable = false)
    @ManyToOne
    private Usuarios usuarios;

    @Column(name = "fecha_prestamo", nullable = false)
    private Date fechaPrestamo;

    @Column(name = "fecha_devolucion", nullable = false)
    private Date fechaDevolucion;

}
