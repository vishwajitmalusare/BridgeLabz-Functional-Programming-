/**
 * @ProblemStatement: Clinique Management Programme. This programme is used to manage a list of Doctors associated
 *  with the Clinique. This also manages the list of patients who use the clinique. It manages Doctors by Name, Id,
 *   Specialization and Availability (AM, PM or both). It manages Patients by Name, ID, Mobile Number and Age. The 
 *   Program allows users to search Doctor by name, id, Specialization or Availability. 
 * 
 * @author : Vishwajeet Malusare
 * */
package clinique;
import java.text.ParseException;
import java.util.Date;

/**
 *  @aim runner class for clinique management
 *
 */
public class Clinique {
	static Date date;
	public static void main(String[] args) throws ParseException {
		int choice = 0;
		do {
			System.out.println(
					"\n1. Add Doctor or Patient or fix an Appointment\n2. Search doctor\n3. Display details\n4. Close");
			choice = Utility.getInt();
			switch (choice) {
			case 1:
				 // to add doctor or patients details or to fix appointment 
				new DoctorPatientImplementation().operation();
				break;
			case 2:
				new SearchingImplementation().operation(); // to search doctor details
				break;
			case 3:
				new InformationDisplayImplementation().operation(); 	// to display information
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		} while (choice != 4);
	}
}
