public class LearnerDriver {
    private String email;
    private String password;
    private int phone;
    private String address;

    SecurityManager security = new SecurityManager();

    public LearnerDriver(String email, String address, String password, int phoneNumber){
        this.email = email;
        this.password = password;
        this.phone = phoneNumber;
        this.address = address;
    }

    public boolean userLogin(String email, String password){
        boolean Success = false;

        Success = security.loginValidation(this, email, password);

        return Success;
    }

    public boolean userBookAppointment(String details, Instructor instructor, String paymentInfo){ 
        boolean Success = false;
        Success = RoadRegistryPlatform.BookAppointment(this, details, instructor, paymentInfo);

        return Success;
    }


}
