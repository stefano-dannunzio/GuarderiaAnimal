public class Owner {
    private int dni;
    private String nombre;
    private String direccion;

    public Owner(int dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Owner() {

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre del Dueño: " + getNombre() + "\n" +
                "DNI del Dueño: " + getDni() + "\n" +
                "Dirección del Dueño: " + getDireccion();
    }
}
