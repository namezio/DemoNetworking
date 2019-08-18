package com.namezio.demonetworking;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DemoHolder extends RecyclerView.ViewHolder {
    public ImageView imgURL;
    public TextView tvName;
    public TextView tvDesc;
    public DemoHolder(@NonNull View itemView) {
        super(itemView);
        imgURL = itemView.findViewById(R.id.imgURL);
        tvName = itemView.findViewById(R.id.tvName);
        tvDesc = itemView.findViewById(R.id.tvDesc);

    }
}
