package com.example.evolet_feedback.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Customer {
    private int id;
    private int bonus;
    private User user;
    private PC pc;

    @SerializedName("feedback")
    private List<Feedback> feedbackList;

    public int getId() {
        return id;
    }

    public int getBonus() {
        return bonus;
    }

    public User getUser() {
        return user;
    }

    public PC getPc() {
        return pc;
    }
}
