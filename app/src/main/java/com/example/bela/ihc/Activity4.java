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

public class Activity4 extends Activity {

    ListView lista4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        lista4 = (ListView) findViewById(R.id.lista4);

        ArrayList<String> nomeDispositivos = adicionaOpcao(); //adicionando itens na lista

        //definindo contexto, formato da lista e itens
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomeDispositivos);
        lista4.setAdapter(arrayAdapter);

        lista4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(Activity4.this, Login.class);
                switch (position){

                    case 3: startActivity(intent1); finish(); break;
                }

            }
        });
    }

    private ArrayList<String> adicionaOpcao(){

        ArrayList<String> nome = new ArrayList<String>();

        nome.add("Configurações");
        nome.add("Editar Dispositivos");
        nome.add("Editar Cômodos");
        nome.add("Sair");

        return nome;
    }
}
