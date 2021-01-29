package com.example.projetbusstation.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Data {

    /*@SerializedName("Id")
    @Expose*/
    private Integer Id;
    @SerializedName("street_name")
    @Expose
    private String street_name;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("utm_x")
    @Expose
    private float utm_x;
    @SerializedName("utm_y")
    @Expose
    private float utm_y;
    @SerializedName("lat")
    @Expose
    private float lat;
    @SerializedName("lon")
    @Expose
    private float lon;
    @SerializedName("furniture")
    @Expose
    private String furniture;
    @SerializedName("buses")
    @Expose
    private String buses;
    @SerializedName("distance")
    @Expose
    private float distance;
    @SerializedName("nearstations")
    @Expose
    private ArrayList nearstations;
    /*@SerializedName("data")
    @Expose*/



    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getUtm_x() {
        return utm_x;
    }

    public void setUtm_x(float utm_x) {
        this.utm_x = utm_x;
    }

    public float getUtm_y() {
        return utm_y;
    }

    public void setUtm_y(float utm_y) {
        this.utm_y = utm_y;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public String getBuses() {
        return buses;
    }

    public void setBuses(String buses) {
        this.buses = buses;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public ArrayList getNearstations() {
        return nearstations;
    }

    public void setNearstations(ArrayList nearstations) {
        this.nearstations = nearstations;
    }




}



