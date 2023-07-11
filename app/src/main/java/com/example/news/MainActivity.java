package com.example.news;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.news.Fragments.BusinessFragment;
import com.example.news.Fragments.EntertainmentFragment;
import com.example.news.Fragments.HealthFragment;
import com.example.news.Fragments.HomeFragment;
import com.example.news.Fragments.ScienceFragment;
import com.example.news.Fragments.SportsFragment;

public class MainActivity extends AppCompatActivity {

    CardView home,sports,health,science,business,entertainment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String apikey ="f705dfa994cc451db396e09378a1dd38";
        home = findViewById(R.id.homecard);
        sports = findViewById(R.id.sportscard);
        health = findViewById(R.id.healthcard);
        science = findViewById(R.id.sciencecard);
        business = findViewById(R.id.businesscard);
        entertainment= findViewById(R.id.entertainmentcard);

        FragmentManager fragmentManager = getSupportFragmentManager();
        getSupportActionBar().hide();



        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              fragmentManager.beginTransaction().replace(R.id.fragmentContainerView, HomeFragment.class,null)
                      .addToBackStack("")
                      .setReorderingAllowed(true)
                      .commit();
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                fragmentManager.beginTransaction().replace(R.id.fragmentContainerView, SportsFragment.class,null)
                        .addToBackStack("")
                        .setReorderingAllowed(true)
                        .commit();

            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                fragmentManager.beginTransaction().replace(R.id.fragmentContainerView, ScienceFragment.class,null)
                        .addToBackStack("")
                        .setReorderingAllowed(true)
                        .commit();
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager.beginTransaction().replace(R.id.fragmentContainerView, HealthFragment.class,null)
                        .addToBackStack("")
                        .setReorderingAllowed(true)
                        .commit();

            }
        });
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager.beginTransaction().replace(R.id.fragmentContainerView, BusinessFragment.class,null)
                        .addToBackStack("")
                        .setReorderingAllowed(true)
                        .commit();

            }
        });
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fragmentManager.beginTransaction().replace(R.id.fragmentContainerView, EntertainmentFragment.class,null)
                        .addToBackStack("")
                        .setReorderingAllowed(true)
                        .commit();

            }
        });


    }
}