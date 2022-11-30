package com.example.interfacesjava;

public abstract class Bola implements Arremassavel{
    @Override
    public void arremessar() {
        System.out.println("arremessando bola");
    }

    public void quicar(){
        System.out.println("bola quicando");
    }

}
