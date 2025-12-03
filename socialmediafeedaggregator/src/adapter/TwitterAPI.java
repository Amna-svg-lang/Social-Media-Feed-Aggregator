package adapter;

import java.util.ArrayList;
import java.util.List;

public class TwitterAPI {

    public List<String[]> getTweets() {
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Charlie", "Good morning everyone!", "09:00 AM"});
        data.add(new String[]{"Diana", "Just posted a new tweet!", "09:10 AM"});
        return data;
    }
}
