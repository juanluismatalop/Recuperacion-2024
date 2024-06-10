package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    String nombreClientes;
    int socios;
    int jugadores;
    List<Persona> listaPersonas;

    public Clientes(String nombreClientes, int socios, int jugadores, List<Persona> listaPersonas) {
        this.nombreClientes = nombreClientes;
        this.socios = socios;
        this.jugadores = jugadores;
        this.listaPersonas = new ArrayList<>();
    }

    public void annadirPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    public boolean eliminarPersona(String email, Persona persona) {
        return listaPersonas.remove(persona.email.matches(email));
    }

    public boolean actualizarPersona() {
        return false;
    }

    public boolean buscarPersonaEmail() {
        return false;
    }

    public int numeroPersonaGenero() {
        return 0;
    }

    public List<Persona> personasPorDominioEmail() {
        return null;
    }


}
