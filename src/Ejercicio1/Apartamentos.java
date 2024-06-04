package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Apartamentos extends Hoteles implements AlojamientosInterfaz{
    int nCamasIndividuales;
    int nCamasHotel;

    public Apartamentos(int id, String nombre, String direccion, int nHabitaciones, int nHuespedesPorHabitacion, int estrellas, int nCamasIndividuales, int nCamasHotel) {
        super(id, nombre, direccion, nHabitaciones, nHuespedesPorHabitacion, estrellas);
        this.nCamasIndividuales = nCamasIndividuales;
        this.nCamasHotel = nCamasHotel;
    }

    public int getnCamasIndividuales() {
        return nCamasIndividuales;
    }

    public void setnCamasIndividuales(int nCamasIndividuales) {
        this.nCamasIndividuales = nCamasIndividuales;
    }

    public int getnCamasHotel() {
        return nCamasHotel;
    }

    public void setnCamasHotel(int nCamasHotel) {
        this.nCamasHotel = nCamasHotel;
    }
    @Override
    public int aforoHotel(Apartamentos apartamentos) {
        return apartamentos.nHabitaciones * apartamentos.nCamasIndividuales;
    }

    @Override
    public Alojamientos mayorAlojamiento(List<Alojamientos> alojamientos) {
        alojamientos = new ArrayList<>();
        Alojamientos alojamientoMayorAforo = null;
        return alojamientoMayorAforo;
    }
    @Override
    public String toString() {
        return String.format("%s,%s,%d,%d,%d,%d,%d,%d",nombre,direccion,id,nHabitaciones,nHuespedesPorHabitacion,getEstrellas(),nCamasIndividuales,nCamasHotel);
    }
}
