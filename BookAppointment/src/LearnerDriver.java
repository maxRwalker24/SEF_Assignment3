public class LearnerDriver {
    private String username;
    private String password;
    private int phone;
    private String address;

    public LearnerDriver(String username, String address, String password, int phoneNumber){ //Constructor for Learner/Driver
        this.username = username;
        this.password = password;
        this.phone = phoneNumber;
        this.address = address;
    }

    public boolean login(String username, String password){ //Login function
        boolean Success = false;

        Success = SecurityManager.login(username, password); //Calling the security manager to check if login details are valid

        return Success; //return whether it was successful or not, depending on which the message displayed will be different
    }

    public boolean bookAppointment(LearnerDriver user, String details, Instructor instructor, String paymentInfo){ //Booking an appointment
        boolean Success = false;
        Success = AppointmentManager.bookAppointment(this, details, instructor, paymentInfo); 
        //Calling the AppointmentManager to book the appointment with the details and selected instructor, as well as payment info

        return Success;
    }

     // Getters
    public String getUsername() {
      return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }


}
