package correccionEjercicio1;

public class Hotel extends Alojamiento{
    private int numeroHabitaciones;
    private int numeroHuespedesPorHabitacion;
    private int numeroEstrellas;

    public Hotel(int id, String nombreAlojamiento, String direccionAlojamineto, int numeroHabitaciones, int numeroHuespedesPorHabitacion, int numeroEstrellas) {
        super(id, nombreAlojamiento, direccionAlojamineto);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroHuespedesPorHabitacion = numeroHuespedesPorHabitacion;
        this.numeroEstrellas = numeroEstrellas;
    }

    @Override
    public int obtenerAforo() {
        return numeroHabitaciones*numeroHuespedesPorHabitacion;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public int getNumeroHuespedesPorHabitacion() {
        return numeroHuespedesPorHabitacion;
    }

    public void setNumeroHuespedesPorHabitacion(int numeroHuespedesPorHabitacion) {
        this.numeroHuespedesPorHabitacion = numeroHuespedesPorHabitacion;
    }

    public int getNumeroEstrellas() {
        return numeroEstrellas;
    }

    public void setNumeroEstrellas(int numeroEstrellas) {
        this.numeroEstrellas = numeroEstrellas;
    }

    @Override
    public String toString() {
        return String.format("hotel,%s,%d,%d,%d%n",getNombreAlojamiento(),numeroHabitaciones,numeroHuespedesPorHabitacion,numeroEstrellas);
    }
}
