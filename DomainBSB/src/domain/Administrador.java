package domain;

import java.util.GregorianCalendar;

public class Administrador extends Empleado {

    public Administrador(String username, String password, String fullname, GregorianCalendar date) {
        super(username, password, fullname, date);
    }
}
