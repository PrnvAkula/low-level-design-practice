import interfaces.YoutubeNotificationStrategy;

public class YoutubeUser {
    private String name;
    private YoutubeNotificationStrategy notificationStrategy;

    public YoutubeUser(String name, YoutubeNotificationStrategy notificationStrategy){
        this.name = name;
        this.notificationStrategy = notificationStrategy;
    }

    public void setNotificationStrategy(YoutubeNotificationStrategy notificationStrategy){
        this.notificationStrategy = notificationStrategy;
    }

    public YoutubeNotificationStrategy getNotificationStrategy() {
        return notificationStrategy;
    }

    public String getName() {
        return name;
    }
}
