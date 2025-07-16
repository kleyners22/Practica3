/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.tables;

import controller.LaberintoController;
import javax.swing.table.AbstractTableModel;


public class ModeloTablaLaberinto extends AbstractTableModel {
    private int[][] data;
    private LaberintoController laberintoController;

    public ModeloTablaLaberinto(LaberintoController controller) {
        this.data = null;
        this.laberintoController = controller;
    }
 
    @Override
    public int getRowCount() {
        return data != null ? data.length : 0;
    }

    @Override
    public int getColumnCount() {
        return data != null && data.length > 0 ? data[0].length : 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (data == null || rowIndex >= data.length || columnIndex >= data[0].length) {
            return null;
        }
        return data[rowIndex][columnIndex] == 1 ? "1" : "0";
    }

    @Override
    public String getColumnName(int column) {
        return ""; 
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; 
    }

    public void actualizarLaberinto(int filas, int columnas) {
        this.data = laberintoController.generarMatriz(filas, columnas);
        fireTableStructureChanged();
    }
  
}

