package correccionEjercicio1;

import java.util.ArrayList;
import java.util.List;

public class AgenciaDeViajes {
    private String nombreAgencia;
    private List<Alojamiento> alojamientos = new ArrayList<>();

    public AgenciaDeViajes(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }
    public String getNombreAgencia() {
        return nombreAgencia;
    }
    //metodos crud
    /*public void annadirAlojamiento(Alojamiento alojamiento){
        alojamientos.add(alojamiento);
    }*/
    public boolean annadirAlojamientos(Alojamiento alojamiento){
        return alojamientos.add(alojamiento);
    }
    public boolean eliminarAlojamiento(Alojamiento alojamiento){
        return alojamientos.remove(alojamiento);
    }
    public List<Alojamiento> getAlojamientos() {
        return alojamientos;
    }
    public boolean actualizarAlojamiento(int id, String nuevoNombre, String nuevaDireccion){
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento.getId() == id) {
                alojamiento.setNombreAlojamiento(nuevoNombre);
                alojamiento.setDireccionAlojamineto(nuevaDireccion);
                return true;
            }
        }
        return false;
    }
}
