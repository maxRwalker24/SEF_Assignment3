public class Main {

    public static void main(String[] args) {
        // components
        EmailServer emailServer = new EmailServer();
        UserRepository userRepository = new UserRepository();
        ValidationService validationService = new ValidationService();
    
        // service that depends on EmailServer
        NotificationService notificationService = new NotificationService(emailServer);
    
        // service that depends on UserRepository, ValidationService, and NotificationService
        AccountService accountService = new AccountService(userRepository, validationService, notificationService);
    
        // UI layer that uses AccountService
        UserInterface ui = new UserInterface(accountService);
    
        // Start the registration flow of the sequence diagram
        ui.startRegistration();
    }



}


