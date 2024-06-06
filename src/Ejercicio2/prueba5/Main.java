package Ejercicio2.prueba5;

import Ejercicio2.prueba4.Helper;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.nio.file.Paths.*;

public class Main {
    public static void main(String[] args) {
        for (String l: Ejercicio2.prueba5.Helper.leerArchivo()){
            System.out.println(l);
        }
        System.out.println("========10 Valores Aleatorios============");
        List<String> diezValores = new ArrayList<>();
        List<String> leerHelper = Helper.leerFichero();
        Random random = new Random();
        for(int i = 1;i <= 10;i++){
            int index = random.nextInt(leerHelper.size());
            String valor = leerHelper.get(index);
            diezValores.add(i + "- " + valor);
        }
        for (String valor : diezValores) {
            System.out.println(valor);
        }
        Path ruta = Paths.get("Ficheros/ejercicio2.csv");
        Ciudad ciudad1 = new Ciudad("Peal de Becerro","España",1.00, 1.00);
        try {
            Files.writeString(ruta, ciudad1.toString()+ "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String l: Ejercicio2.prueba5.Helper.leerArchivo()){
            System.out.println(l);
        }

    }
}