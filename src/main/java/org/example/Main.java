package org.example;

public class Main {
    public static void main(String[] args) {
        MostrarMain mostrar = new MostrarMain();
        try {
            mostrar.mostrarJuego();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}