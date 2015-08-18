package zadaci_17_08_2015;
/**
 *  Write a test program that creates a Person, Student, Employee, Faculty, and Staff, 
 *  and invokes their toString() methods.
 * @author Nikola Lisicic
 *
 */
public class Zadatak2 {

	public static void main(String[] args) {
		
		//instances of every class
		Person person = new Person("Nikola","Doboj 257","065111222","nikola@blabla");
		Student student = new Student("Senjin","Doboj bb","066222111","senjin@blabla",3);
		Employee employee = new Employee("Marko","Derventa bb","065065065","marko@blabla","office101",1500.0);
		Faculty faculty = new Faculty("Dejan","Prnjavor bb","012012012","dejan@blabla","ofice105",2500.0,8.0,"proffesor");
		Staff staff = new Staff("Goran","Doboj bb"," 000111222","goran@blabla","office200",900.0,"administrator");
		
		//toString of every instance
		System.out.println(person);
		System.out.println(student);
		System.out.println(employee);
		System.out.println(faculty);
		System.out.println(staff);
		
	}

}
