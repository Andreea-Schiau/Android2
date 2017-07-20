package com.example.andreea.runawayfinal4;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static com.example.andreea.runawayfinal4.R.id.action_bar_title;
import static com.example.andreea.runawayfinal4.R.id.title;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    int valueDudes = 0, valueBesties = 0, totalPeople = 0;


    public void onClick(View v){

        switch(v.getId()) {
            case R.id.bad_button:
                final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this, R.raw.yes);
                Button playSound = (Button) this.findViewById(R.id.bad_button);
                catSoundMediaPlayer.start();
                break;

            case R.id.super_button:
                final MediaPlayer madeSoundMediaPlayer = MediaPlayer.create(this, R.raw.made);
                Button playMadeSound = (Button) this.findViewById(R.id.super_button);
                madeSoundMediaPlayer.start();
                break;

            case R.id.good_button:
                final MediaPlayer goodSoundMediaPlayer = MediaPlayer.create(this, R.raw.goodjob);
                Button playGoodSound = (Button) this.findViewById(R.id.good_button);
                goodSoundMediaPlayer.start();
                break;

            case R.id.dudes_button:
                valueDudes ++;
                totalPeople ++;
                Toast myToastGood = Toast.makeText(
                        getApplicationContext(),valueDudes+ " dudes", Toast.LENGTH_LONG);
                        myToastGood.show();

                final TextView countingDudes = (TextView)findViewById(R.id.textView4);

                countingDudes.setText("Dudes:" + valueDudes + "                                     Besties: " + valueBesties+ "                            People: " + totalPeople);
                countingDudes.setTextSize(30);
                break;

            case R.id.besties_button:
                valueBesties ++;
                totalPeople ++;
                Toast myToastGood2 = Toast.makeText(
                        getApplicationContext(),valueBesties+ " besties", Toast.LENGTH_LONG);
                myToastGood2.show();


                final TextView countingBesties = (TextView)findViewById(R.id.textView4);
                countingBesties.setText("Dudes:" + valueDudes + "                                     Besties: " + valueBesties+ "                            People: " + totalPeople);
                countingBesties.setTextSize(30);
                break;

        }

    }





    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            RunIt runit= new RunIt();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, runit).commit();



        } else if (id == R.id.nav_gallery) {

            FeelIt feelIt = new FeelIt();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, feelIt).commit();



        } else if (id == R.id.nav_slideshow) {

            GameIt gameIt = new GameIt();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, gameIt).commit();
        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }

}
