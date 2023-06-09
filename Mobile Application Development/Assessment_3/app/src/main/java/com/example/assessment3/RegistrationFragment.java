package com.example.assessment3;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.assessment3.databinding.FragmentRegistrationBinding;


public class RegistrationFragment extends Fragment {



    public RegistrationFragment() {
        // Required empty public constructor
    }

String gender;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    FragmentRegistrationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRegistrationBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    if(gender !=null)
    {
        binding.textViewSelectedGender.setText(gender);
    }
        binding.buttonSetGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListenr.goToGender();
            }
        });

    String name = binding.editTextName.getText().toString();
    }
    sendToMain mListenr;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        mListenr = (sendToMain) context;
    }

    public void gender(String gender)
    {
        this.gender = gender;
    }

    Profile profile = new Profile(name, gender);

    interface sendToMain {
        void goToGender();
        void submitAll();
    }

}