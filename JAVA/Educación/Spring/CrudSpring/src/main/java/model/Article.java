package model;

@lombok.Data
public class Article {
    private String id, name, description;

    public Article() {
    }

    public Article(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
