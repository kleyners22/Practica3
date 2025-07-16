/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Random;

public class LaberintoController {

    private int[][] matrix;

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] generarMatriz(int filas, int columnas) {

        int[][] laberinto = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            laberinto[i][0] = 1;

            laberinto[i][columnas - 1] = 1;
        }

        for (int j = 0; j < columnas; j++) {
            laberinto[0][j] = 1;
            laberinto[filas - 1][j] = 1;
        }

        for (int i = 1; i < filas - 1; i++) {
            for (int j = 1; j < columnas - 1; j++) {
                float randomValue = random.nextFloat();
                laberinto[i][j] = randomValue < 0.35 ? 1 : 0;
            }
        }
        laberinto[0][1] = 0;
        laberinto[1][1] = 0;
        laberinto[filas - 1][columnas - 2] = 0;
        laberinto[filas - 2][columnas - 2] = 0;
        this.matrix = laberinto;
 
        return laberinto;
    }
}


