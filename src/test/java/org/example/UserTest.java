package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;



class UserTest {

    @Test
    void attack() {
        Frigate frigate = new Frigate(new Punto(1,1), new Punto(1,3));
        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(frigate);
        try {
            User user = new User(ships,"Pedro");
            user.attack(new Punto(1,1),user);
            user.attack(new Punto(1,2),user);
            user.attack(new Punto(1,3),user);
            user.attack(new Punto(1,4),user);
            user.attack(new Punto(1,5),user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void getShot() {
        Ship ship = new Ship(new Punto(1,1), new Punto(1,2));
        Punto point = new Punto(1,1);
        Punto point2 = new Punto(1,2);
        ship.getShot(point);
        ship.getShot(point2);
    }

    @Test
    void isAlive() {
        Ship ship = new Ship(new Punto(1,1), new Punto(1,2));
        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(ship);
        try {
            User user = new User(ships,"Luis");
            user.die();
            user.isAlive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    //En este test probamos tanto Alive como die
    }

    @Test
    void die() {
    }
}