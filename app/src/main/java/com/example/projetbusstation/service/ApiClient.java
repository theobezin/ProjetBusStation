package com.example.projetbusstation.service;

import com.example.projetbusstation.model.MyModel;

import org.json.JSONArray;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiClient {
    @GET("/bus/nearstation/latlon/%2041.3985182/2.1917991/1.json")
    Call<MyModel> getJSONData();
}