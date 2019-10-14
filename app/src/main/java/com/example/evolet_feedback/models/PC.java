package com.example.evolet_feedback.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class PC {
    private int id;
    private String name;

    @SerializedName("logo")
    private String logoUrl;

    private List<Customer> customers;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }
}
