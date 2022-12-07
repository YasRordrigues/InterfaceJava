import java.lang.Math;

public class Triangulo extends Forma {

    private Double base;
    private Double altura;

    public Triangulo(Integer numLados, Double base, Double altura) {
        super(numLados);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double getArea() {
        return this.base * this.altura;
    }

    @Override
    public Double getPerimeter() {
        return this.base * getNumLados();
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
