public class RoadRegistryPlatform {
    static PaymentManager payment = new PaymentManager();

    public static boolean BookAppointment(LearnerDriver user, String details, String paymentInfo){
        boolean success = false;
        int amountToPay = 1234;

        success = payment.processPayment(paymentInfo, amountToPay, user);

        if(success){
            Appointment appointment = new Appointment(details);
        }

        return success;
    }

}
