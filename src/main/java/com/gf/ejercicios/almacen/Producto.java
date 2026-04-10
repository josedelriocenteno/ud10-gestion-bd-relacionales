/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.almacen;

/**
 *
 * @author delcenjo
 */
public class Producto {
    
    private int entero;
    private String descripcion;
    private double precio;
    private int cantidad;
    private int tipo;

    public Producto() {
    }

    public Producto(int entero, String descripcion, double precio, int cantidad, int tipo) {
        this.entero = entero;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "entero=" + entero + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad + ", tipo=" + tipo + '}';
    }
   
}