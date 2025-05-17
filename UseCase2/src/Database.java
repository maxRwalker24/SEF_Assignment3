import java.util.Vector;

public class Database {
    public Vector<Appointment> appointmentsList = new Vector<>(); //Vector holding the appointments

    public Database(){} //Constructor

    public void addAppointment(Appointment appointmentAdd){ //Addint appointment to the vector
        appointmentsList.add(appointmentAdd);
    }
}
