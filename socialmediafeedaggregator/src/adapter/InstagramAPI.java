package adapter;

import java.util.ArrayList;
import java.util.List;

public class InstagramAPI {

    // This method simulates posts coming from Instagram
    public List<String[]> getPosts() {
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Alice", "Vacation photo", "10:00 AM"});
        data.add(new String[]{"Bob", "Lunch time!", "10:05 AM"});
        return data;
    }
}
