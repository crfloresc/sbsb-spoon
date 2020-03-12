package domain;

import java.util.GregorianCalendar;

public class Orden {

    private String folio;
    private GregorianCalendar fecha;
    private Barbero barbero;
    private ListaDetalleServicio listaDetalleServicio;
    private ListaDetalleProducto listaDetalleProducto;
    private Promocion promocion;
    private float importe;

    public Orden() {
    }

    public Orden(String folio, GregorianCalendar fecha, Barbero barbero, ListaDetalleServicio listaDetalleServicio, ListaDetalleProducto listaDetalleProducto, Promocion promocion, float importe) {
        this.folio = folio;
        this.fecha = fecha;
        this.barbero = barbero;
        this.listaDetalleServicio = listaDetalleServicio;
        this.listaDetalleProducto = listaDetalleProducto;
        this.promocion = promocion;
        this.importe = importe;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Barbero getBarbero() {
        return barbero;
    }

    public void setBarbero(Barbero barbero) {
        this.barbero = barbero;
    }

    public ListaDetalleServicio getListaDetalleServicio() {
        return listaDetalleServicio;
    }

    public void setListaDetalleServicio(ListaDetalleServicio listaDetalleServicio) {
        this.listaDetalleServicio = listaDetalleServicio;
    }

    public ListaDetalleProducto getListaDetalleProducto() {
        return listaDetalleProducto;
    }

    public void setListaDetalleProducto(ListaDetalleProducto listaDetalleProducto) {
        this.listaDetalleProducto = listaDetalleProducto;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Orden{" + "folio=" + folio + ", fecha=" + fecha + ", barbero=" + barbero + ", listaDetalleServicio=" + listaDetalleServicio + ", listaDetalleProducto=" + listaDetalleProducto + ", promocion=" + promocion + ", importe=" + importe + '}';
    }
}
