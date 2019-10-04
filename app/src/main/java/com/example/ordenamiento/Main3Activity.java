package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    private int swaps=0;
    private int comp=0;
    private DoubleEndedLinkedList<Integer> lista = MainActivity.lista;
    private int[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        array = convertirArray();
        bubbleSort(array);
    }
    public int[] bubbleSort(int[] numArray) {

        int n = numArray.length;
        int temp = 0;
        int itera=0;
//    int swaps=0;
//    int comp=0;

        for (int i = 0; i < n; i++) {
            itera++;
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
            mostrarIteraciones(numArray,itera,swaps,comp);
        }
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
