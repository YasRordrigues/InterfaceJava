public abstract class Forma {
    private Integer numLados;

    public Forma(Integer numLados) {
        this.numLados = numLados;
    }

    public Integer getNumLados() {
        return numLados;
    }

    public void setNumLados(Integer numLados) {
        this.numLados = numLados;
    }

    public abstract Float getArea();
    public abstract Float getPerimeter();

}
