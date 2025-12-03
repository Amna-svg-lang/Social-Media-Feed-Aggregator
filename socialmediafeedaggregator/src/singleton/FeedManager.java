package singleton;

import model.Post;
import java.util.ArrayList;
import java.util.List;
import observer.Observer;

public class FeedManager {

    private static FeedManager instance;  // Singleton instance
    private List<Post> posts;             // Stores all posts
    private List<Observer> observers;     // Observers to notify

    // Private constructor
    private FeedManager() {
        posts = new ArrayList<>();
        observers = new ArrayList<>();
    }

    // Get the single instance of FeedManager
    public static FeedManager getInstance() {
        if (instance == null) {
            instance = new FeedManager();
        }
        return instance;
    }

    // Add observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Add a new post and notify observers
    public void addPost(Post post) {
        posts.add(post);
        notifyObservers(post);
    }

    // Notify all observers
    private void notifyObservers(Post post) {
        for (Observer observer : observers) {
            observer.update(post);
        }
    }

    // Get all posts
    public List<Post> getPosts() {
        return posts;
    }
}
