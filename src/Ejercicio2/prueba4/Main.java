package Ejercicio2.prueba4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main{
        public static void main(String[] args) {
            for (String l: Helper.leerFichero()){
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
        }
    }