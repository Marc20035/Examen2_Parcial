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

}
