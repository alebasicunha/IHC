package com.example.bela.ihc;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class Activity6 extends Activity {

    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        switch1 = (Switch) findViewById(R.id.switch1);
        Boolean switchState = switch1.isChecked();

        switch1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                final Toast toast;
                if (switch1.isChecked()){
                    toast = Toast.makeText(getApplicationContext(),
                            "Ligado", Toast.LENGTH_LONG);
                    toast.show();

                    //não sei pq, mas isso reduz o tempo do toast
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 300);

                } else {
                    toast = Toast.makeText(getApplicationContext(),
                            "Desligado", Toast.LENGTH_LONG);
                    toast.show();

                    //não sei pq, mas isso reduz o tempo do toast 2
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            toast.cancel();
                        }
                    }, 300);

                }

            }
        });
    }
}
