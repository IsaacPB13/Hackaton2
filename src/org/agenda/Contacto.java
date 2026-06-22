package org.agenda;

public class Contacto {

    private String nombre;
    private String apellido;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {

        if (!telefono.matches("^(?!0{10})\\d{10}$")) {
            throw new IllegalArgumentException("Telefono inválido");
        }
        else {

            this.telefono = telefono.trim();
        }
    }

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre.trim();
        this.apellido = apellido.trim();
        if (!telefono.matches("^(?!0{10})\\d{10}$")) {
            throw new IllegalArgumentException("Telefono inválido");
        }
        else {

            this.telefono = telefono.trim();
        }
    }

    @Override
    public String toString() {
        return "org.agenda.Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                '}';
    }


}
