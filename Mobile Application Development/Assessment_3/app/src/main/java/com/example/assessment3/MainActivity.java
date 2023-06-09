package com.example.assessment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements WelcomeFragment.WelcomeFragmentListener, SetGenderFragment.GenderListener, RegistrationFragment.sendToMain {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.rootView, new WelcomeFragment(), "temp")
                .commit();

    }


    @Override
    public void buttonStart() {

        getSupportFragmentManager().beginTransaction().replace(R.id.rootView, new RegistrationFragment(), "registration")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void setGender(String gender) {
        RegistrationFragment fragment = (RegistrationFragment) getSupportFragmentManager().findFragmentByTag("registration");

        if(fragment != null)
        {
            fragment.gender(gender);
        }
        getSupportFragmentManager().popBackStack();
    }

    @Override
    public void cancel() {
        getSupportFragmentManager().popBackStack();
    }

    @Override
    public void goToGender() {
        getSupportFragmentManager().beginTransaction().replace(R.id.rootView, new SetGenderFragment())
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void submitAll() {

    }
}