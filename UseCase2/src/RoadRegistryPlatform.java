public class RoadRegistryPlatform {
    static PaymentManager payment = new PaymentManager();
    static Database database = new Database();

    public static boolean BookAppointment(LearnerDriver user, String details, Instructor instructor, String paymentInfo){
        boolean success = false;
        int amountToPay = 1234;

        success = payment.processPayment(paymentInfo, amountToPay, user);

        if(success){
            Appointment appointment = new Appointment(details);
            database.addAppointment(appointment);
            notifyInstructor(appointment, instructor);
        }

        return success;
    }

    public static void notifyInstructor(Appointment notifyAppointment, Instructor instructor){
    }

}
