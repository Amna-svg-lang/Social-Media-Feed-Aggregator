package factory;  // tells Java this file is in the "factory" package

import model.Post; // import the Post class

public class PostFactory {

    public static Post createPost(String author, String content, String timestamp) {
        return new Post(author, content, timestamp);
    }
}
