package adapter;

import java.util.ArrayList;
import java.util.List;

public class TikTokAPI {

    public List<String[]> getVideos() {
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"Eve", "New dance challenge!", "11:00 AM"});
        data.add(new String[]{"Frank", "Funny video!", "11:15 AM"});
        return data;
    }
}
