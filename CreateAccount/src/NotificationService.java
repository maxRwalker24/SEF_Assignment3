public class NotificationService {

    private EmailServer emailServer;

    public NotificationService(EmailServer emailServer) {
        this.emailServer = emailServer;
    }

    public void sendConfirmation(String userEmail) {
        String message = "Welcome! Your registration is confirmed.";
        emailServer.sendEmailConfirm(userEmail, message);
    }
}
