/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controller.CasaController;

public class Ejecutor {

    public static void main(String[] args) {
        CasaController c = new CasaController();

        String color = "Gris";
        Float ancho = 12.50f;
        Float largo = 8.75f;
        int num_pisos = 1;
        if (c.guardar_casa(color, ancho, largo, num_pisos)) {
            System.out.println("Se ha guardado correctamente");
        } else {
            System.out.println("Se ha detectado un herror");
        }
    }
}

