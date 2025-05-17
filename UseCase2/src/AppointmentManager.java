public class AppointmentManager {
    static PaymentManager payment = new PaymentManager(); //Initializing a Payment manager to manage payments
    static DatabaseManager database = new DatabaseManager(); //Initializing a database to store appointments

    public static boolean bookAppointment(LearnerDriver user, String details, Instructor instructor, String paymentInfo){
        boolean success = false;

        success = payment.pay(paymentInfo, user); //Calling the payment manager to process the payment

        if(success){ //If payment is successful:
            Appointment appointment = new Appointment(details); //Create a new appointment 
            database.addAppointment(appointment); //Add the appointment to the database
            notifyInstructor(appointment, instructor); //Notify the instructor of the new appointment
        }

        return success;
    }

    public static void notifyInstructor(Appointment notifyAppointment, Instructor instructor){ //Function to notify instructor
    }

}
