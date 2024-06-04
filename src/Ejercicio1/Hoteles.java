package Ejercicio1;

public class Hoteles extends Alojamientos{
    int nHabitaciones;
    int nHuespedesPorHabitacion;
    int Estrellas;

    public Hoteles(int id, String nombre, String direccion, int nHabitaciones, int nHuespedesPorHabitacion, int estrellas) {
        super(id, nombre, direccion);
        this.nHabitaciones = nHabitaciones;
        this.nHuespedesPorHabitacion = nHuespedesPorHabitacion;
        Estrellas = estrellas;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public int getnHuespedesPorHabitacion() {
        return nHuespedesPorHabitacion;
    }

    public void setnHuespedesPorHabitacion(int nHuespedesPorHabitacion) {
        this.nHuespedesPorHabitacion = nHuespedesPorHabitacion;
    }

    public int getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(int estrellas) {
        Estrellas = estrellas;
    }

}
