package com.example.soundboardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean playOrPause = true;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView PillarMenImage = (ImageView)findViewById(R.id.pillarMenImage);
        ImageView PokeThemeImage = (ImageView)findViewById(R.id.pokeThemeImage);
        ImageView xyImage = (ImageView)findViewById(R.id.xyImage);
        ImageView platinumImage = (ImageView)findViewById(R.id.platinumImage);
        ImageView rebornImage = (ImageView)findViewById(R.id.rebornImage);
        ImageView rebornCityImage = (ImageView)findViewById(R.id.rebornCityImage);
        ImageView peridotImage = (ImageView)findViewById(R.id.peridotImage);
        ImageView opalImage = (ImageView)findViewById(R.id.opalImage);
        ImageView obsidiaImage = (ImageView)findViewById(R.id.obsidiaImage);
        PillarMenImage.setOnClickListener(playMusic);
        PokeThemeImage.setOnClickListener(playMusic);
        xyImage.setOnClickListener(playMusic);
        platinumImage.setOnClickListener(playMusic);
        rebornImage.setOnClickListener(playMusic);
        rebornCityImage.setOnClickListener(playMusic);
        peridotImage.setOnClickListener(playMusic);
        opalImage.setOnClickListener(playMusic);
        obsidiaImage.setOnClickListener(playMusic);

    }
    View.OnClickListener playMusic = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (playOrPause == true) {
                switch(v.getId()) {
                    case R.id.pillarMenImage:
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.awaken);
                        mediaPlayer.start();
                        playOrPause = false;
                        break;
                    case R.id.pokeThemeImage:
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.pokemontheme);
                        mediaPlayer.start();
                        playOrPause = false;
                        break;
                    case R.id.xyImage:
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.pokexy);
                        mediaPlayer.start();
                        playOrPause = false;
                        break;
                    case R.id.platinumImage:
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.platinum);
                        mediaPlayer.start();
                        playOrPause = false;
                        break;
                    case R.id.rebornImage:
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.reborn);
                        mediaPlayer.start();
                        playOrPause = false;
                        break;
                    case R.id.rebornCityImage:
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.reborncity);
                        mediaPlayer.start();
                        playOrPause = false;
                        break;
                    case R.id.peridotImage:
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.rebornperidot);
                        mediaPlayer.start();
                        playOrPause = false;
                        break;
                    case R.id.opalImage:
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.rebornopal);
                        mediaPlayer.start();
                        playOrPause = false;
                        break;
                    case R.id.obsidiaImage:
                        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.rebornobsidia);
                        mediaPlayer.start();
                        playOrPause = false;
                        break;
                }

            }
            else {
                mediaPlayer.pause();
                playOrPause = true;
            }
        }
    };
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
}