package Ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> lineas;
        try {
            lineas = Files.readAllLines(Paths.get("Ficheros/ejercicio2.csv"));
            for (String s: lineas) {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
