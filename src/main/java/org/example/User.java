package org.example;

import java.util.ArrayList;

public class User {
    private ArrayList<Ship> ships;
    private boolean isAlive;

    public User(ArrayList<Ship> ships) throws Exception{
        if(ships.size() > 0 && ships.size() <= 3){
            this.ships = ships;
        }else {
            throw new Exception("El usuario debe tener entre 1 y 3 barcos");
        }
        this.isAlive = true;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips(ArrayList<Ship> ships) {
        this.ships = ships;
    }

    public boolean getAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
    public void attack(Punto shotPoint,User user)throws Exception {
        if (shotPoint == null || user == null) {
            throw new Exception("El punto o el usuario no pueden ser nulos");
        } else {
            if (isAlive) {
                for (Ship ship : user.getShips()) {
                    if (ship.isSunk()) {
                        ship.getShot(shotPoint);
                        System.out.println("Barco Tocado,('Repito') Barco TOCADO");
                        if (!ship.isSunk()) {
                            System.out.println("El barco ha sido hundido");
                        }
                    }
                }
            } else {
                throw new Exception("El User esta Eliminado");
            }

        }
    }
    public void getShot(Punto shotPoint){
        for (Ship ship : this.getShips()) {
            if(!ship.isSunk()){
                ship.getShot(shotPoint);
                System.out.println("El barco ha sido tocado");
                if(ship.isSunk()) {
                    System.out.println("El barco ha sido hundido");
                }
            }else {
                System.out.println("El barco ya esta hundido");
            }
        }
    }
    public void isAlive(){
        if(isAlive){
            System.out.println("El User esta vivo");
        }else {
            System.out.println("El User esta Eliminado");
        }
    }
    public void die(){
        if (isAlive){
            isAlive = false;
            System.out.println("El User ha sido eliminado");
        }else {
            System.out.println("El User ya esta Eliminado");
        }
    }
}

