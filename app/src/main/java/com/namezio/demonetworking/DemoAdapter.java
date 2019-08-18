package com.namezio.demonetworking;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.namezio.demonetworking.model.Post;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DemoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Post> categoryList;
    private Context context;

    public DemoAdapter(List<Post> categoryList, Context context) {
        this.categoryList = categoryList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_listview_demo,parent,false);
        return new DemoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Post category = categoryList.get(position);
        DemoHolder demoHolder = (DemoHolder) holder;
        demoHolder.tvName.setText(""+category.getName());
        demoHolder.tvDesc.setText(""+category.getDestination());
        Picasso.get().load(category.getImageurl()).into(demoHolder.imgURL);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }
}
