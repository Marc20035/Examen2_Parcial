package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MostrarMain {
    public void mostrarJuego(){
        Scanner sc = new Scanner(System.in);
        int x1;
        int y1;
        int x2;
        int y2;
        ArrayList<Ship> shipsUser1 = new ArrayList<>();
        boolean romper = false;
        System.out.println("Bienvenido al juego de Batalla Naval");
        System.out.println("User 1 Introduce tu nombre: ");
        String nombre1 = sc.nextLine();
        System.out.println("User 2 Introduce tu nombre: ");
        String nombre2 = sc.nextLine();
        System.out.println( nombre1 + " Introduce Tu configuracion de barcos");
        System.out.println("Introduce los puntos de la Canoa: ");
        System.out.println("(Recordatorio: La Canoa solo ocupa 1 espacio)");
        System.out.println("Donde deseas Colocarla?: ");
        do {
            try {
                System.out.println("Introduce la coordenada X: ");
                x1 = sc.nextInt();
                System.out.println("Introduce la coordenada Y: ");
                y1 = sc.nextInt();
                x2 = x1;
                y2 = y1;
                Punto p1 = new Punto(x1, y1);
                Punto p2 = new Punto(x2, y2);
                if (p1.getX()<25&&p1.getY()<25&&p2.getX()<25&&p2.getY()<25&&p1.getX()>=0&&p1.getY()>=0&&p2.getX()>=0&&p2.getY()>=0){
                    Canoe canoeUser1 = new Canoe(p1, p2);
                    shipsUser1.add(canoeUser1);
                    System.out.println("Canoa Colocada");
                    romper = true;
                }else{
                    System.out.println("Error, Introduce numeros entre 0 y 25 (Las Coordenadas que me has introducido \n no estan en el tablero de juego)");
                }

            }catch (Exception e){
                System.out.println("Error, Introduce un numero");
            }
        }while (!romper);
        romper = false;
        do {
            try {
                System.out.println("Introduce los puntos de la Fragata: ");
                System.out.println("(Recordatorio: La Fragata solo ocupa 3 espacios)");
                System.out.println("Introduce el punto 1: ");
                System.out.println("Introduce la coordenada X: ");
                x1 = sc.nextInt();
                System.out.println("Introduce la coordenada Y: ");
                y1 = sc.nextInt();
                System.out.println("Introduce el punto 2: ");
                System.out.println("Introduce la coordenada X: ");
                x2 = sc.nextInt();
                System.out.println("Introduce la coordenada Y: ");
                y2 = sc.nextInt();
                Punto p3 = new Punto(x1, y1);
                Punto p4 = new Punto(x2, y2);
                Frigate frigateUser1 = new Frigate(p3, p4);
                if (frigateUser1.getSize()==3){
                    shipsUser1.add(frigateUser1);
                    romper = true;
                }else {
                    System.out.println("Error, La Fragata solo ocupa 3 espacios");
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Error, Introduce un numero");
            }
        }while (!romper);
        System.out.println("Fragata Colocada");
        System.out.println("Introduce los puntos del Battleship: ");
        System.out.println("(Recordatorio): El Battleship solo ocupa 5 espacios)");
        System.out.println("Introduce el punto 1: ");
        System.out.println("Introduce la coordenada X: ");
        x1 = sc.nextInt();
        System.out.println("Introduce la coordenada Y: ");
        y1 = sc.nextInt();
        System.out.println("Introduce el punto 2: ");
        System.out.println("Introduce la coordenada X: ");
        x2 = sc.nextInt();
        System.out.println("Introduce la coordenada Y: ");
        y2 = sc.nextInt();
        Punto p5 = new Punto(x1,y1);
        Punto p6 = new Punto(x2,y2);
        Battleship battleshipUser1 = new Battleship(p5,p6);
        System.out.println("Battleship Colocado");
        shipsUser1.add(battleshipUser1);


        System.out.println(nombre2+ " Introduce Tu configuracion de barcos: ");
        System.out.println("Introduce los puntos de la Canoa: ");
        System.out.println("(Recordatorio: La Canoa solo ocupa 1 espacio)");
        System.out.println("Introduce el punto: ");
        System.out.println("Introduce la coordenada X: ");
        x1 = sc.nextInt();
        System.out.println("Introduce la coordenada Y: ");
        y1 = sc.nextInt();
        x2 = x1;
        y2 = y1;
        System.out.println("Canoa Colocada");
        Punto p7 = new Punto(x1,y1);
        Punto p8 = new Punto(x2,y2);
        Canoe canoeUser2 = new Canoe(p7,p8);
        System.out.println("Introduce los puntos de la Fragata: ");
        System.out.println("(Recordatorio: La Fragata solo ocupa 3 espacios)");
        System.out.println("Introduce el punto 1: ");
        System.out.println("Introduce la coordenada X: ");
        x1 = sc.nextInt();
        System.out.println("Introduce la coordenada Y: ");
        y1 = sc.nextInt();
        System.out.println("Introduce el punto 2: ");
        System.out.println("Introduce la coordenada X: ");
        x2 = sc.nextInt();
        System.out.println("Introduce la coordenada Y: ");
        y2 = sc.nextInt();
        Punto p9 = new Punto(x1,y1);
        Punto p10 = new Punto(x2,y2);
        Frigate frigateUser2 = new Frigate(p9,p10);
        System.out.println("Fragata Colocada");
        System.out.println("Introduce los puntos del Battleship: ");
        System.out.println("(Recordatorio): El Battleship solo ocupa 5 espacios)");
        System.out.println("Introduce el punto 1: ");
        System.out.println("Introduce la coordenada X: ");
        x1 = sc.nextInt();
        System.out.println("Introduce la coordenada Y: ");
        y1 = sc.nextInt();
        System.out.println("Introduce el punto 2: ");
        System.out.println("Introduce la coordenada X: ");
        x2 = sc.nextInt();
        System.out.println("Introduce la coordenada Y: ");
        y2 = sc.nextInt();
        Punto p11 = new Punto(x1,y1);
        Punto p12 = new Punto(x2,y2);
        Battleship battleshipUser2 = new Battleship(p11,p12);
        System.out.println("Battleship Colocado");
        ArrayList<Ship> shipsUser2 = new ArrayList<>();
        shipsUser2.add(canoeUser2);
        shipsUser2.add(frigateUser2);
        shipsUser2.add(battleshipUser2);
        try {
            User user2 = new User(shipsUser2, nombre2);
            User user1 = new User(shipsUser1, nombre1);
            while (user1.getAlive()||user2.getAlive()) {
                System.out.println("Turno de atacar de " + nombre1);
                x1 = (int) Math.random() * 10;
                y1 = (int) Math.random() * 10;
                Punto p13 = new Punto(x1, y1);
                user1.attack(p13, user2);
                System.out.println("Turno de atacar de " + nombre2);

                x1 = (int) Math.random() * 10;
                y1 = (int) Math.random() * 10;
                Punto p15 = new Punto(x1, y1);
                user2.attack(p15, user1);

            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
