package domain;

import java.util.GregorianCalendar;

public class Promocion {

    private int idPromocion;
    private ListaDetalleServicio listaDetalleServicio;
    private ListaDetalleProducto listaDetalleProducto;
    private float porcentajeDesc;
    private String descripcion;
    private GregorianCalendar fechaInicio;
    private int duracion;

    public Promocion(int idPromocion, ListaDetalleServicio listaDetalleServicio, ListaDetalleProducto listaDetalleProducto, float porcentajeDesc, String descripcion, GregorianCalendar fechaInicio, int duracion) {
        this.idPromocion = idPromocion;
        this.listaDetalleServicio = listaDetalleServicio;
        this.listaDetalleProducto = listaDetalleProducto;
        this.porcentajeDesc = porcentajeDesc;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
    }

    public int getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(int idPromocion) {
        this.idPromocion = idPromocion;
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

    public float getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(float porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Promocion{" + "idPromocion=" + idPromocion + ", listaDetalleServicio=" + listaDetalleServicio + ", listaDetalleProducto=" + listaDetalleProducto + ", porcentajeDesc=" + porcentajeDesc + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", duracion=" + duracion + '}';
    }
}
