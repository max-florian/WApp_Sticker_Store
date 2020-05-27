package com.example.wapp_sticker_store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView card_apex = (CardView) findViewById(R.id.cv_apex); // creating a CardView and assigning a value.

        card_apex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "prueba APEX", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
