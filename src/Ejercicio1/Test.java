package Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test{
    public static void main(String[] args) {
        List<Apartamentos> apartamentos = new ArrayList<>();
        Apartamentos apartamento1 = new Apartamentos(1, "Apartamento 1", "Calle A", 10, 2, 5, 8, 10);
        Apartamentos apartamento2 = new Apartamentos(2, "Apartamento 2", "Calle B", 20, 1, 4, 23, 45);
        Apartamentos apartamento3 = new Apartamentos(3, "Apartamento 3", "Calle C", 5, 4, 3, 45, 7);
        apartamentos.add(apartamento1);
        apartamentos.add(apartamento2);
        apartamentos.add(apartamento3);
        System.out.println(apartamentos);
        System.out.println("AFORO");
        System.out.println(apartamento1.aforoHotel(apartamento1));
        System.out.println(apartamento2.aforoHotel(apartamento2));
        System.out.println(apartamento3.aforoHotel(apartamento3));
        System.out.println("Mayor Aforo");
        AlojamientosInterfaz alojamientosInterfaz = new Apartamentos();

    }
}
