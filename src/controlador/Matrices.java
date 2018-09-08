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
import vista.FrmArreglos;
public class Matrices {
    
     int mat[][];
     int n;
     int vec[];
     Vectores v= new Vectores();
     FrmArreglos Fr=new FrmArreglos();

    public int[][] getMat() {
        return mat;
    }

    public void setMat(int[][] mat) {
        this.mat = mat;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void sumarColumnas()
    {
       int sumCol;
          for (int j = 0; j < 1; j++) {
              sumCol=0;
            for (int i = 0; i<n; i++) {
                
                sumCol=sumCol+mat[i][j];
            }
            vec[j]=sumCol;
        }
          
        
          
        
        
        }

    public int[] getVec() {
        return vec;
    }

    public void setVec(int[] vec) {
        this.vec = vec;
    }
    
    
}
