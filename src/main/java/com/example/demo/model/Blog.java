package com.example.demo.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Blog {
    private Long id;
    private String title;
    private String body;
    private List<String> keywords;
    private String generatedDate;

    // Constructors, getters, and setters
    public Blog() {
    }

    public Blog(Long id, String title, String body, List<String> keywords) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.keywords = keywords;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getGeneratedDate() {
        Date dt =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(dt);
    }

    public void setGeneratedDate(String generatedDate) {
        this.generatedDate = generatedDate;
    }

    
}
