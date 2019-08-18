package com.namezio.demonetworking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.namezio.demonetworking.Retrofit.DemoRetrofit;
import com.namezio.demonetworking.model.Post;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recy;
    private List<Post> categoryList;
    private DemoAdapter demoAdapter;
    private LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy = findViewById(R.id.recy);

        categoryList = new ArrayList<>();
        demoAdapter = new DemoAdapter(categoryList,this);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false);
        recy.setLayoutManager(linearLayoutManager);
        recy.setAdapter(demoAdapter);

        DemoRetrofit.getInstance().getPost().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                categoryList.addAll(response.body());
                demoAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

            }
        });
    }
}
