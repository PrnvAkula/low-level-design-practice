import java.util.ArrayList;
import java.util.List;

import interfaces.YoutubeChannel;
import interfaces.YoutubeNotificationStrategy;

public class YoutubeChannelImpl implements YoutubeChannel{
    List<YoutubeNotificationStrategy> subscribers;
    private String video;

    public YoutubeChannelImpl(){
        subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(YoutubeNotificationStrategy subscriber){
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(YoutubeNotificationStrategy subscriber){
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(){
        for(YoutubeNotificationStrategy subscriber : subscribers){
            subscriber.update(video);
        }
    }

    @Override
    public void uploadNewVideo(String video){
        this.video = video;
        notifySubscribers();
    }
}
