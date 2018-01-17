package com.example.c4q.practicalexam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.c4q.practicalexam.controller.ModelAdapter;
import com.example.c4q.practicalexam.model.Model;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;


/**
 * Created by c4q on 1/16/18.
 */

public class RecyclerViewFrag extends Fragment {
    private View v;
    private RecyclerView recyclerView;
    private TextView emailDisplayed;
    private String username;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_layout, container, false);

        emailDisplayed = v.findViewById(R.id.email_displayed);
        setEmail();


        Log.d(TAG, "onCreateView: " + username);

        recyclerView = v.findViewById(R.id.my_recyclerview);
        setRecyclerView();

        return v;
    }

    public void setEmail() {
        Bundle bundle = getActivity().getIntent().getExtras();
        username = bundle.get("username").toString();
        emailDisplayed.setText(username);
    }

    public void setRecyclerView() {

        List<Model> modelList = new ArrayList<>();

        modelList.add(new Model(0));
        modelList.add(new Model(1));
        modelList.add(new Model(2));
        modelList.add(new Model(3));
        modelList.add(new Model(4));
        modelList.add(new Model(5));
        modelList.add(new Model(6));
        modelList.add(new Model(7));
        modelList.add(new Model(8));
        modelList.add(new Model(9));
        modelList.add(new Model(10));

        ModelAdapter modelAdapter = new ModelAdapter(modelList);
        recyclerView.setAdapter(modelAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(v.getContext().getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

}
