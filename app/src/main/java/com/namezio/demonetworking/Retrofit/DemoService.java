package com.namezio.demonetworking.Retrofit;

import com.namezio.demonetworking.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DemoService {
    //https://raw.githubusercontent.com/Oclemy/SampleJSON/338d9585/spacecrafts.json
    @GET("/Oclemy/SampleJSON/338d9585/spacecrafts.json")
    Call<List<Post>> getPost();
}
