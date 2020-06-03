package com.example.wapp_sticker_store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
