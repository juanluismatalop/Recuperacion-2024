package Ejercicio1;

import java.util.List;

public interface AlojamientosInterfaz {
    int aforoHotel(Apartamentos apartamentos);

    static Alojamientos mayorAlojamiento(List<Alojamientos> alojamientos, AlojamientosInterfaz interfaz) {
        Alojamientos alojamientoConMayorAforo = null;
        int mayorAforo = 0;

        for (Alojamientos alojamiento : alojamientos) {
            if (alojamiento instanceof Apartamentos) {
                int aforoActual = interfaz.aforoHotel((Apartamentos) alojamiento);
                if (aforoActual > mayorAforo) {
                    mayorAforo = aforoActual;
                    alojamientoConMayorAforo = alojamiento;
                }
            }
        }
        return alojamientoConMayorAforo;
    }
}
