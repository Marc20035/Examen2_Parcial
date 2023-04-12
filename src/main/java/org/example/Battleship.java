package org.example;

import java.awt.*;

public class Battleship extends Ship{
    public Battleship(Punto p1, Punto p2) {
        super(p1, p2);
    }
    public boolean comprobarSize(){
        if (this.getSize() != 5) {
            System.out.println("Error, El Battleship debe de tener 5 de tamaño");
            return true;
        }else {
            return false;
        }
    }
}
