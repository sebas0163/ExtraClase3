
package com.example.ordenamiento;


public class InsertionSort {
    int swaps;
    int comp;
    public InsertionSort(){
        swaps=0;
        comp=0;
    }
    /**
    *tomado de 
    * https://www.geeksforgeeks.org/insertion-sort/
    */
    public int[] insert(int[] numArray){ 
        int n = numArray.length; 
        for (int i = 1; i < n; ++i) {
            comp++;
            int key = numArray[i]; 
            int j = i - 1;             
            while (j >= 0 && numArray[j] > key) { 
                comp++;
                numArray[j + 1] = numArray[j]; 
                swaps++;
                j = j - 1; 
            }             
            numArray[j + 1] = key; 
        }
    comp--;
    return numArray;
    } 
    public void printArray(int[] x) {
      for(int i=0; i<x.length; i++){
        System.out.print(x[i] + " ");
      }
      System.out.print("Se realizaron "+swaps+" swaps");
      System.out.print("Se realizaron "+comp+" comparaciones");
   }
}
