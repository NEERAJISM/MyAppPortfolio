package com.whysoserious.neeraj.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bspotify, bscores, blibrary, bxyzreader, bbuilditbigger, bcapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Linking all Buttons to its xml view
        bspotify = (Button) findViewById(R.id.b_spotify_streamer);
        bscores = (Button) findViewById(R.id.b_scores);
        blibrary = (Button) findViewById(R.id.b_library);
        bxyzreader = (Button) findViewById(R.id.b_xyz_reader);
        bbuilditbigger = (Button) findViewById(R.id.b_build_it_bigger);
        bcapstone = (Button) findViewById(R.id.b_capstone);

        // setting up onclicklistener for all buttons
        bspotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(MainActivity.this, "This is My Spotify Streamer App");
            }
        });

        bscores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(MainActivity.this, "This is My Scores App");
            }
        });

        blibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(MainActivity.this, "This is My Library App");
            }
        });

        bxyzreader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(MainActivity.this, "This is My XYZ Reader App");
            }
        });

        bcapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(MainActivity.this, "This is My Capstone App");
            }
        });

        bbuilditbigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(MainActivity.this, "This is My Build it Bigger App");
            }
        });


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

   /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}