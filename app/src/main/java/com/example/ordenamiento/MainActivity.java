package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    public static DoubleEndedLinkedList<Integer> lista;
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
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
    public void selection(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void Insertion(View view){
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
}
