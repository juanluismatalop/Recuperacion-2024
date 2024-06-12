package correccionEjercicio1;

import java.util.Objects;

public abstract class Alojamiento implements Vivienda{
    private int id;
    private String nombreAlojamiento;
    private String direccionAlojamineto;

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public String getDireccionAlojamineto() {
        return direccionAlojamineto;
    }

    public void setDireccionAlojamineto(String direccionAlojamineto) {
        this.direccionAlojamineto = direccionAlojamineto;
    }

    public Alojamiento(int id, String nombreAlojamiento, String direccionAlojamineto) {
        this.id = id;
        this.nombreAlojamiento = nombreAlojamiento;
        this.direccionAlojamineto = direccionAlojamineto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alojamiento that)) return false;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
