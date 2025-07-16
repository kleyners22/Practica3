/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.tables;

import controller.CasaController;
import javax.swing.table.AbstractTableModel;

public class ModeloTablaCasa extends AbstractTableModel {

    private String[][] data;
    private CasaController casaController;

    public ModeloTablaCasa() {
        this.casaController = new CasaController();
    }

    public String[][] getData() {
        return data;
    }

    public void  setData(String[][] data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {

        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return data[rowIndex][0];
            case 1:
                return data[rowIndex][1];
            case 2:
                return data[rowIndex][2];
            case 3:
                return data[rowIndex][3];
            case 4:
                return data[rowIndex][4];
            case 5:
                return esHomofinaConOtra(rowIndex) ? "Sí" : "No";

            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Inventario";
            case 1:
                return "Color";
            case 2:
                return "Largo";
            case 3:
                return "Ancho";
            case 4:
                return "Nr° Pisos";
            case 5:
                return "Homónimas";
            default:
                return null;
        }
    }

    private boolean esHomofinaConOtra(int rowIndex) {
        for (int i = 0; i < data.length; i++) {
            if (i != rowIndex && casaController.esHomofina(rowIndex, i)) {
                return true;
            }
        }
        return false;
    }
}

