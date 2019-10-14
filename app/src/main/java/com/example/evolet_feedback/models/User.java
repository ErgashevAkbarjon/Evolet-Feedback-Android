package com.example.evolet_feedback.models;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("full_name")
    private String fullName;

    private String email;

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
