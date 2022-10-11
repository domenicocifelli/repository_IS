package org.example;

public class Calcolatrice {

    private int a,b;

    public Calcolatrice(){
        this.a=0;
        this.b=0;
    }

    public int somm(int a, int b){
        return a+b;
    }

    public int sottrazione(int a, int b){
        return a-b;
    }

    public int moltiplicazione(int a, int b){
        return a*b;
    }

    public int divisione(int a, int b){
        return a/b;
    }
}
