/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodul02;

/**
 *
 * @author user
 */
public class nomor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [][] A ={
            
            {2, 3, 4},
            {4, 3, 2}
        };
        int [][] B ={
            {3, 2},
            {5, 6},
            {4, 2}
        };
        
        if (A[0].length == B.length){
            int [][] C = new int [A.length][B[0].length];
            for (int i=0; i<A.length; i++){
                for (int j=0; j<B[0].length; j++){
                    for (int k=0; k<A[0].length; k++){
                        C[i][j] = A[i][k] * B[k][j];
                    }
                }
            }
            for (int[] c:C){
                for (int i:c){
                    System.out.print(i+ " ");
                }
            System.out.println();
        }
    }
        else{
            System.out.println("Ukuran kolom A tidak sama dengan baris B");
    
                    }
                }
            }