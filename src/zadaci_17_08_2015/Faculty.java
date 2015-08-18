package zadaci_17_08_2015;
/**
 * Faculty class
 * @author Nikola Lisicic
 */
public class Faculty extends Employee {

	private double officeHours;
	private String rank;

	/** Constructor creates new instance with defined data fields of the staff class and it's parent class */
	Faculty(String name, String address, String phoneNumber,
			String emailAddress, String office, double sallary,
			double officeHours, String rank) {
		
		super(name, address, phoneNumber, emailAddress, office, sallary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	/**Overriden toString method which returns name of the class and data field name of the instance */
	@Override
	public String toString(){
		return "Faculty: "+getName();
	}

	/** data field getters */
	
	double getOfficeHours() {
		return officeHours;
	}

	String getRank() {
		return rank;
	}
	
	
}
