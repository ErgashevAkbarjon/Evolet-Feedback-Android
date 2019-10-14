package com.example.evolet_feedback.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class FeedbackType {
    private int id;
    private String name;

    @SerializedName("feedbacks")
    private List<Feedback> feedbackList;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }
}
