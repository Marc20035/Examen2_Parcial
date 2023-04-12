package org.example;

public class Frigate extends Ship{
    public Frigate(Punto p1, Punto p2) {
        super(p1, p2);
    }
    public boolean comprobarsize(){
        if (this.getSize() != 3) {
            return true;
        }else{
            return false;
        }
    }
}
