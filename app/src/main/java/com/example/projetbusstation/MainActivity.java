package com.example.projetbusstation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.projetbusstation.model.MyModel;
import com.example.projetbusstation.service.ApiService;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    ListView listView ;
    String TAG = "MainActivity";
    ArrayList dummyData =new ArrayList<>();
    static CustomListAdapter customListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Make a server call and get data
        getdata();
    }


    public void getdata() {
        try {

            new ApiService().getClientList( new Callback<MyModel>() {
                @Override
                public void onResponse(Call<MyModel> call, Response<MyModel> response) {

                    Log.d(TAG, "onResponse: response..."+response);


                    //This will get result part from dummy JSON response
                    dummyData = response.body().getData();
                    createListView();
                }
                @Override
                public void onFailure(Call<MyModel> call, Throwable t) {

                    Log.d(TAG, "onFailure: response...");
                }
            });

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public  void createListView(){
        //Send JSON object list to custom BaseAdapter
        customListAdapter = new CustomListAdapter(getApplicationContext(), dummyData);
        listView = (ListView) findViewById(R.id.listShowJSONData);
        listView.setAdapter(customListAdapter);
    }


}