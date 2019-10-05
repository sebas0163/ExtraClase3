package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private int swaps=0;
    private int comp=0;
    private DoubleEndedLinkedList<Integer> lista = MainActivity.lista;
    private int[] array;
    private int iteraciones=5;
    private DoubleEndedLinkedList<String> listas=new DoubleEndedLinkedList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        array = convertirArray();
        listas.add("Iteraciones");
        select(array);
        listas.add(0,"Se realizaron: "+Integer.toString(swaps)+" Swaps");
        listas.add(1," ");
        listas.add(0,"Se realizaron: "+Integer.toString(comp)+" Comparaciones");
        listas.add(1," ");
        int cont=0;

        while(cont<iteraciones){
            LinearLayout scroll = (LinearLayout) this.findViewById(R.id.linearL);
            TextView tv1 = new TextView(this);
            tv1.setText(listas.getNodo(cont).getDato());
            scroll.addView(tv1);

            cont++;
        }
    }
    public void arrToStrin(int[] arr){
        iteraciones++;
        String cadena="[";
        int largo=array.length;
        for (int x=0;x<largo;x++){
            if (x==largo-1)
                cadena += Integer.toString(array[x])+"]";

            else
                cadena += Integer.toString(array[x])+"-";
        }
        listas.add(cadena);

    }
    public int[] select(int numArray[])
    {
        int n = numArray.length;
        arrToStrin(numArray);
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
            arrToStrin(array);

        }
        comp++;
        swaps--;
        return numArray;
    }
    
    private int[] convertirArray(){
        int[] listaAux = new int[lista.len()];
        for (int i =0; i<lista.len(); i++){
            listaAux[i]= lista.getInfo(i);
        }
        return listaAux;
    }
}
