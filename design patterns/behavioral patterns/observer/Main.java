import subscribers.EmailSubscriber;
import subscribers.SmsSubscriber;

public class Main {
    public static void main(String[] args){
        YoutubeChannelImpl channel = new YoutubeChannelImpl();

        YoutubeUser alice = new YoutubeUser("Alice", new EmailSubscriber("alice", "alice@gmail.com"));
        YoutubeUser bob = new YoutubeUser("Bob", new SmsSubscriber("Bob","12345"));

        channel.addSubscriber(alice.getNotificationStrategy());
        channel.addSubscriber(bob.getNotificationStrategy());

        channel.uploadNewVideo("JAVA Tuorial");

        channel.removeSubscriber(bob.getNotificationStrategy());
        channel.uploadNewVideo("Python tutorial");
    }
}
