package clinique;
/**
 * @ProblemStatement: Clinique Management Programme. This programme is used to manage a list of Doctors associated
 *  with the Clinique. This also manages the list of patients who use the clinique. It manages Doctors by Name, Id,
 *   Specialization and Availability (AM, PM or both). It manages Patients by Name, ID, Mobile Number and Age. The 
 *   Program allows users to search Doctor by name, id, Specialization or Availability. 
 * 
 * @author : Vishwajeet Malusare
 * */
/**
 * @aim pojo class for Appointment
 */
public class Appointment {
	
	String doctorName;
	int doctorId;
	String patientName;
	int patientId;
	String Availibility;
	String patientPhone;
	
	public Appointment() {
	}
	
	/**
	 * This block is written to make a n appointment and holds getter and setter methods
	 * */
	public Appointment(String doctorName,int doctorId,String patientName,int patientId,String patientPhone,String Availibility)
	{
		this.doctorName=doctorName;
		this.doctorId=doctorId;
		this.patientName=patientName;
		this.patientId=patientId;
		this.Availibility=Availibility;
		this.patientPhone=patientPhone;
	}
	
	public String getAvailibility() {
		return Availibility;
	}
	
	public void setAvailibility(String Availibility) {
		this.Availibility = Availibility;
	}
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}

	
}