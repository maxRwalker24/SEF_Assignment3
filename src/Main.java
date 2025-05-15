public class Main {

    public static void main(String[] args) {
        // Low-level components
        EmailServer emailServer = new EmailServer();
        UserRepository userRepository = new UserRepository();
        ValidationService validationService = new ValidationService();
    
        // Mid-level service that depends on EmailServer
        NotificationService notificationService = new NotificationService(emailServer);
    
        // High-level service that depends on UserRepository, ValidationService, and NotificationService
        AccountService accountService = new AccountService(userRepository, validationService, notificationService);
    
        // UI layer that uses AccountService
        UserInterface ui = new UserInterface(accountService);
    
        // Start the registration flow
        ui.startRegistration();
    }



}


