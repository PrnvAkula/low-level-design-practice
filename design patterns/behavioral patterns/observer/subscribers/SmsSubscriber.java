package subscribers;

import interfaces.YoutubeNotificationStrategy;

public class SmsSubscriber implements YoutubeNotificationStrategy{
    private String username;
    private String phoneNumber;

    public SmsSubscriber(String username, String phoneNumber){
        this.username = username;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String video){
        System.out.println("Sending SMS to: " + username + " ("+ phoneNumber + "): New video uploaded -> " + video);
    }
}
