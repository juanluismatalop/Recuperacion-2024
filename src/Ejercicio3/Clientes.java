package Ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public boolean actualizarPersona(Persona persona, String nuevoEmail, String nuevoFirstName, String nuevoLastName, Genero nuevoGender) {
        return false;
    }

    public boolean buscarPersonaEmail(String email) {
        Persona persona = null;
        if (persona.email.matches(email)) {
            System.out.println(persona);
            return true;
        }
        else
            return false;
    }

    public int numeroPersonaGenero(String gender, List<Persona> personas, String ruta) throws IOException {
        List<Persona> listaGenero = new ArrayList<>();
        Path path = Paths.get(ruta);
        List<String> lineas;
        lineas = Files.readAllLines(path);
        for (int i = 1; i< lineas.size(); i++){
            String[] tokens = lineas.get(i).split(",");
            int id = Integer.parseInt(tokens[0]);
            String firstName = tokens[1];
            String lastName = tokens[2];
            String email = tokens[3];
            Genero genero = Genero.valueOf(gender);
            Persona persona = new Persona(id, firstName, lastName, email, genero);
            listaGenero.add(persona);
        }
        return listaGenero.size();
    }
    private static Genero obtenerEnumGender(String genero){
        switch (genero){
            case "Male" -> {return Genero.MALE;}
            case "Female" -> {return Genero.FEMALE;}
            case "Genderfluid" -> {return Genero.GENDERFLUID;}
            case "Genderqueer" -> {return Genero.GENDERQUEER;}
            case "Non_binary" -> {return Genero.NON_BINARY;}
            case "Bigender" -> {return Genero.BIGENDER;}
            case "Polygender" -> {return Genero.POLYGENDER;}
            case "Agender" -> {return Genero.AGENDER;}
        }
        return null;
    }

    public List<Persona> personasPorDominioEmail() {
        return null;
    }


}
