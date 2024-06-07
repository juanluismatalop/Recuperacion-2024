package Ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static List<Persona> obtenerPersonaDesdeFicheros(String ruta) throws IOException {
        List<Persona> personas = new ArrayList<>();

        Path path = Paths.get(ruta);
        List<String> lineas;
        lineas = Files.readAllLines(path);
        for (int i = 1; i< lineas.size(); i++){
            String[] tokens = lineas.get(i).split(",");
            int id = Integer.parseInt(tokens[0]);
            String firstName = tokens[1];
            String lastName = tokens[2];
            String email = tokens[3];
            Genero genero = obtenerEnumGender(tokens[4]);
            Persona persona = new Persona(id, firstName, lastName, email, genero);
            personas.add(persona);
        }
        return personas;
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
    public static long escribirFichero(Path ruta, List<Persona> personas){
        ruta = Paths.get("Ficheros/Input/PersonasRecuperacion.csv");
        //creamos un builder
        StringBuilder builder = new StringBuilder();
        //recorreromos la lista
        for(Persona persona:personas){
        }
        //añadimos cada elemento utilizando el toString
        //usamosWriteString
        return 0;
    }
    public static boolean validarEmail(String email){
        return false;
    }
}
