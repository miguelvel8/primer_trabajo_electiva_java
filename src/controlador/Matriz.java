/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author salan403
 */

public class Matriz {

    int matriz[][];
    int numeroColumnasFilas;
    Vector vec = new Vector();

    public Matriz(int[][] mat) {
        this.matriz = mat;
        this.numeroColumnasFilas = this.matriz.length;

    }
    public Matriz() {

    }

    public int[][] getMattriz() {
        return this.matriz;
    }

    public void setMat(int[][] mat) {
        this.matriz = mat;
        this.numeroColumnasFilas=mat.length;
    }

    public int getN() {
        return this.numeroColumnasFilas;
    }

    public void setN(int n) {
        this.numeroColumnasFilas = n;
    }

    public int [] sumarColumnas() {

        int [] vectorSumarColumnas = new int[this.numeroColumnasFilas];
        int sumaCol=0;
        for (int j = 0; j < this.numeroColumnasFilas; j++) {
            sumaCol = 0;
            for (int i = 0; i < this.numeroColumnasFilas; i++) {

                sumaCol = sumaCol + this.matriz[i][j];
            }
            vectorSumarColumnas[j] = sumaCol;
        }
        vec.setVec(vectorSumarColumnas);
        vec.ordenarVectorBurbuja();
        return vec.getVec();
        

    }


}
