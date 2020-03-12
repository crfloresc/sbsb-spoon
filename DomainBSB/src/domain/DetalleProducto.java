package domain;

public class DetalleProducto {

    private Producto producto;
    private int cantidad;
    private double precio;

    public DetalleProducto(Producto producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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
        return "DetalleProducto{" + "producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
}
