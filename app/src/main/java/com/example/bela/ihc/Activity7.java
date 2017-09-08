package com.example.bela.ihc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity7 extends AppCompatActivity {

    ListView lista5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        lista5 = (ListView) findViewById(R.id.lista5);

        ArrayList<String> nomeDispositivos = adicionaDispositivos(); //adicionando itens na lista

        //definindo contexto, formato da lista e itens
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomeDispositivos);
        lista5.setAdapter(arrayAdapter);

        lista5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Activity7.this, Activity6.class);
                startActivity(intent);
                //finish();
            }
        });
    }

    private ArrayList<String> adicionaDispositivos(){

        ArrayList<String> nome = new ArrayList<String>();

        nome.add("Lâmpada");

        return nome;
    }
}
