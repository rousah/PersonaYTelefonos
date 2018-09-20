package com.example.rousah.persona;

import java.security.Permission;
import java.util.ArrayList;

public class Principal {
    public static void main (String args[]) {

        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona yo = new Persona("20863920E", "Joan", "Cipria");
        personas.add(yo);

        yo.anyadir(new Telefono("Movil", 633537044));
        yo.anyadir(new Telefono("Trabajo", 952523888));

        // Buscar una persona dado un nombre
        Persona p = buscar(personas, "Joan");
        //Mostrar todos los teléfonos de una persona
        p.mostrarTelefonos();
    }

    public static Persona buscar(ArrayList<Persona> personas, String nombre) {
        for (int i=0; i<=personas.size(); i++) {
            if (nombre == personas.get(i).nombre) {
                return personas.get(i);
            }
        }
        return null;
    }
}


