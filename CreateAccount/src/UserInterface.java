public class UserInterface {
    private AccountService accountService;

    public UserInterface(AccountService accountService) {
        this.accountService = accountService;
    }

    public void startRegistration() {
        boolean success = false;

        while (!success) {
            UserInfo userInfo = enterUserInfo();
            RegistrationResult result = accountService.submitUserInfo(userInfo);

            switch (result) {
                case VALIDATION_ERROR:
                    displayValidationError();
                    break;
                case DUPLICATE_ERROR:
                    displayDuplicateError();
                    break;
                case SUCCESS:
                    displayConfirmationMessage();
                    success = true; // exit loop
                    break;
            }
        }
    }

    public UserInfo enterUserInfo() {
        // User enters name, DOB, email, phone, password etc
        return new UserInfo();
    }

    public void displayValidationError() {
        // example message
        // System.out.println("Validation error: Please enter valid information.");
    }

    public void displayDuplicateError() {
        // example message
        // System.out.println("Duplicate account error: Account already exists.");
    }

    public void displayConfirmationMessage() {
        // example message
        // System.out.println("Registration successful! Confirmation sent.");
    }
}
