package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private DoubleEndedLinkedList<Integer> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.agragarText);
        lista = new DoubleEndedLinkedList<>();
    }
    public void agragarLista(View view){
        int num = Integer.parseInt(editText1.getText().toString());
        lista.add(num);
        lista.print();
        editText1.getText().clear();
        Toast.makeText(this,"Número añadido a la lista",Toast.LENGTH_SHORT).show();
    }
    public void reset(View view){
        lista = new DoubleEndedLinkedList<>();
        Toast.makeText(this,"La lista se ha reiniciado",Toast.LENGTH_SHORT).show();
    }
    public void bubble(View view){
        BubbleSort bubble = new BubbleSort();
        int[] array = convertirArray();
        bubble.bubbleSort(array);
        //borrar
        bubble.printArray(array);
        //for (int i=0; i<array.length;i++){
        //    System.out.println(array[i]);
        //}
    }
    public void selection(View view){
        SelectionSort selection = new SelectionSort();
        int[] array = convertirArray();
        selection.select(array);
        //borrar
        selection.printArray(array);

        //for (int i=0; i<array.length;i++) {
        //    System.out.println(array[i]);
        //}
    }
    public void Insertion(View view){
        InsertionSort insertion = new InsertionSort();
        int[] array = convertirArray();
        insertion.insert(array);
        //borrar
        insertion.printArray(array);

        //for (int i=0; i<array.length;i++) {
        //    System.out.println(array[i]);
        //}
    }
    private int[] convertirArray(){
        int[] listaAux = new int[lista.len()];
        for (int i =0; i<lista.len(); i++){
            listaAux[i]= lista.getInfo(i);
        }
        return listaAux;
    }
}
