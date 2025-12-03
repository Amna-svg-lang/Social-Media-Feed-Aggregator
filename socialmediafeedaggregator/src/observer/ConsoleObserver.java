package observer;

import model.Post;

public class ConsoleObserver implements Observer {

    private String name;

    public ConsoleObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Post post) {
        System.out.println("[" + name + "] New post received:");
        post.display();
    }
}
