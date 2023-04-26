public class Animal {
protected String nombre;
protected int edad;
protected Owner owner;

protected enum Sexo{MACHO, HEMBRA};
protected Sexo sexo;
protected int peso;

public Animal(String nombre, int edad, Owner owner, Sexo sexo, int peso) {
    this.nombre = nombre;
    this.edad = edad;
    this.owner = owner;
    this.sexo = sexo;
    this.peso = peso;
}

public Animal() {

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Tipo de Animal: " + this.getClass().getSimpleName() + "\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Sexo: " + sexo.name().toLowerCase() + "\n" +
                "Peso(grs): " + peso + "\n" + owner.toString();
    }

    public String saludo() {
    if (sexo == Sexo.MACHO) {
        return "Hola, me llamo " + nombre + ", soy un ";
    }
    else {
        return "Hola, me llamo " + nombre + ", soy una ";
    }
    }
}
