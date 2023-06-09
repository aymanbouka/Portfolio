package com.example.assessment3;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.assessment3.databinding.FragmentSetGenderBinding;


public class SetGenderFragment extends Fragment {


    public SetGenderFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    FragmentSetGenderBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       binding = FragmentSetGenderBinding.inflate(inflater, container, false);

       return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected = binding.radioGroup.getCheckedRadioButtonId();


                String gender = "male";

                if(selected == R.id.radioButtonFemale)
                {
                    gender = "Female";
                }
                mListener.setGender(gender);
            }
        });

        binding.buttonCancel.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mListener.cancel();
                    }
                }
        );









    }
    GenderListener mListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mListener = (GenderListener) context;

    }

    interface GenderListener {

        void setGender(String gender);
        void cancel();

    }
}