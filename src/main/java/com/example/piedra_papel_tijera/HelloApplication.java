package com.example.piedra_papel_tijera;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class HelloApplication {
    public static void main(String[] args) {
        List<String[]> partidas = List.of(
                new String[]{"R", "S"},
                new String[]{"S", "R"},
                new String[]{"P", "S"}
        );

        String resultado = calcularGanador(partidas);
        System.out.println(resultado);
    }

    public static String calcularGanador(List<String[]> partidas) {
        int puntosPlayer1 = 0;
        int puntosPlayer2 = 0;

        for (String[] partida : partidas) {
            String jugada1 = partida[0];
            String jugada2 = partida[1];

            if (jugada1.equals(jugada2)) {
            } else if (
                    (jugada1.equals("R") && jugada2.equals("S")) ||
                            (jugada1.equals("P") && jugada2.equals("R")) ||
                            (jugada1.equals("S") && jugada2.equals("P"))
            ) {
                puntosPlayer1++;
            } else {
                puntosPlayer2++;
            }
        }

        if (puntosPlayer1 > puntosPlayer2) {
            return "Player 1";
        } else if (puntosPlayer2 > puntosPlayer1) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }
}
