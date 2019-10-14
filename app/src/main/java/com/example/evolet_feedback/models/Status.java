package com.example.evolet_feedback.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class Status {
    private int id;
    private String name;
    private String color;

    @SerializedName("feedbacks")
    private List<Feedback> feedbackList;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }
}
