public class Mojarrita extends Animal {

    protected enum DeAgua{FRIA, TROPICAL}
    private DeAgua deAgua;

    public Mojarrita() {

    }

    public DeAgua getDeAgua() {
        return deAgua;
    }

    public void setDeAgua(DeAgua deAgua) {
        this.deAgua = deAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDe Agua: " + deAgua.name().toLowerCase();
    }

    @Override
    public String saludo() {
        return super.saludo() + "mojarrita de agua " + deAgua.name().toLowerCase() + ".";

    }

}
