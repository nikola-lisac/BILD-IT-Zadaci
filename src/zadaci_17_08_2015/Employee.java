package zadaci_17_08_2015;

import helpClasses.MyDate; //imported custom class MyDate

/**
 * Employee class
 * @author Nikola Lisicic
 */
public class Employee extends Person {
	
	private String office;
	private double sallary;
	private MyDate dateHired; //MyDate instance which holds the date the employee has been hired
	
	/** Constructor creates new instance with defined data fields of the staff class and it's parent class */
	Employee(String name, String address, String phoneNumber,
			String emailAddress,String office,double sallary){
		
		super(name, address, phoneNumber, emailAddress);
		
		this.office = office;
		this.sallary = sallary;
		dateHired = new MyDate();
	}
	
	/**Overriden toString method which returns name of the class and data field name of the instance */
	@Override
	public String toString() {
		return "Employee: " + getName();
	}

	/** Getters for data fields */
	
	String getOffice() {
		return office;
	}

	double getSallary() {
		return sallary;
	}

	MyDate getDateHired() {
		return dateHired;
	}

	
}
