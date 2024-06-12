package correccionEjercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public interface Vivienda {
    int obtenerAforo();
    static Vivienda obtenerAlojamientoMayorAforo (List<Alojamiento> alojamientos){
        //iniciamos una variable aforo
        int mayorAforo = 0;
        //iniciamos una variable vivienda que es la que vamos a devolver
        Alojamiento alojamientoMayorAforo = null;
        for (Alojamiento alojamiento : alojamientos){
            if (alojamiento.obtenerAforo() > mayorAforo){
                mayorAforo = alojamiento.obtenerAforo();
                alojamientoMayorAforo = alojamiento;
            }
        }
        return alojamientoMayorAforo;
    }
    static void esribirAlojamientos(List<Alojamiento> alojamientos){
        String pathHoteles = "Ficheros/Input/hoteles.csv";
        String pathApartamento = "Ficheros/Input/apartamentos.csv";
        for (Alojamiento alojamiento: alojamientos){
            if (alojamiento instanceof Hotel){
                //escribir hotel
                try {
                    Files.writeString(Path.of(pathHoteles), alojamiento.toString(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                //escribir apartamento
                try {
                    Files.writeString(Path.of(pathApartamento), alojamiento.toString(),StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    static void leerArchivo(String ruta){
        Path path = Paths.get(ruta);
        List<String> lineas;
        try {
            lineas = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String linea : lineas){
            System.out.println(linea);
        }
    }
}
