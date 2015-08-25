package Codigo;
public class Usuarios {
    private String nombre;
    private String contrasenia;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContraseña(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", contrasenia=" + contrasenia + '}';
    }
    
    
    
}
