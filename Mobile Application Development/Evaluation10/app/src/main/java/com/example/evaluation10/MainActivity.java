package com.example.evaluation10;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.widget.AutocompleteSupportFragment;
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    TextView textViewCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewCity = findViewById(R.id.textViewCity);
        textViewCity.setText("N/A");
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        Places.initialize(getApplicationContext(), "AIzaSyAiIqjMiqcO-JAIRLMTrWR1oJDBmn-X_Go");

        PlacesClient placesClient = Places.createClient(this);




        // Initialize the AutocompleteSupportFragment.
        AutocompleteSupportFragment autocompleteFragment = (AutocompleteSupportFragment)
                getSupportFragmentManager().findFragmentById(R.id.autocomplete_fragment);


        // Specify the types of place data to return.
        autocompleteFragment.setPlaceFields(Arrays.asList(Place.Field.ID, Place.Field.NAME));

        // Set up a PlaceSelectionListener to handle the response.
        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(@NonNull Place place) {
                // TODO: Get info about the selected place.
                Log.i("TAG", "Place: " + place.getName() + ", " + place.getId());

                final String placeId = place.getId();

                // Specify the fields to return.
                final List<Place.Field> placeFields = Arrays.asList(Place.Field.ID, Place.Field.NAME);

// Construct a request object, passing the place ID and fields array.
                final FetchPlaceRequest request = FetchPlaceRequest.newInstance(placeId, placeFields);

                placesClient.fetchPlace(request).addOnSuccessListener((response) -> {
                    Log.i(TAG, "Place found: " + place.getName());
                }).addOnFailureListener((exception) -> {
                    if (exception instanceof ApiException) {
                        final ApiException apiException = (ApiException) exception;
                        Log.e(TAG, "Place not found: " + exception.getMessage());
                        final int statusCode = apiException.getStatusCode();
                        // TODO: Handle error with given status code.
                    }
                });



            }


            @Override
            public void onError(@NonNull Status status) {
                // TODO: Handle the error.
                Log.i("TAG", "An error occurred: " + status);
            }
        });



        findViewById(R.id.buttonGo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }


    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        googleMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() {
            @Override
            public void onMapLoaded() {

            }
        });
    }


}
