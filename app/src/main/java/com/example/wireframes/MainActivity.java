package com.example.wireframes;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.app_title_layout);
        setContentView(R.layout.activity_main);
    }

//    public void onListClick(View view) {
//        Intent i = new Intent(this, UserStatsActivity.class);
//        startActivity(i);
//    }

//    public void onScannerClick(View view) {
//        Intent i = new Intent(this, ScannerActivity.class);
//        startActivity(i);
//    }
//
//    public void onAccountClick(View view) {
//        Intent i = new Intent(this, ProfileActivity.class);
//        startActivity(i);
//    }
//
    public void onAccountClick(MenuItem item) {
        Intent i = new Intent(this, ProfileActivity.class);
           startActivity(i);
    }
//    BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
//
//    public void setBottomNavigationView(BottomNavigationView bottomNavigationView) {
//        this.bottomNavigationView = bottomNavigationView;
//    }
    //    public void onListClick(MenuItem item) {
//        Intent i = new Intent(this, UserStatsActivity.class);
//        startActivity(i);
//    }
}