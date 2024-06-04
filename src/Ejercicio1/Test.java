package Ejercicio1;

import java.util.List;

public class Test{
    public static void main(String[] args) {
        Apartamentos apartamentos1 = new Apartamentos(123, "Apartamento1", "Jaen", 3, 4, 5, 3, 80);
        System.out.println(apartamentos1);
        System.out.println("AFORO");
        System.out.println(apartamentos1.aforoHotel(apartamentos1));
    }
}
