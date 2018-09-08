/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author salan403
 */
public class Vectores {
    
    int vec[];
    int n;

    public int[] getVec() {
        return vec;
    }

    public void setVec(int[] vec) {
        this.vec = vec;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void ordenarVectorBurbuja(){
        int aux;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(vec[i]>vec[j]){
                    aux=vec[i];
                    vec[i]=vec[j];
                    vec[j]=aux;
                }
            }
        }
    }
}
