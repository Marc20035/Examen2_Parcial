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

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
    public void attack(Punto shotPoint,User user)throws Exception{
        if(this.isAlive){
            for (Ship ship : user.getShips()) {
                if(ship.isSunk()){
                    ship.getShot(shotPoint);
                }
            }
        }else{
            throw new Exception("El usuario ya ha sido hundido");
        }

    }
}

