package com.codeup.adlister.models;

import java.util.Date;

public class Ad {
    private long id;
    private long userId;
    private String title;
    private String description;
    private String category;
    private long likes = 0;
    private boolean isFlagged = false;

    public Ad(long id, long userId, String title, String description, String category, long likes, boolean isFlagged) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.category = category;
        this.likes = likes;
        this.isFlagged = isFlagged;
    }

    public Ad(long id, long userId, String title, String description, String category) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public Ad(long userId, String title, String description, String category) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public Ad(long userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void setFlagged(boolean flagged) {
        isFlagged = flagged;
    }
}
