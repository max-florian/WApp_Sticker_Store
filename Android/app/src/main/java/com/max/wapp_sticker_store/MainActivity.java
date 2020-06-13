package com.max.wapp_sticker_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        FloatingActionButton peticiones = findViewById(R.id.correo);
        peticiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aquien = "maxgt734@gmail.com";   //Se puede cambiar por el correo de la aplicacion
                String asunto = "Nueva Peticion de Stickers!";
                Intent newEmail = new Intent(Intent.ACTION_SEND);
                newEmail.putExtra(Intent.EXTRA_EMAIL,new String[]{aquien});
                newEmail.putExtra(Intent.EXTRA_SUBJECT,asunto);
                newEmail.setType("message/rfc622");
                startActivity(Intent.createChooser(newEmail,"Elige una aplicación para enviar la petición"));
            }
        });

        CardView card_memes = (CardView) findViewById(R.id.cv_memes); // creating a CardView and assigning a value.

        card_memes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "prueba APEX", Toast.LENGTH_SHORT).show();
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
                //Toast.makeText(MainActivity.this, "prueba SHREK", Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",1);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });

        CardView card_be = (CardView) findViewById(R.id.cv_be); // creating a CardView and assigning a value.

        card_be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "prueba SHREK", Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",2);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });

        CardView card_lomitos = (CardView) findViewById(R.id.cv_lomitos); // creating a CardView and assigning a value.

        card_lomitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "prueba SHREK", Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",3);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });

        CardView card_michis = (CardView) findViewById(R.id.cv_michis); // creating a CardView and assigning a value.

        card_michis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "prueba SHREK", Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",4);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });
    }
}
