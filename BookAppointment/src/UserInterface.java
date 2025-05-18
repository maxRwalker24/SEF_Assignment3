public class UserInterface {
    
    public boolean loginLearnerDriver(String username, String password) {
        return SecurityManager.login(username, password);
    }

    public boolean bookAppointment(LearnerDriver user, String details, Instructor instructor, String paymentInfo){
        return AppointmentManager.bookAppointment(user, details, instructor, paymentInfo);
    }

    public void displayReceipt(String receipt) {
        
    }
}
