package com.back.vom.models;

import java.util.ArrayList;
import java.util.List;

public class Report {

    String mImageUrl;
    String mTitle;
    String mDescription;

    Boolean mVolunteer;
    String mDate;

    public ArrayList<String> mVolunteers = new ArrayList<String>();

    String createdBy;
    String uid;

    long upvotes;

    String mStatus;


    public String getmStatus() { return mStatus; }

    public void setmStatus(String mStatus) { this.mStatus = mStatus; }

    public long getUpvotes() { return upvotes; }

    public void setUpvotes(long upvotes) { this.upvotes = upvotes; }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    double mLatitude, mLongitude;

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Boolean getVolunteer() {
        return mVolunteer;
    }

    public void setVolunteer(Boolean volunteer) {
        mVolunteer = volunteer;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double latitude) {
        mLatitude = latitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double longitude) {
        mLongitude = longitude;
    }

    public ArrayList<String> getmVolunteers() { return mVolunteers; }

    public void setmVolunteers(ArrayList<String> mVolunteers) { this.mVolunteers = mVolunteers; }

}