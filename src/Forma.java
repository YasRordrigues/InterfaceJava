public abstract class Forma {
    private Integer numLados;

    public Forma(Integer numLados) {
        this.numLados = numLados;
    }

    public Integer getNumLados() {
        return this.numLados;
    }

    public void setNumLados(Integer numLados) {
        this.numLados = numLados;
    }

    public abstract Double getArea();
    public abstract Double getPerimeter();

}
