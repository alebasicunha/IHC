package com.example.bela.ihc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class Activity2 extends Activity {

    ListView lista1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        lista1 = (ListView) findViewById(R.id.lista1);

        ArrayList<Comodos> nomeComodos = adicionaComodos(); //adicionando itens na lista

        //definindo contexto, formato da lista e itens
        ArrayAdapter<Comodos> arrayAdapter = new ArrayAdapter<Comodos>(this, android.R.layout.simple_list_item_1, nomeComodos);
        lista1.setAdapter(arrayAdapter);

        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(Activity2.this, Activity5.class);
                Intent intent2 = new Intent(Activity2.this, Activity7.class);
                switch (position){
                    case 0: startActivity(intent1);
                            break;
                    case 1: startActivity(intent1);
                        break;
                    case 2: startActivity(intent1);
                        break;
                    case 3: startActivity(intent1);
                        break;
                    case 4: startActivity(intent2);
                        break;
                    case 5: startActivity(intent2);
                        break;
                    case 6: startActivity(intent2);
                        break;
                    case 7: startActivity(intent2);
                        break;
                }
            }
        });
    }

    private ArrayList<Comodos> adicionaComodos(){

        ArrayList<Comodos> nome = new ArrayList<Comodos>();

        nome.add(new Comodos("Sala de TV"));
        nome.add(new Comodos("Sala de Jantar"));
        nome.add(new Comodos("Quarto - Suíte"));
        nome.add(new Comodos("Quarto"));
        nome.add(new Comodos("Cozinha"));
        nome.add(new Comodos("Banheiro - Suíte"));
        nome.add(new Comodos("Banheiro"));
        nome.add(new Comodos("Lavanderia"));

        return nome;
    }
}
