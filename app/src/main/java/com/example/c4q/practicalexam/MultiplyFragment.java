package com.example.c4q.practicalexam;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MultiplyFragment extends Fragment {
    private View v;
    private TextView numberDisplayed;


    public MultiplyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       v = inflater.inflate(R.layout.fragment_multiply, container, false);

         numberDisplayed = v.findViewById(R.id.number_displayed);

        Bundle bundle = getArguments();
        int numToMultiply = bundle.getInt("int");
        int multipleof10 = numToMultiply *10;
        numberDisplayed.setText(String.valueOf(multipleof10));

        return v;
    }

}
