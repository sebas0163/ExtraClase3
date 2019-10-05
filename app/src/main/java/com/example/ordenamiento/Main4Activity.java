package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    private int swaps=0;
    private int comp=0;
    private DoubleEndedLinkedList<Integer> lista = MainActivity.lista;
    private int[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        array = convertirArray();
        insert(array);
        int cont=10;
        while(cont!=0){
        LinearLayout scroll = (LinearLayout) this.findViewById(R.id.linearL);
        TextView tv1 = new TextView(this);
        tv1.setText("hola");
        System.out.println(array[0]);
        scroll.addView(tv1);
        cont--;
        }
    }
    /**
     *tomado de
     * https://www.geeksforgeeks.org/insertion-sort/
     */
    public int[] insert(int[] numArray){
        int n = numArray.length;
        int itera = 0;
        for (int i = 1; i < n; ++i) {
            itera++;
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
            mostrarIteraciones(numArray,itera,swaps,comp);
        }
        comp--;
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
