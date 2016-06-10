package com.example.android.ranjithsappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the Popular Movies button is clicked
     */
    public void popularMovies(View view) {
        Toast.makeText(this, "This button will launch my Popular Movies app!", Toast.LENGTH_SHORT).show();

    }

    /**
     * This method is called when the Stock Hawk button is clicked
     */
    public void stockHawk(View view) {
        Toast.makeText(this, "This button will launch my Stock Hawk app!", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the Build it Bigger button is clicked
     */
    public void buildItBigger(View view) {
        Toast.makeText(this, "This button will launch my Build it Bigger app!", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the Make my App material button is clicked
     */
    public void makeYourAppMaterial(View view) {
        Toast.makeText(this, "This button will launch my Make my App material app!", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the Go Ubiquitous button is clicked
     */
    public void goUbiquitous(View view) {
        Toast.makeText(this, "This button will launch my Go Ubiquitous app!", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the capstone button is clicked
     */
    public void capstone(View view) {
        Toast.makeText(this, "This button will launch my capstone app!", Toast.LENGTH_SHORT).show();
    }

}
