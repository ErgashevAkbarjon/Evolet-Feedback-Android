package com.example.evolet_feedback.models;

import com.google.gson.annotations.SerializedName;

class File {
    private int id;
    private String name;
    private String url;
    private Feedback feedback;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public Feedback getFeedback() {
        return feedback;
    }
}
