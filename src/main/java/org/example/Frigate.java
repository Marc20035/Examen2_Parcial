package org.example;

public class Frigate extends Ship{
    public Frigate(Punto p1, Punto p2) {
        super(p1, p2);
        if (this.getSize() != 3) {
            System.out.println("Error, La Fragata debe de tener 3 de tamaño");
            throw new IllegalArgumentException("La Fragata debe de tener 3 de tamaño");
        }
    }
}
