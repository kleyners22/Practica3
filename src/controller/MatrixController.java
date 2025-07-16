
package controller;

import java.util.Random;

public class MatrixController {

    public Integer [][] matriz (Integer nfilas, Integer ncolumnas){
        Integer [][] matriz= new Integer [nfilas] [ncolumnas];
        Random r = new Random ();
        for (int i = 0; i < nfilas; i++){
            for (int j = 0 ; j < ncolumnas; j++){
                matriz [i][j] = r.nextInt(100);
            }
        }
        return matriz;
    }
    
    public String[][] eliminarNum(Integer[][] matriz, int numero) {
        String[][] nuevaMatriz = new String[matriz.length][matriz[0].length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {                
                if (matriz[i][j] != null && matriz[i][j] == numero) {
                matriz[i][j] = null; 
                nuevaMatriz[i][j] = "*";
                }else if (matriz[i][j] != null) {
                    nuevaMatriz[i][j] = String.valueOf(matriz[i][j]);
                } else {
                    nuevaMatriz[i][j] = "*";
                }
            }
        }
        return nuevaMatriz;
    }
    
    public String[][] eliminarPri(Integer[][] matriz) {
        String[][] nuevaMatriz = new String[matriz.length][matriz[0].length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                Integer val = matriz[i][j];
                if (val != null && esPrimo(val)) {
                    nuevaMatriz[i][j] = "*";
                }  else {
                nuevaMatriz[i][j] = (val != null) ? val.toString() : "*";
                }
            }
        }
        return nuevaMatriz;
    }
     
    private boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    public String[][] convertirMatriz(Integer[][] matriz) {
        String[][] result = new String[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                result[i][j] = (matriz[i][j] == null) ? "*" : matriz[i][j].toString();
            }
        }
        return result;
    }
}

