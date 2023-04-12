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
        ArrayList<Ship> shipsUser2 = new ArrayList<>();
        boolean romper = false;
        System.out.println("Bienvenido al juego de Batalla Naval \n" +
                "Cuentas con un 5x5 de tablero, es decir, 25 espacios \n" +
                "Un tablero como el siguiente: \n" +
                "0 1 2 3 4 5 \n" +
                "1 - - - - - \n" +
                "2 - - - - - \n" +
                "3 - - - - - \n" +
                "4 - - - - - \n" +
                "5 - - - - - \n" +
                "Cada jugador tiene 3 barcos: Canoa, Fragata y Battleship \n" +
                "La Canoa ocupa 1 espacio, la Fragata 3 y el Battleship 5 \n" +
                "El objetivo es hundir todos los barcos del rival \n" +
                "Para atacar, introduce las coordenadas X y Y \n" +
                "Si el rival te ha tocado, te lo indicara \n" +
                "Si el rival te ha hundido, te lo indicara \n" +
                "Si destruyes todos los barcos del rival, ganaras \n" +
                "Si te hunden todos los barcos, perderas\n" +
                "QUE COMIENZE EL JUEGO");

        System.out.println("User 1 Introduce tu nombre: ");
        String nombre1 = sc.nextLine();
        System.out.println("User 2 Introduce tu nombre: ");
        String nombre2 = sc.nextLine();
        System.out.println( nombre1 + " Introduce Tu configuracion de barcos");
        System.out.println("Introduce los puntos de la Canoa: ");
        System.out.println("(Recordatorio: La Canoa solo ocupa 1 espacio)");
        System.out.println("Donde deseas Colocarla?: ");
        //CANOA USER1
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
        //FRAGATA USER1
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
                if (p3.getX()<25&&p3.getY()<25&&p4.getX()<25&&p4.getY()<25&&p3.getX()>=0&&p3.getY()>=0&&p4.getX()>=0&&p4.getY()>=0) {
                    Frigate frigateUser1 = new Frigate(p3, p4);
                    if (frigateUser1.comprobarsize()) {
                        System.out.println("Error, Controlado");
                    } else {
                        shipsUser1.add(frigateUser1);
                        System.out.println("Fragata Colocada");
                        romper = true;
                    }
                }else{
                    System.out.println("Error, Introduce numeros entre 0 y 25 (Las Coordenadas que me has introducido \n no estan en el tablero de juego)");
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Error, Introduce un numero");
            }
        }while (!romper);
        romper = false;
        //BATTLESHIP USER1
        do {
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
            Punto p5 = new Punto(x1, y1);
            Punto p6 = new Punto(x2, y2);
            if (p5.getX()<25&&p5.getY()<25&&p6.getX()<25&&p6.getY()<25&&p5.getX()>=0&&p5.getY()>=0&&p6.getX()>=0&&p6.getY()>=0) {
                Battleship battleshipUser1 = new Battleship(p5, p6);
                if (battleshipUser1.comprobarSize()) {
                    System.out.println("Error, Controlado");
                } else {
                    shipsUser1.add(battleshipUser1);
                    System.out.println("Battleship Colocado");
                    romper = true;
                }
            }else{
                System.out.println("Error, Introduce numeros entre 0 y 25 (Las Coordenadas que me has introducido \n no estan en el tablero de juego)");
            }
        }while (!romper);

        romper = false;
        System.out.println(nombre2 + " Introduce Tu configuracion de barcos: ");
        System.out.println("Introduce los puntos de la Canoa: ");
        System.out.println("(Recordatorio: La Canoa solo ocupa 1 espacio)");
        System.out.println("Donde desea Colocarla: ");
        //CANOA USER2
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
                    Canoe canoeUser2 = new Canoe(p1, p2);
                    shipsUser2.add(canoeUser2);
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
        //FRAGATA USER2
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
                if (p3.getX()<25&&p3.getY()<25&&p4.getX()<25&&p4.getY()<25&&p3.getX()>=0&&p3.getY()>=0&&p4.getX()>=0&&p4.getY()>=0) {
                    Frigate frigateUser2 = new Frigate(p3, p4);
                    if (frigateUser2.comprobarsize()) {
                        System.out.println("Error, Controlado");
                    } else {
                        shipsUser2.add(frigateUser2);
                        System.out.println("Fragata Colocada");
                        romper = true;
                    }
                }else{
                    System.out.println("Error, Introduce numeros entre 0 y 25 (Las Coordenadas que me has introducido \n no estan en el tablero de juego)");
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Error, Introduce un numero");
            }
        }while (!romper);
        romper = false;
        //BATTLESHIP USER2
        do {
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
            Punto p5 = new Punto(x1, y1);
            Punto p6 = new Punto(x2, y2);
            if (p5.getX()<25&&p5.getY()<25&&p6.getX()<25&&p6.getY()<25&&p5.getX()>=0&&p5.getY()>=0&&p6.getX()>=0&&p6.getY()>=0) {
                Battleship battleshipUser2 = new Battleship(p5, p6);
                if (battleshipUser2.comprobarSize()) {
                    System.out.println("Error, Controlado");
                } else {
                    shipsUser2.add(battleshipUser2);
                    System.out.println("Battleship Colocado");
                    romper = true;
                }
            }else{
                System.out.println("Error, Introduce numeros entre 0 y 25 (Las Coordenadas que me has introducido \n no estan en el tablero de juego)");
            }
        }while (!romper);

        try {
            User user2 = new User(shipsUser2, nombre2);
            User user1 = new User(shipsUser1, nombre1);
            while (user1.getAlive()== true ||user2.getAlive() == true) {
                System.out.println("Es tu turno de ataque " + nombre1);
                x1 = (int) Math.random() * 10;
                y1 = (int) Math.random() * 10;
                Punto p13 = new Punto(x1, y1);
                user1.attack(p13, user2);
                System.out.println("Es tu turno de ataque " + nombre2);

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
