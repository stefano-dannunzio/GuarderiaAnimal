public class Perro extends Animal{

    private String raza;

    public Perro() {

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaza: " + raza;
    }

    public String saludo() {
        return super.saludo() + "perro/a de raza " + raza + ".";
    }
}
