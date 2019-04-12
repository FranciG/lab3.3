package com.example.lab33;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class birds extends AppCompatActivity {

    TextView title;
    ImageView buho;
    ImageView pinzon;
    ImageView reyezuelo;
    ImageView camachuelo;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);
        title = findViewById(R.id.title);
        buho = findViewById(R.id.buho);
        pinzon = findViewById(R.id.pinzon);
        reyezuelo = findViewById(R.id.reyezuelo);
        camachuelo = findViewById(R.id.camachuelo);
       mediaPlayer  = new MediaPlayer();

       reyezuelo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               reyezueloSound();
           }
       });

       camachuelo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               camachueloSound();
           }
       });

       pinzon.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               pinzon();
           }
       });

       buho.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               buhoSound();
           }
       });
    }

    private void reyezueloSound() {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.peukaloinen_wren);
        mediaPlayer.start();
    }

    private void camachueloSound() {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch);
        mediaPlayer.start();
    }

    private void pinzon() {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.peippo_chaffinch);
        mediaPlayer.start();
    }

    private void buhoSound() {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.switch_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mamals:
                Intent screen1 = new Intent(birds.this, MainActivity.class);
                startActivity(screen1);
                return false;
            case R.id.birds:
                Intent screen2 = new Intent(birds.this, birds.class);
                startActivity(screen2);
                return false;


        }
        return super.onOptionsItemSelected(item);
    }




}
