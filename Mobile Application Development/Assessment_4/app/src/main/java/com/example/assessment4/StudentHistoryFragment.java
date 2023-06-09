package com.example.assessment4;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.assessment4.Models.CourseHistory;
import com.example.assessment4.Models.DataServices;
import com.example.assessment4.Models.Student;
import com.example.assessment4.databinding.FragmentStudentHistoryBinding;

import java.util.List;


public class StudentHistoryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1_student = "ARG_PARAM1_student";


    // TODO: Rename and change types of parameters
    private Student mStudent;


    public StudentHistoryFragment() {
        // Required empty public constructor
    }


    public static StudentHistoryFragment newInstance(Student student) {
        StudentHistoryFragment fragment = new StudentHistoryFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1_student, student);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mStudent = (Student) getArguments().getSerializable(ARG_PARAM1_student);

        }
    }

    FragmentStudentHistoryBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentStudentHistoryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.textViewStudentName.setText(mStudent.getName());
    }

    


    class AppsAdapter extends ArrayAdapter<CourseHistory> {


        public AppsAdapter(@NonNull Context context, @NonNull List<CourseHistory> objects) {
            super(context, R.layout.history_row_item, objects);




        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if(convertView == null){
                convertView = getLayoutInflater().inflate(R.layout.history_row_item, parent, false);
            }

            TextView textViewCourseNumber = convertView.findViewById(R.id.textViewCourseNumber);
            TextView textViewCourseName = convertView.findViewById(R.id.textViewCourseName);
            TextView textViewCourseHours = convertView.findViewById(R.id.textViewCourseHours);

            CourseHistory app = getItem(position);

            textViewCourseNumber.setText(app.getNumber());
            textViewCourseName.setText(app.getName());
            textViewCourseHours.setText(app.getHours().toString());


            return convertView;
        }
    }


    StudentHistoryListener mListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mListener = (StudentHistoryListener) context;
    }


    interface StudentHistoryListener {
        Void sendStudentHistory(Student student);

    }

}