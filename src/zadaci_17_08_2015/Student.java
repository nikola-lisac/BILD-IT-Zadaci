package zadaci_17_08_2015;

public class Student extends Person {
	
	//all statuses a student can have
	private static final String[] STUDENT_STATUS = { "freshman", "sophomore",
			"junior", "senior" };
	
	//status of a student (defaut freshman)
	private String status = STUDENT_STATUS[0];

	
	/**Constructor creates new instance with dafined data fields, including the fields in super class person */
	Student(String name, String address, String phoneNumber,
			String emailAddress, int status) {

		super(name, address, phoneNumber, emailAddress);
		this.status = STUDENT_STATUS[status];
	}

	/** overriden toString method return name of the class and data field name of an instance */
	@Override
	public String toString() {
		return "Student: " + getName();
	}
	

	/** getter for status */
	String getStatus() {
		return status;
	}

}
