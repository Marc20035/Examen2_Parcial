package org.example;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Ship> ships;
    private boolean isAlive;
    private int vidas;
    private int contador = 0;

    public User(ArrayList<Ship> ships,String nombre) throws Exception{
        if(ships.size() > 0 && ships.size() <= 3){
            this.ships = ships;
        }else {
            System.out.println("Error, El numero de barcos debe de ser entre 1 y 3");
        }
        this.isAlive = true;
        this.name = nombre;
        this.vidas = 3;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
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
            if (user.getVidas() > 0) {
                for (Ship ship : user.getShips()) {
                    if (!ship.isSunk()) {
                        ship.getShot(shotPoint);
                        if (ship.isSunk()) {
                            System.out.println("BARCO HUNDIDO \n" +
                                    "------------------------ \n" );
                            user.setVidas(user.getVidas() - 1);
                            contador ++;
                        }
                    }
                }
                System.out.println("------------------------ \n" +
                        "INFORMACION DE ESTADO: \n" +
                        "LLevas " + contador + " barcos hundidos \n" +
                        "Al rival le quedan " + user.getVidas() + " vidas \n" +
                        "------------------------");

            } else {
                setAlive(false);
            }
        }
    }
    public void tiroFallado(Punto shotPoint){
        for (Ship ship : this.getShips()) {
            if(!ship.getShot(shotPoint)){
                System.out.println("El tiro ha fallado");
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
                System.out.println("El barco:"+ship+" ya esta hundido");
            }
        }
    }
    public boolean isAlive(){
        if(isAlive){
            return true;
        }else {
            return false;
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

