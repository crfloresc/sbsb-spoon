package domain;

import java.util.GregorianCalendar;

public abstract class Empleado extends Usuario {

    private String nombreCompleto;
    private GregorianCalendar fechaIngreso;

    public Empleado(String username, String password, String fullname, GregorianCalendar date) {
        super(username, password);
        nombreCompleto = fullname;
        fechaIngreso = date;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public GregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreDeUsuario=" + this.getNombreDeUsuario() + ", password=" + this.getPassword() + ", nombreCompleto=" + nombreCompleto + ", fechaIngreso=" + fechaIngreso + '}';
    }
}
