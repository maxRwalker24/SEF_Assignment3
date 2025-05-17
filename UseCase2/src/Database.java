import java.util.Vector;

public class Database {
    public Vector<Appointment> appointmentsList = new Vector<>();

    public Database(){}

    public void addAppointment(Appointment appointmentAdd){
        appointmentsList.add(appointmentAdd);
    }
}
