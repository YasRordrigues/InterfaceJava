import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Retangulo retangulo = new Retangulo(4, 2.0, 3.0);
        Triangulo triangulo = new Triangulo(3, 4.0, 6.0);
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(retangulo);
        formas.add(triangulo);

        System.out.println(retangulo);
        List<Forma> formaList = formas
                .stream()
                .peek(forma -> {
                    if(forma instanceof Redimensionavel) ((Redimensionavel) forma).redimensionar(0.5);
                })
                .collect(Collectors.toList());

       System.out.println(formaList);
    }
}