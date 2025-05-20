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
