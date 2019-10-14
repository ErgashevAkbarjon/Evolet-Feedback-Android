package com.example.evolet_feedback.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class Feedback {
    private int id;
    private String description;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    private Group group;
    private Status status;

    @SerializedName("type")
    private FeedbackType feedbackType;

    private Customer customer;

    @SerializedName("files")
    private List<File> fileList;

    private Response response;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Group getGroup() {
        return group;
    }

    public Status getStatus() {
        return status;
    }

    public FeedbackType getFeedbackType() {
        return feedbackType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public Response getResponse() {
        return response;
    }
}
