package com.example.bela.ihc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity3 extends Activity {

    ListView lista3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        lista3 = (ListView) findViewById(R.id.lista3);

        ArrayList<String> nomeDispositivos = adicionaConsumo(); //adicionando itens na lista

        //definindo contexto, formato da lista e itens
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomeDispositivos);
        lista3.setAdapter(arrayAdapter);


        lista3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(Activity3.this, Activity9.class);
                Intent intent2 = new Intent(Activity3.this, Activity8.class);
                switch (position){
                    case 0: startActivity(intent1); break;
                    case 1: startActivity(intent2); break;
                }

            }
        });
    }

    private ArrayList<String> adicionaConsumo(){

        ArrayList<String> nome = new ArrayList<String>();

        nome.add("Elétrico");
        nome.add("Água");

        return nome;
    }
}
