public class LearnerDriver {
    private String email;
    private String password;
    private int phone;
    private String address;

    SecurityManager security = new SecurityManager();

    private LearnerDriver(String email, String address, String password, int phoneNumber){
        this.email = email;
        this.password = password;
        this.phone = phoneNumber;
        this.address = address;
    }

    // public String getEmail() {
    //   return this.email;
    // }

    // public String getPassword() {
    //   return this.password;
    // }

    // public int getPhone() {
    //   return this.phone;
    // } 

    // public String getAddress() {
    //   return this.address;
    // }

    public boolean userLogin(){
        boolean Success = false;

        Success = security.loginValidation(this, "email", "password");

        return Success;
    }

}
