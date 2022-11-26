package com.example.myapplication.listas;

import java.io.Serializable;

public class HistorialModel implements Serializable {
    private String nombre;
    private String trabajo;
    private String estado;
    private int idR;

    public HistorialModel(String nombre, String trabajo, String estado, int idR) {
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.estado = estado;
        this.idR = idR;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }
}
