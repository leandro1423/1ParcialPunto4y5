package Models;

import java.util.ArrayList;

public class Propietario {


    private String nombre;
    private String cedula;
    private String email;
    private String celular;



    public Propietario(String nombre, String cedula, String email,
                       String celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
