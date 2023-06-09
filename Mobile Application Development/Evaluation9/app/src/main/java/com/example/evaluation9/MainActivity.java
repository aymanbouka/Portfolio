package com.example.evaluation9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: goto https://console.cloud.google.com/ to setup the google maps sdk for this project
        //TODO: use the https://developers.google.com/maps/documentation/android-sdk/config to setup the google maps sdk in this project

    }

    //TODO: The retrieved trip points should be plotted on the Google Map
    // using “Polyline” shape https://developers.google.com/maps/documentation/android-sdk/polygon-tutorial

    //TODO: The start and end points of the trip should be indicated with markers
    // https://developers.google.com/maps/documentation/android-sdk/map-with-marker

    //TODO: Also map should be auto zoomed to include all the trip points in the map’s bounding box.
    //Check CameraUpdateFactory class check: https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory

}
