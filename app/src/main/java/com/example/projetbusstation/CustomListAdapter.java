package com.example.projetbusstation;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.projetbusstation.model.MyModel;
import com.google.gson.internal.LinkedTreeMap;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {


    Context c;
    ArrayList<MyModel> nearstations;

    public CustomListAdapter(Context c, ArrayList<MyModel> nearstations) {
        this.c = c;
        this.nearstations = nearstations;
    }

    @Override
    public int getCount() {
        return nearstations.size();
    }

    @Override
    public MyModel getItem(int i) {
        return this.nearstations.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view= LayoutInflater.from(c).inflate(R.layout.json_data_list,viewGroup,false);
        }

        TextView mStreet_Name = (TextView) view.findViewById(R.id.street_name);
        TextView mCity = (TextView) view.findViewById(R.id.city);


        Object getrow = this.nearstations.get(i);
        LinkedTreeMap<Object,Object> rowmap = (LinkedTreeMap) getrow;
        String street_name = rowmap.get("street_name").toString();
        String city = rowmap.get("city").toString();


        mStreet_Name.setText(street_name);
        mCity.setText(city);


        return view;
    }

}