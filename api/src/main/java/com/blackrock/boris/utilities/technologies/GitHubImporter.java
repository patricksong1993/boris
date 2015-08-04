package com.blackrock.boris.utilities.technologies;

import com.blackrock.boris.dto.Article;
import com.blackrock.boris.dto.Technology;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class GitHubImporter implements TechnologyImporter {
    private final static Logger logger = Logger.getLogger(GitHubImporter.class.getName());
    private final static String BASE_URL = "https://api.github.com/search/repositories?";
    private final static String QUERY = "q=";
    private final static String LANGUAGE = "+language:";
    private final static String CREATED = ""; //"+created:2015-07-21";
    private final static String CREDENTIALS = "&client_id=5904eecf5394f99575a7&client_secret=f7a1bc3cc26c7b38e41b95720c9c39c244f063e8";

    private String url;

    public GitHubImporter(String query, String language) {
        this.url = BASE_URL + QUERY + query + LANGUAGE + language + CREATED + CREDENTIALS;
    }

    @Override
    public void importTechnologies() {
        Unirest.get(url)
               .header("accept", "application/json")
               .asJsonAsync(new Callback<JsonNode>() {
                   @Override
                   public void completed(HttpResponse<JsonNode> jsonNodeHttpResponse) {
                       JSONArray items = jsonNodeHttpResponse.getBody().getObject().getJSONArray("items");

                       for (int i = 0; i < items.length(); i++) {
                           JSONObject item = items.getJSONObject(i);
                           System.out.println(item.get("html_url"));
                           Technology technology = new Technology();
                           technology.setTitle("name");
                           technology.setDescription("description");

                           Article article = new Article();
                           article.setTitle("GitHub Repository");
                           article.setLink(item.get("html_url").toString());
                           article.setSource("github.com");
                           article.setTechnologyRelatedTo(technology);
                       }
                   }

                   @Override
                   public void failed(UnirestException e) {
                       logger.error(e.getMessage());
                   }

                   @Override
                   public void cancelled() {
                       logger.debug("GitHub technology import was cancelled");
                   }
               });
    }

    public static void main(String[] args) {
        new GitHubImporter("search", "java").importTechnologies();
    }
}
