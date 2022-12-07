import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    // Método main pra iniciar o programa
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // instanciando retãngulo
        Retangulo retangulo = new Retangulo(4, 2.0, 3.0);

        // instanciando triângulo
        Triangulo triangulo = new Triangulo(3, 4.0, 6.0);

        // Criando o array list que só aceita o tipo Forma dentro
        ArrayList<Forma> formas = new ArrayList<>();

        // Adicionando triângulo e retângulo ao array
        formas.add(retangulo);
        formas.add(triangulo);

        System.out.println(retangulo);

        // Filtrando e testando quais formas implementam a interface Redimensionavel
        List<Forma> formaList = formas

                // Convertendo em stream de dados
                .stream()

                // utilizando peek para executar uma função que retorna void
                .peek(forma -> {
                    if(forma instanceof Redimensionavel) ((Redimensionavel) forma).redimensionar(0.5);
                })

                // Transformando de volta pra lista
                .collect(Collectors.toList());

       System.out.println(formaList);
    }
}