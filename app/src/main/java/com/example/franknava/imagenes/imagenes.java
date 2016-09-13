package com.example.franknava.imagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class imagenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes);

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // this method shows how to fade in and fade out
    public void fade(View view) {
        ImageView ferrari = (ImageView) findViewById(R.id.ferrari);
        ImageView lambo = (ImageView) findViewById(R.id.lambo);
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button secondButton = (Button) findViewById(R.id.secondButton);

        // Change alpha property of Freddie and The Beatles, so Freddie disappears (alpha = 0)
        // and The Beatles appear (alpha = 1).  Each transformation (animation) lasts 2 seconds.
        ferrari.animate().alpha(0f).setDuration(2000);
        lambo.animate().alpha(1f).setDuration(2000);

        // We hide and disable the first button so it won't trouble us further
        firstButton.setEnabled(false);
        firstButton.setVisibility(View.INVISIBLE);

        // We show and enable the second button so we can go to the second animation
        secondButton.setEnabled(true);
        secondButton.setVisibility(View.VISIBLE);
    }

    // this method shows how to move an image programmatically
    public void moveFlanders(View view) {
        ImageView pagani = (ImageView) findViewById(R.id.pagani);
        ImageView beatles = (ImageView) findViewById(R.id.lambo);
        Button secondButton = (Button) findViewById(R.id.secondButton);
        Button resetButton = (Button) findViewById(R.id.resetbutton);

        // Swipe The Beatles to the right and show Flanders falling from the top of the screen
        beatles.animate().translationXBy(1000f).setDuration(2000);
        pagani.setVisibility(View.VISIBLE);
        pagani.animate().translationYBy(3000f).setDuration(2000);

        // We hide and disable the second button so it won't trouble us further
        secondButton.setEnabled(false);
        secondButton.setVisibility(View.INVISIBLE);

        // We show and enable the reset button so we can restart out animations
        resetButton.setEnabled(true);
        resetButton.setVisibility(View.VISIBLE);
    }

    public void resetImages(View view) {
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button resetButton = (Button) findViewById(R.id.resetbutton);
        ImageView ferrari = (ImageView) findViewById(R.id.ferrari);
        ImageView beatles = (ImageView) findViewById(R.id.lambo);
        ImageView pagani = (ImageView) findViewById(R.id.pagani);

        pagani.setVisibility(View.INVISIBLE);
        pagani.setTranslationY(-3000);
        beatles.setAlpha(0f);
        beatles.animate().translationX(0f).setDuration(0);
        pagani.setAlpha(1f);

        // We hide and disable the reset button so it won't troubles us further
        resetButton.setEnabled(false);
        resetButton.setVisibility(View.INVISIBLE);

        // We show and enable the first button so we can run our animations again
        firstButton.setEnabled(true);
        firstButton.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagenes);

        // Hide flanders before it all starts!
        ImageView pagani = (ImageView) findViewById(R.id.pagani);
        pagani.setTranslationY(-3000);
    }
}