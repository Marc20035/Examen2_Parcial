package org.example;

import java.awt.*;

public class Battleship extends Ship{
    public Battleship(Punto p1, Punto p2) {
        super(p1, p2);
        if(this.getSize()!=5){
            System.out.println("Error, El Battleship debe de tener 5 de tamaño");
            throw new IllegalArgumentException("El BattleShip debe de tener 5 de tamaño");
        }
    }
}
