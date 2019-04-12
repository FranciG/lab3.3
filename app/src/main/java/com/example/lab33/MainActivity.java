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

public class MainActivity extends AppCompatActivity {

TextView title;
    ImageView bear;
    ImageView ele;
    ImageView lamb;
    ImageView wolf;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.title);
        bear = findViewById(R.id.bear);
        ele = findViewById(R.id.ele);
        lamb = findViewById(R.id.lamb);
        wolf = findViewById(R.id.wolf);
        mediaPlayer = new MediaPlayer();

        lamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lambSound();
            }
        });

        ele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eleSound();
            }
        });



        bear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bearSound();
            }
        });

        wolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wolfSound();
            }
        });


    }

    private void wolfSound() {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.wolf);
        mediaPlayer.start();

    }

    private void lambSound() {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.lamb);
        mediaPlayer.start();

    }

    private void eleSound() {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
        mediaPlayer.start();
    }


    private void bearSound() {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.bear);
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
                Intent screen1 = new Intent(MainActivity.this, MainActivity.class);
                startActivity(screen1);
                return false;
            case R.id.birds:
                Intent screen2 = new Intent(MainActivity.this, birds.class);
                startActivity(screen2);
                return false;


        }
        return super.onOptionsItemSelected(item);
    }


}
