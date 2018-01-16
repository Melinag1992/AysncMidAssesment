package com.example.c4q.practicalexam.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.practicalexam.R;
import com.example.c4q.practicalexam.model.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q on 1/16/18.
 */

public class ModelAdapter extends RecyclerView.Adapter<ModelViewHolder> {
    List<Model> myList;

    public ModelAdapter(List<Model> myList){
        this.myList = myList;
    }
    @Override
    public ModelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View modelView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new ModelViewHolder(modelView);
    }

    @Override
    public void onBindViewHolder(ModelViewHolder holder, int position) {
        Model model = myList.get(position);


            holder.onBind(model);



    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}

