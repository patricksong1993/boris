package com.blackrock.boris.utilities.articles;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ArticleDetailProvider {
    private static final int MAX_WORDS = 50;

    public ArticleDetail retrieveDetail(Document doc) {
        final Element title = doc.getElementsByTag("title").first();

        int wordCount = 0;
        final StringBuilder intro = new StringBuilder();

        for (Element paragraph : doc.getElementsByTag("p")) {
            if (wordCount >= MAX_WORDS) {
                break;
            }

            String content = paragraph.text();

            intro.append(content);
            wordCount += content.split(" ").length;
        }

        return new ArticleDetail(intro.toString(), title.text());
    }
}
