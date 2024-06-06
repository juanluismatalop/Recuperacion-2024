package Ejercicio2.prueba4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static List<String> leerFichero(){
        Path ruta = Paths.get("Ficheros/ejercicio2.csv");
        List<String> lineas;
        List<String> lineasLeidas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(String.valueOf(ruta)));
            for (String s: lineas) {
                lineasLeidas.add(s+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lineasLeidas;
    }
}
