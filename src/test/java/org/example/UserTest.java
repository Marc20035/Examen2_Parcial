package org.example;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void attack() {
        Ship ship = new Ship(new Punto(1,1), new Punto(1,2), 2);
        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(ship);
        try {
            User user = new User(ships);
            user.attack(new Punto(1,1),user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getShot() {
        Ship ship = new Ship(new Punto(1,1), new Punto(1,2), 2);
        Punto point = new Punto(1,3);
        ship.getShot(point);
    }

    @Test
    void isAlive() {

    }

    @Test
    void die() {
    }
}