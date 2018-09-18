package com.example.rousah.persona;

public class Telefono {
    int numero;
    String descripcion;

    public Telefono (String desc, int num) {
        this.numero = num;
        this.descripcion = desc;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "numero=" + numero +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}


