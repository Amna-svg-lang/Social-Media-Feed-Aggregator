package adapter;

import model.Post;
import factory.PostFactory;
import java.util.ArrayList;
import java.util.List;

public class TwitterAdapter {
    private TwitterAPI api;

    public TwitterAdapter() {
        api = new TwitterAPI();
    }

    public List<Post> getPosts() {
        List<Post> posts = new ArrayList<>();
        for (String[] data : api.getTweets()) {
            posts.add(PostFactory.createPost(data[0], data[1], data[2]));
        }
        return posts;
    }
}
