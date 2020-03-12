package domain;

import java.util.GregorianCalendar;

public class Cita {

    private Barbero barbero;
    private Cliente cliente;
    private Servicio servicio;
    private GregorianCalendar fechaHora;

    public Cita(Barbero barbero, Cliente cliente, Servicio servicio, GregorianCalendar fechaHora) {
        this.barbero = barbero;
        this.cliente = cliente;
        this.servicio = servicio;
        this.fechaHora = fechaHora;
    }

    public Barbero getBarbero() {
        return barbero;
    }

    public void setBarbero(Barbero barbero) {
        this.barbero = barbero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public GregorianCalendar getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(GregorianCalendar fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Cita{" + "barbero=" + barbero + ", cliente=" + cliente + ", servicio=" + servicio + ", fechaHora=" + fechaHora + '}';
    }
}
