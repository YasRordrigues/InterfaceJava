public abstract class Bola implements Arremessavel {
    @Override
    public void arremessar() {
        System.out.println("Bola arremessada");
    }

    public void quicar(){
        System.out.println("bola quicando");
    }
}