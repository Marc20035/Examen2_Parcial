package org.example;

public class Canoe extends Ship{
    public Canoe(Punto p1, Punto p2) {
        super(p1, p2);
        if(this.getSize()!=1){
            System.out.println("Error, La Conoa debe de tener 1 de tamaño");
            throw new IllegalArgumentException("La Conoa debe de tener 1 de tamaño");
        }
    }
}
