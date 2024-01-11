package com.example.news;

public class News {
    private int image;
    private String title;
    private String description;

    public News(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }
    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}