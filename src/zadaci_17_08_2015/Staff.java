package zadaci_17_08_2015;

/** Staff class */
public class Staff extends Employee {
	private String title;

	/** Constructor creates new instance with defined data fields of the staff class and it's parent class */
	Staff(String name, String address, String phoneNumber, String emailAddress,
			String office, double sallary, String title) {
		
		super(name, address, phoneNumber, emailAddress, office, sallary);
		this.title = title;
	}
	
	/**Overriden toString method which returns name of the class and data field name of the instance */
	@Override
	public String toString() {
		return "Staff: " + getName();
	}

	/** title getter */
	String getTitle() {
		return title;
	}

	
}
