public class Retangulo extends Forma implements Redimensionavel{

    private Double largura;
    private Double altura;

    public Retangulo(Integer numLados, Double largura, Double altura) {
        super(numLados);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Double getArea() {
        return largura * altura;
    }

    @Override
    public Double getPerimeter() {
        return 2 * (altura + largura);
    }

    @Override
    public void redimensionar(double x) {
        this.largura = this.largura * x;
        this.altura = this.altura * x;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                '}';
    }
}
