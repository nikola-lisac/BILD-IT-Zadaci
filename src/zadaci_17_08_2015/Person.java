package zadaci_17_08_2015;
/**
 * Person class
 * @author Nikola Lisicic
 */
public class Person {

	/** Self-explanitory data fields */
	private String name; 
	private String address;
	private String phoneNumber;
	private String emailAddress;

	Person() {

	}

	/** Construct which creates and instance with defined data fields */
	public Person(String name, String address, String phoneNumber,
			String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	/**Overriden toString method which returns name of the class and data field name of the instance */
	@Override
	public String toString() {
		return "Person: " + name;
	}

	/** Getters for data fields */

	String getName() {
		return name;
	}

	String getAddress() {
		return address;
	}

	String getPhoneNumber() {
		return phoneNumber;
	}

	String getEmailAddress() {
		return emailAddress;
	}

}
