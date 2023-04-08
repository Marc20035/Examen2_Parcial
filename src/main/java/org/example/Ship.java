package org.example;

import java.awt.*;

public class Ship {
       private final Punto puntoDePartida = new Punto(0,0);
       private int size;
       public CardinalPoints orientation;
       private int toques;
       private boolean hundido;

       public Ship( Punto p,int size) {
           this.size = size;
           if (p.getX()>puntoDePartida.getX() && p.getY()> puntoDePartida.getY()){
               this.orientation = CardinalPoints.NORTH;
           }else if(p.getX()< puntoDePartida.getX() && p.getY()> puntoDePartida.getY()){
               this.orientation = CardinalPoints.EAST;

           } else if (p.getX()< puntoDePartida.getX() && p.getY()< puntoDePartida.getY()){
               this.orientation = CardinalPoints.SOUTH;

           } else if (p.getX()> puntoDePartida.getX() && p.getY()< puntoDePartida.getY()){
               this.orientation = CardinalPoints.WEST;
           }
       }

    public Punto getP() {
        return puntoDePartida;
    }

    public int getSize() {
        return size;
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
    public void isSunk(){
           if (this.toques == this.size){
               this.hundido = true;
           }
    }
    public void getShot(){
           this.toques++;
           isSunk();
    }

}
