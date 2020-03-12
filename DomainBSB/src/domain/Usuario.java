package domain;

public abstract class Usuario {

    private String nombreDeUsuario;
    private String password;

    public Usuario(String name, String password) {
        nombreDeUsuario = name;
        this.password = password;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreDeUsuario=" + nombreDeUsuario + ", password=" + password + '}';
    }
}
