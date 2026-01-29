package interfaces;

public interface YoutubeChannel {
    public void addSubscriber(YoutubeNotificationStrategy subscriber);
    public void removeSubscriber(YoutubeNotificationStrategy subscriber);
    public void notifySubscribers();
    public void uploadNewVideo(String video);
}
