public class UserInfo {
    private String email;
    private String address;
    private String password;
    private String phone;
    private String birthDate;

    public UserInfo() {
        // Default constructor
    }

    public UserInfo(String email, String address, String password, String phone, String birthDate) {
        this.email = email;
        this.address = address;
        this.password = password;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    // Getters
    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    // Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
