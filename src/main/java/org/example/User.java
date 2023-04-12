package org.example;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Ship> ships;
    private boolean isAlive;

    public User(ArrayList<Ship> ships,String nombre) throws Exception{
        if(ships.size() > 0 && ships.size() <= 3){
            this.ships = ships;
        }else {
            System.out.println("Error, El numero de barcos debe de ser entre 1 y 3");
        }
        this.isAlive = true;
        this.name = nombre;
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
                    if (!ship.isSunk()) {
                        ship.getShot(shotPoint);
                        if (ship.isSunk()) {
                            System.out.println("El barco ha sido hundido");
                        }
                    } else if (!ship.getShot(shotPoint)) {
                        System.out.println("Fallaste El Tiro");
                    }else {
                        System.out.println("El barco ya esta hundido");
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

