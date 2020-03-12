package test;

import domain.Administrador;
import domain.Barbero;
import java.util.GregorianCalendar;

public class DomainBSB {

    public static void main(String[] args) {
        GregorianCalendar fecha = new GregorianCalendar();
        Barbero em1 = new Barbero("default", "1234", "DEFAULT", fecha);
        System.out.println(em1.toString());
        
        Administrador em2 = new Administrador("default", "1234", "DEFAULT", fecha);
        System.out.println(em2.toString());
    }
}
