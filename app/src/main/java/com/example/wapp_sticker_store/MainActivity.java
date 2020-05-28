package com.example.wapp_sticker_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",0);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });

        CardView card_shrek = (CardView) findViewById(R.id.cv_shrek); // creating a CardView and assigning a value.

        card_shrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "prueba SHREK", Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",1);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });

        CardView card_memes = (CardView) findViewById(R.id.cv_memes); // creating a CardView and assigning a value.

        card_memes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "prueba SHREK", Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",3);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });
    }
}
