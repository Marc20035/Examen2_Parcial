package org.example;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @org.junit.jupiter.api.Test
    void isSunk() {
        Ship ship = new Ship(new Punto(1,1), new Punto(1,2), 2);
        ship.setToques(2);
        ship.isSunk();
    }

    @org.junit.jupiter.api.Test
    void getShot() {
        Ship ship = new Ship(new Punto(1,1), new Punto(1,2), 2);
        Punto punto = new Punto(1,1);
        ship.getShot(punto);
    }
}