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

public class Activity5 extends Activity {

    ListView lista2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        lista2 = (ListView) findViewById(R.id.lista2);

        ArrayList<String> nomeDispositivos = adicionaDispositivos(); //adicionando itens na lista

        //definindo contexto, formato da lista e itens
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomeDispositivos);
        lista2.setAdapter(arrayAdapter);

        lista2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(Activity5.this, Activity6.class);
                startActivity(intent1);
            }
        });
    }

    private ArrayList<String> adicionaDispositivos(){

        ArrayList<String> nome = new ArrayList<String>();

        nome.add("Lâmpada");
        nome.add("Ar Condicionado");
        nome.add("Televisão");

        return nome;
    }
}
