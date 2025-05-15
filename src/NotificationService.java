public class NotificationService {

    private EmailServer emailServer;

    public NotificationService(EmailServer emailServer) {
        this.emailServer = emailServer;
    }

    public void sendEmailConfirm(String userEmail) {
        String message = "Welcome! Your registration is confirmed.";
        emailServer.sendEmail(userEmail, message);
    }
}
