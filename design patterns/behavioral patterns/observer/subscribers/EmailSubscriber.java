package subscribers;

import interfaces.YoutubeNotificationStrategy;

public class EmailSubscriber implements YoutubeNotificationStrategy{
    private String username;
    private String email;

    public EmailSubscriber(String username, String email){
        this.username = username;
        this.email = email;
    }

    @Override
    public void update(String video){
        System.out.println("Sending email to "+ username + " ("+ email + "): new video uploaded -> " + video);
    }
}
