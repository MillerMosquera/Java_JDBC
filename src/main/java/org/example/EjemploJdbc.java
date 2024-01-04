package org.example;

import org.example.models.Producto;
import org.example.repositorio.IRepositorio;
import org.example.repositorio.Implements.ProductoRepositorioImpl;
import org.example.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstance()) {

            IRepositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("============= Listar =============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("============= Listar por Id =============");
            System.out.println(repositorio.porId(2L));

            /*System.out.println("============= Insertar =============");
            Producto producto = new Producto();
            producto.setNombre("Teclado");
            producto.setPrecio(150);
            producto.setFecha_registro(new Date());
            repositorio.guardar(producto);
            System.out.println("Producto guardado con éxito");
            repositorio.listar().forEach(System.out::println);

             */

            /*
            Producto producto = new Producto();
            System.out.println("============= Update =============");
            producto.setId(4L);
            producto.setNombre("Teclado Mecánico");
            producto.setPrecio(700);
            repositorio.guardar(producto);
            System.out.println("Se actualizó con éxito");
            repositorio.listar().forEach(System.out::println);
             */

            System.out.println("============= Eliminar =============");

            repositorio.eliminar(3L);
            System.out.println("Se eliminó con éxito");
            repositorio.listar().forEach(System.out::println);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}