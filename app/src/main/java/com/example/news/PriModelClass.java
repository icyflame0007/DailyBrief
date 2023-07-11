package com.example.news;

import java.util.ArrayList;

public class PriModelClass {

    private String status,totalResults;

    private ArrayList<SecModelClass> articles;

    public PriModelClass(String status, String totalResults, ArrayList<SecModelClass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<SecModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<SecModelClass> articles) {
        this.articles = articles;
    }
}
