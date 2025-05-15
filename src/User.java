public class User {
    private String email;
    private String address;
    private String password;
    private String phone;

    public User(UserInfo userInfo) {
        this.email = userInfo.getEmail();
        this.address = userInfo.getAddress();
        this.password = userInfo.getPassword();
        this.phone = userInfo.getPhone();
    }

    // Getters
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public String getPassword() { return password; }
    public String getPhone() { return phone; }

    // Setters
    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }

    // For password change, implement appropriate logic:
    public boolean changePassword(String oldPass, String newPass) {
        if (this.password.equals(oldPass)) {
            //
            return true;
        }
        return false;
    }
}
