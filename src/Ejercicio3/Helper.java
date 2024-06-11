package Ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public static long escribirEnFichero(String ruta, List<Persona> personas) throws IOException {
        Path path = Path.of(ruta);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < personas.size(); i++) {
            builder.append(i).append(".- ").append(personas.get(i)).append('\n');
        }
        String texto = builder.toString().substring(0,builder.toString().length());
        Files.writeString(path, texto, StandardOpenOption.CREATE);
        return 0;
    }
    public static boolean validarEmail(String email){
        if (email==null)
            return false;
        String emailValido = "^[\\w]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(emailValido);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) throws IOException {
        List<Persona> personas = Helper.obtenerPersonaDesdeFicheros("Ficheros/Output/PersonasRecuperacion.csv");

        System.out.println(Helper.escribirEnFichero("Ficheros/Output/PersonasRecuperacion.csv", personas));
    }
}
