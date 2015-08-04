package com.blackrock.boris.utilities.articles;

public class ArticleDetail {
    private final String title;
    private final String summary;

    public ArticleDetail(String summary, String title) {
        this.summary = summary;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }
}
