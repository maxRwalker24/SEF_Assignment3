import java.util.Vector;

public class DatabaseManager {
    public Vector<Appointment> appointmentsList = new Vector<>(); //Vector holding the appointments

    public DatabaseManager(){} //Constructor

    public void addAppointment(Appointment appointment){ //Addint appointment to the vector
        appointmentsList.add(appointment);
    }
}
