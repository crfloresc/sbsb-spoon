package domain;

public class Servicio {

    private int id;
    private String nombre;
    private double precioUnitario;
    private int duracion;

    public Servicio(int id, String nombre, double precioUnitario, int duracion) {
        this.id = id;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.duracion = duracion;
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

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id=" + id + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", duracion=" + duracion + '}';
    }

}
