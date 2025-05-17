public class LearnerDriver {
    private String email;
    private String password;
    private int phone;
    private String address;

    SecurityManager security = new SecurityManager();

    public LearnerDriver(String email, String address, String password, int phoneNumber){ //Constructor for Learner/Driver
        this.email = email;
        this.password = password;
        this.phone = phoneNumber;
        this.address = address;
    }

    public boolean userLogin(String email, String password){ //Login function
        boolean Success = false;

        Success = security.loginValidation(this, email, password); //Calling the security manager to check if login details are valid

        return Success; //return whether it was successful or not, depending on which the message displayed will be different
    }

    public boolean userBookAppointment(String details, Instructor instructor, String paymentInfo){ //Booking an appointment
        boolean Success = false;
        Success = RoadRegistryPlatform.BookAppointment(this, details, instructor, paymentInfo); 
        //Calling the RoadRegistryPlatform to book the appointment with the details and selected instructor, as well as payment info

        return Success;
    }


}
