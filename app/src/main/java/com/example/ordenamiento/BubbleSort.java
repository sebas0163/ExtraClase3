package com.example.ordenamiento;
public class BubbleSort {
    
    int swaps=0;
    int comp=0;
    
    /**
    * obtenido de 
    * https://stackoverflow.com/questions/16088994/sorting-an-array-of-int-using-bubblesort
    * @param 
    * 
    */
    public int[] bubbleSort(int[] numArray) {
        
    int n = numArray.length;
    int temp = 0;
//    int swaps=0;
//    int comp=0;    

    for (int i = 0; i < n; i++) {
        comp++;
        for (int j = 1; j < (n - i); j++) { 
            comp++;
            if (numArray[j - 1] > numArray[j]) {                
                swaps++;
                temp = numArray[j - 1];
                numArray[j - 1] = numArray[j];
                numArray[j] = temp;
            }

        }
    }
    return numArray;
    }

    public void printArray(int[] x) {
      for(int i=0; i<x.length; i++){
        System.out.print(x[i] + " ");
      }
      System.out.print("Se realizaron "+ swaps+" swaps");
      System.out.print("Se realizaron "+ comp+" comparaciones");
   }
}
