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

    @Override
    public boolean getShot(Punto ShotPoint) {
        if (getCasillasImpactadas().contains(ShotPoint)) {
            System.out.println("Ya se ha atacado esa casilla\n" + "------------------------");
            return false;
        }

        getCasillasImpactadas().add(ShotPoint);

        boolean hit = super.getShot(ShotPoint);

        if (hit) {
            if (this.getToques() == this.getSize()) {
                this.setHundido(true);
                System.out.println("Battleship hundido\n" + "------------------------");
            }
        }
        return hit;
    }
}
