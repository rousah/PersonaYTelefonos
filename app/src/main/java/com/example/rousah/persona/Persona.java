package com.example.rousah.persona;

import java.util.ArrayList;

public class Persona {
    String dni;
    String nombre;
    String apellido;
    ArrayList<Telefono> telefonos =  new ArrayList<Telefono>();
    int total;

    public Persona (String dni1, String nom, String apell) {
        this.dni = dni1;
        this.nombre = nom;
        this.apellido = apell;
        this.total++;
    }

    public Persona () {
        this.dni = null;
        this.nombre = null;
        this.apellido = null;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public void anyadir (Telefono tel) {
        this.telefonos.add(tel);
    }

    public void mostrarTelefonos () {
        String texto = telefonos.toString();
        System.out.println(texto);
    }


}
