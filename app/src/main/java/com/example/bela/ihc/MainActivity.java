package com.example.bela.ihc;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;


@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    TabHost tab1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab1 = (TabHost)findViewById(android.R.id.tabhost); //linkando a variavel tab1 ao botão da tabhost

        TabHost.TabSpec t1 = tab1.newTabSpec("aba1");
        TabHost.TabSpec t2 = tab1.newTabSpec("aba2");
        TabHost.TabSpec t3 = tab1.newTabSpec("aba3");

        t1.setIndicator("Cômodos");
        t1.setContent(new Intent(MainActivity.this, Activity2.class));

        t2.setIndicator("Consumo");
        t2.setContent(new Intent(MainActivity.this, Activity3.class));

        t3.setIndicator("Mais");
        t3.setContent(new Intent(MainActivity.this, Activity4.class));

        tab1.addTab(t1);
        tab1.addTab(t2);
        tab1.addTab(t3);
    }
}


