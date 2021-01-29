package com.example.projetbusstation.service;

import com.example.projetbusstation.model.MyModel;


import retrofit2.Call;
import retrofit2.Callback;

public class ApiService {

    public void getClientList(Callback<MyModel> callback) {

        ApiClient service = ApiClientBuilder.getMGClient();

        Call<MyModel> result =  service.getJSONData();

        result.enqueue(callback);

    }


}