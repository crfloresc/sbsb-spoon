package domain;

import java.util.GregorianCalendar;

public class Cliente {

    private String nombreCompleto;
    private String telefono;
    private GregorianCalendar fechaRegistro;

    public Cliente(String nombreCompleto, String telefono, GregorianCalendar fechaRegistro) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public GregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(GregorianCalendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCompleto=" + nombreCompleto + ", telefono=" + telefono + ", fechaRegistro=" + fechaRegistro + '}';
    }
}
