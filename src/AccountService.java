public class AccountService {
    // Orchestrates various services related to the use case
    private UserRepository userRepository;
    private ValidationService validationService;
    private NotificationService notificationService;

    public AccountService(UserRepository userRepository,
                          ValidationService validationService,
                          NotificationService notificationService) {
        this.userRepository = userRepository;
        this.validationService = validationService;
        this.notificationService = notificationService;
    }

    public RegistrationResult submitUserInfo(UserInfo userInfo) {
        userRepository.logRegistrationAttempt(userInfo);

        if (!validationService.validate(userInfo)) {
            return RegistrationResult.VALIDATION_ERROR;
        }

        if (validationService.checkDuplicate(userInfo)) {
            return RegistrationResult.DUPLICATE_ERROR;
        }

        User newUser = new User(userInfo);
        userRepository.saveAccount(newUser);

        notificationService.sendConfirmation(newUser.getEmail());
        return RegistrationResult.SUCCESS;
    }
}

