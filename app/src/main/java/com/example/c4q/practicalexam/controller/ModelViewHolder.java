package com.example.c4q.practicalexam.controller;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.c4q.practicalexam.MultiplyFragment;
import com.example.c4q.practicalexam.R;
import com.example.c4q.practicalexam.RecyclerViewFrag;
import com.example.c4q.practicalexam.model.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q on 1/16/18.
 */

class ModelViewHolder extends RecyclerView.ViewHolder {
    private TextView numberDisplayed;

    public ModelViewHolder(View itemView) {
        super(itemView);

        numberDisplayed = itemView.findViewById(R.id.number_text);

    }

    public void onBind(final Model model){
        numberDisplayed.setText(String.valueOf(model.getNumber()));


        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MultiplyFragment multiplyFrag = new MultiplyFragment();


                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                FragmentManager fragmentManager= activity.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


                Bundle bundle = new Bundle();
                bundle.putInt("int",model.getNumber());
                multiplyFrag.setArguments(bundle);
                fragmentTransaction.replace(R.id.frag_container,multiplyFrag).addToBackStack("multiply");
                fragmentTransaction.commit();

            }
        });
    }
}
