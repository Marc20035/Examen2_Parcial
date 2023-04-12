package org.example;

import java.awt.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @Test
    void isSunk() {
        Ship ship = new Ship(new Punto(1,1), new Punto(1,2));
        ship.setToques(2);
        ship.isSunk();
    }

    @Test
    void getShot() {
        Ship ship = new Ship(new Punto(1,1), new Punto(1,2));
        Punto punto = new Punto(1,1);
        ship.getShot(punto);
    }
    @Test
    void probando(){
        Canoe canoe = new Canoe(new Punto(1,1), new Punto(1,1));
        Battleship battleship = new Battleship(new Punto(1,1), new Punto(5,1));
        assertEquals(1,canoe.getSize());
        assertEquals(5,battleship.getSize());
    }
}