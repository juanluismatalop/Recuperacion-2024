package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Alojamientos implements AlojamientosInterfaz {
    int id;
    String nombre;
    String direccion;

    public Alojamientos(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int aforoHotel(Apartamentos apartamentos) {
        return apartamentos.nHabitaciones * apartamentos.nCamasIndividuales;
    }
}