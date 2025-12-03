package model;   // this tells Java this file is in the "model" package

public class Post {
    private String author;
    private String content;
    private String timestamp;

    public Post(String author, String content, String timestamp) {
        this.author = author;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getAuthor() { return author; }
    public String getContent() { return content; }
    public String getTimestamp() { return timestamp; }

    public void display() {
        System.out.println(author + ": " + content + " (" + timestamp + ")");
    }
}
