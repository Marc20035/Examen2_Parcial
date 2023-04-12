package org.example;

import java.awt.*;

public class Ship {
       private Punto puntoFinal;
       private Punto puntoInicial;
       private int size;
       public CardinalPoints orientation;
       private int toques;
       private boolean hundido;
       public Ship(Punto p1, Punto p2) {
              this.size = Math.max(Math.abs(p2.getX() - p1.getX()), Math.abs(p2.getY() - p1.getY())) + 1;
              this.puntoInicial = p1;
              this.puntoFinal = p2;
              if (p1.getX() == p2.getX() && p1.getY() < p2.getY()){
                this.orientation = CardinalPoints.NORTH;
              }else if(p1.getX() < p2.getX() && p1.getY() == p2.getY()){
                this.orientation = CardinalPoints.EAST;
              } else if (p1.getX() == p2.getX() && p1.getY() > p2.getY()){
                this.orientation = CardinalPoints.SOUTH;
              } else if (p1.getX() > p2.getX() && p1.getY() == p2.getY()){
                this.orientation = CardinalPoints.WEST;
              }else if(p1.getX()!=p2.getX() && p1.getY()!=p2.getY()){
                  System.out.println("Error, El Barco debe de estar en una linea recta");
                  throw new IllegalArgumentException("El Barco debe de estar en una linea recta");
              }
              this.toques = 0;

              this.hundido = false;

       }



    public int getSize() {
        return size;
    }

    public Punto getPuntoFinal() {

        return puntoFinal;
    }

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public Punto getPuntoInicial() {
        return puntoInicial;
    }

    public void setPuntoInicial(Punto puntoInicial) {
        this.puntoInicial = puntoInicial;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public CardinalPoints getOrientation() {
        return orientation;
    }

    public void setOrientation(CardinalPoints orientation) {
        this.orientation = orientation;
    }


    public int getToques() {
        return toques;
    }

    public void setToques(int toques) {
        this.toques = toques;
    }

    public boolean isHundido() {
        return hundido;
    }

    public void setHundido(boolean hundido) {
        this.hundido = hundido;
    }
    public boolean isSunk(){
           if (this.toques == this.size){
               setHundido(true);
                return true;
           }
           return false;
    }
    public boolean getShot(Punto ShotPoint){
        if (this.orientation == CardinalPoints.NORTH){
            if (ShotPoint.getX() == this.puntoInicial.getX() && ShotPoint.getY() >= this.puntoInicial.getY() && ShotPoint.getY() <= this.puntoFinal.getY()){
                this.toques++;
                System.out.println("Toque");
                return true;
            }
        }else if (this.orientation == CardinalPoints.EAST){
            if (ShotPoint.getY() == this.puntoInicial.getY() && ShotPoint.getX() >= this.puntoInicial.getX() && ShotPoint.getX() <= this.puntoFinal.getX()){
                this.toques++;
                System.out.println("Toque");
                return true;
            }
        }else if (this.orientation == CardinalPoints.SOUTH){
            if (ShotPoint.getX() == this.puntoInicial.getX() && ShotPoint.getY() <= this.puntoInicial.getY() && ShotPoint.getY() >= this.puntoFinal.getY()){
                this.toques++;
                System.out.println("Toque");
                return true;
            }
        }else if (this.orientation == CardinalPoints.WEST){
            if (ShotPoint.getY() == this.puntoInicial.getY() && ShotPoint.getX() <= this.puntoInicial.getX() && ShotPoint.getX() >= this.puntoFinal.getX()){
                this.toques++;
                System.out.println("Toque");
                return true;
            }
        }
        return false;
    }

}
