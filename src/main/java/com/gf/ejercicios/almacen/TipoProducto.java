/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.ejercicios.almacen;

/**
 *
 * @author delcenjo
 */
public class TipoProducto {
    
    private int idTipo;
    private String tipo;

    public TipoProducto(int idTipo, String tipo) {
        this.idTipo = idTipo;
        this.tipo = tipo;
    }

    public TipoProducto() {
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return getTipo();
    }
    
}
