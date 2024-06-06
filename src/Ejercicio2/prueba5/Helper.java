package Ejercicio2.prueba5;

import Ejercicio2.prueba3.Ciudad;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static List<String> leerArchivo(){
        List<String> lineas;
        List<Ejercicio2.prueba3.Ciudad> ciudades = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get("Ficheros/ejercicio2.csv"));
            boolean primeraLinea = true;
            for (String s: lineas) {
                if (primeraLinea) {
                    primeraLinea = false;
                    continue;
                }
                String[] parametros = s.split(",");
                String city = parametros[0];
                String country = parametros[1];
                double latitude = Double.parseDouble(parametros[2]);
                double longitude = Double.parseDouble(parametros[3]);
                Ejercicio2.prueba3.Ciudad ciudad = new Ciudad(city,country,latitude,longitude);
                ciudades.add(ciudad);
            }
            System.out.println(ciudades);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lineas;
    }
}
