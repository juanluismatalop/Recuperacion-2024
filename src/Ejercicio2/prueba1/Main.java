package Ejercicio2.prueba1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lineas;
        try {
            lineas = Files.readAllLines(Paths.get("Ficheros/ejercicio2.csv"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(lineas);
    }
}
