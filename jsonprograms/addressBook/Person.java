/**
 * @ProblemStatement: Create Object Oriented Analysis and Design of a simple Address Book Problem.
 * 
 * @author: Vishwajeet Malusare
 * */
package addressBook;

/**
 * This class written to maintain all getter setter methods
 * */
public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;

	/**
	 * This methos written to set the data of person
	 * */
	public Person() {

	}

	public Person(String firstName, String lastName, String address, String city, String state, String zip,
		String phone) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
		setState(state);
		setCity(city);
		setZip(zip);
		setPhone(phone);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void updatePerson(String address, String city, String state, String zip, String phone)
	{
		
	}
}
