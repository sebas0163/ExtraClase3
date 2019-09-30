package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
    }
    public void reset(View view){
        lista = new DoubleEndedLinkedList<>();
    }

}
