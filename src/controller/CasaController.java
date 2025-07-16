/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.utiles.Utilidades;

public class CasaController {

    private Utilidades u = new Utilidades();
    private String file_name = "casa.dat";

    public boolean guardar_casa(String color, Float ancho, Float largo, int num_pisos) {

        String data = generar_invetario() + "\t" + color + "\t" + ancho + "\t" + largo + "\t" + num_pisos + "\n";
        try {
            u.save(data, file_name);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public String[][] listar() {
        try {
            return u.listAll(file_name);
        } catch (Exception e) {
            System.out.println("Error en listar " + e);
            return null;
        }

    }

    public String generar_invetario() {

        String inv = "";
        String[][] listado = listar();
        if (listado != null) {
            Integer num = 0;
            num = listado.length + 1;
            inv = "000000";
            inv = inv.substring(num.toString().length());
            inv += num.toString();

        } else {
            inv = "000001";
        }
        return inv;
    }

    public String[][] obtenerTodasLasCasas() {
        return listar();
    }

    public boolean esHomofina(int i1, int i2) {
        String[][] casas = listar();
        for (int c = 2; c < 5; c++) {
            if (!casas[i1][c].equals(casas[i2][c])) {
                return false;
            }
        }
        return true;
    }

}
