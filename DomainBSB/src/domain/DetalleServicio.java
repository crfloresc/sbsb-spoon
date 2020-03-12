package domain;

public class DetalleServicio {

    private Servicio servicio;
    private int cantidad;
    private double precio;

    public DetalleServicio(Servicio servicio, int cantidad, double precio) {
        this.servicio = servicio;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DetalleServicio{" + "servicio=" + servicio + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
}
