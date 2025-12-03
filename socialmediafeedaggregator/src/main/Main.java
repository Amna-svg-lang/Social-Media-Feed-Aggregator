package main;

import adapter.InstagramAdapter;
import adapter.TwitterAdapter;
import adapter.TikTokAdapter;
import model.Post;
import singleton.FeedManager;
import observer.ConsoleObserver;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create observers
        ConsoleObserver user1 = new ConsoleObserver("Amna");
        ConsoleObserver user2 = new ConsoleObserver("Areeba");

        // Get FeedManager instance
        FeedManager feedManager = FeedManager.getInstance();

        // Add observers to FeedManager
        feedManager.addObserver(user1);
        feedManager.addObserver(user2);

        // Create adapters
        InstagramAdapter instagram = new InstagramAdapter();
        TwitterAdapter twitter = new TwitterAdapter();
        TikTokAdapter tiktok = new TikTokAdapter();

        // Get posts from Instagram and add to FeedManager
        List<Post> instaPosts = instagram.getPosts();
        for (Post post : instaPosts) {
            feedManager.addPost(post);
        }

        // Get posts from Twitter and add to FeedManager
        List<Post> twitterPosts = twitter.getPosts();
        for (Post post : twitterPosts) {
            feedManager.addPost(post);
        }

        // Get posts from TikTok and add to FeedManager
        List<Post> tiktokPosts = tiktok.getPosts();
        for (Post post : tiktokPosts) {
            feedManager.addPost(post);
        }

        // ======================== Pretty Display ========================
        System.out.println("\n==================== ALL POSTS IN THE FEED ====================\n");
        int count = 1;
        for (Post post : feedManager.getPosts()) {
            System.out.println("Post #" + count);
            System.out.println("Author   : " + post.getAuthor());
            System.out.println("Content  : " + post.getContent());
            System.out.println("Timestamp: " + post.getTimestamp());
            System.out.println("--------------------------------------------------");
            count++;
        }
    }
}
