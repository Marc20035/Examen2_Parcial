package org.example;

import java.awt.*;

public class Ship {
       private Punto p;
       private int size;
       private CardinalPoints orientation;
       private int toques;
       private boolean hundido;

       public Ship(Punto p, int size) {
           this.p = new Punto(0,0);
           this.size = size;
           if (p.getX()>0 && p.getY()>0){
               this.orientation = CardinalPoints.NORTH;
           }else if(p.getX()<0 && p.getY()>0){
               this.orientation = CardinalPoints.EAST;

           } else if (p.getX()<0 && p.getY()<0){
               this.orientation = CardinalPoints.SOUTH;

           } else if (p.getX()>0 && p.getY()<0){
               this.orientation = CardinalPoints.WEST;
           }
           if (this.toques >= this.size){
               this.hundido = true;
           }
       }

    public Punto getP() {
        return p;
    }

    public void setP(Punto p) {
        this.p = p;
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
}
