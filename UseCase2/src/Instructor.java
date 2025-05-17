public class Instructor {
    private String email;
    private String password;
    private int phone;
    private String address;

    public Instructor(String email, String address, String password, int phoneNumber){ //Constructor for the instructor
        this.email = email;
        this.password = password;
        this.phone = phoneNumber;
        this.address = address;
    }

    // Getters
    public String getEmail() {
        return email;
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
