/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

/**
 *
 * @author Tuf F15
 */
public class Main {

    public static void main(String[] args) {
        int[][][] tabla = new int[10][10][10];

        for (int i = 0; i < 10; i++) {
            tabla[i][i][i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(tabla[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

