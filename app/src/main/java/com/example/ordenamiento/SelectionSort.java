/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ordenamiento;

/**
 *
 * @author Erick
 */
public class SelectionSort {
    int comp;
    int swaps;
    public SelectionSort(){
        comp=0;
        swaps=0;
    }
    public int[] select(int numArray[]) 
    { 
        int n = numArray.length; 
  
        // One by one move boundary of unsorted subnumArrayay 
        for (int i = 0; i < n-1; i++) 
        { 
             
            int min_idx = i; 
            
            for (int j = i+1; j < n; j++)                
                if (numArray[j] < numArray[min_idx]){
                    min_idx = j; 
                    comp++;
                }
            comp++;
                   
            // Swap the found minimum element with the first 
            // element 
            int temp = numArray[min_idx]; 
            numArray[min_idx] = numArray[i]; 
            numArray[i] = temp; 
            swaps++;
        }
        comp++;
        swaps--;
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
