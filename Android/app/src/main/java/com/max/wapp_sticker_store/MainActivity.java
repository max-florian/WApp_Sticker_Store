package com.max.wapp_sticker_store;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AlertDialog;
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

        SharedPreferences prefs = getSharedPreferences("prefs",MODE_PRIVATE);
        boolean AlInicio = prefs.getBoolean("AlInicio",true);
        if (AlInicio) {
            mostrarNotificacion();
        }

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

        CardView card_michis = (CardView) findViewById(R.id.cv_michis); // creating a CardView and assigning a value.

        card_michis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",3);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });

        CardView card_apex = (CardView) findViewById(R.id.cv_apex); // creating a CardView and assigning a value.

        card_apex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",4);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });

        CardView card_dj = (CardView) findViewById(R.id.cv_dj); // creating a CardView and assigning a value.

        card_dj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",5);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });

        CardView card_memes2 = (CardView) findViewById(R.id.cv_memes2); // creating a CardView and assigning a value.

        card_memes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",6);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });

        CardView card_michis2 = (CardView) findViewById(R.id.cv_michis2); // creating a CardView and assigning a value.

        card_michis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(MainActivity.this,EntryActivity.class);
                bundle.putInt("contpack",7);
                intent.putExtras(bundle);
                startActivity(intent);
                //finish();
            }
        });
    }

    private void mostrarNotificacion () {
        String mensaje = "En esta nueva versión de la tienda hemos agregado nuevos paquetes de stickers y, a su vez, eliminado otros." +"\n\n"
                + "Paquetes Agregados: " + "\n"
                + "- Apex Legends\n- Drake & Josh\n- Memes 2\n- Michis 2" +"\n\n"
                + "Paquetes Eliminados: " + "\n"
                + "- Lomitos 1";
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage(mensaje);
        builder.setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        final AlertDialog dialog = builder.create();
        dialog.show();
        SharedPreferences prefs = getSharedPreferences("prefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("AlInicio",false);
        editor.apply();
    }
}
