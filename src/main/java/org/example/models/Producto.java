package org.example.models;

import lombok.*;


import java.util.Date;

@Getter
@Setter
@ToString
public class Producto {

    private Long id;
    private String nombre;
    private Integer precio;
    private Date fecha_registro;
    private Categoria categoria;

    public Producto() {

    }

    public Producto(Long id, String nombre, Integer precio, Date fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha_registro = fecha_registro;
    }
}
