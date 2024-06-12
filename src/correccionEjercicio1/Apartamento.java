package correccionEjercicio1;

public class Apartamento extends Alojamiento{
    private int numeroDeCamasIndividuales;
    private int numeroDeCamasDoble;

    public Apartamento(int id, String nombreAlojamiento, String direccionAlojamineto, int numeroDeCamasIndividuales, int numeroDeCamasDoble) {
        super(id, nombreAlojamiento, direccionAlojamineto);
        this.numeroDeCamasIndividuales = numeroDeCamasIndividuales;
        this.numeroDeCamasDoble = numeroDeCamasDoble;
    }

    public int getNumeroDeCamasIndividuales() {
        return numeroDeCamasIndividuales;
    }

    public void setNumeroDeCamasIndividuales(int numeroDeCamasIndividuales) {
        this.numeroDeCamasIndividuales = numeroDeCamasIndividuales;
    }

    public int getNumeroDeCamasDoble() {
        return numeroDeCamasDoble;
    }

    public void setNumeroDeCamasDoble(int numeroDeCamasDoble) {
        this.numeroDeCamasDoble = numeroDeCamasDoble;
    }

    @Override
    public int obtenerAforo() {
        return numeroDeCamasIndividuales+(2*numeroDeCamasDoble);
    }

    @Override
    public String toString() {
        return String.format("Apartamento,%s,%d,%d%n",getNombreAlojamiento(),numeroDeCamasIndividuales,numeroDeCamasDoble);
    }
}
