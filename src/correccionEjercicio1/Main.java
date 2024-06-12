package correccionEjercicio1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Alojamiento alojamiento1 = new Hotel(1, "Hotel1", "direccionHotel1", 3,2,3);
        Alojamiento alojamiento2 = new Hotel(2, "Hotel2", "direccionHotel2", 15,2,5);
        Alojamiento alojamiento3 = new Apartamento(3, "Apartamento1", "direccionApartamento1",5,10);
        Alojamiento alojamiento4 = new Apartamento(4, "Apartamento2", "direccionApartamento2",9,2);
        AgenciaDeViajes agenciaDeViajes = new AgenciaDeViajes("Agencia1");
        agenciaDeViajes.annadirAlojamientos(alojamiento1);
        agenciaDeViajes.annadirAlojamientos(alojamiento2);
        agenciaDeViajes.annadirAlojamientos(alojamiento3);
        agenciaDeViajes.annadirAlojamientos(alojamiento4);
        agenciaDeViajes.eliminarAlojamiento(alojamiento1);
        agenciaDeViajes.actualizarAlojamiento(2,"Hotel1", "direccionHotel1");
        List<Alojamiento> alojamientos = agenciaDeViajes.getAlojamientos();
        alojamientos.forEach(System.out::println);
        System.out.println(Vivienda.obtenerAlojamientoMayorAforo(alojamientos));
        Vivienda.esribirAlojamientos(alojamientos);
        System.out.println("======Hoteles==========");
        Vivienda.leerArchivo("Ficheros/Input/hoteles.csv");
        System.out.println("======Apartamentos==========");
        Vivienda.leerArchivo("Ficheros/Input/apartamentos.csv");
    }
}
