public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Futebol futebol = new Futebol();
        futebol.arremessar();
        futebol.quicar();

        Beisebol beisebol = new Beisebol();
        beisebol.arremessar();
        beisebol.quicar();
    }
}