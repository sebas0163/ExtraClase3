package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
    private int swaps=0;
    private int comp=0;
    private DoubleEndedLinkedList<Integer> lista = MainActivity.lista;
    private int[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        array = convertirArray();
        select(array);
    }
    public int[] select(int numArray[])
    {
        int n = numArray.length;
        int itera = 0;
        // One by one move boundary of unsorted subnumArrayay
        for (int i = 0; i < n-1; i++)
        {
            itera++;
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
            mostrarIteraciones(numArray,itera,swaps,comp);
        }
        comp++;
        swaps--;
        return numArray;
    }
    private void mostrarIteraciones(int[] array,int iteracion,int swaps,int compara){
        return;
    }
    private int[] convertirArray(){
        int[] listaAux = new int[lista.len()];
        for (int i =0; i<lista.len(); i++){
            listaAux[i]= lista.getInfo(i);
        }
        return listaAux;
    }
}
