package zadaci_26_08_2015;

/**
 * (Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
 * to add a clone method to perform a deep copy on the students field.
 * @author Nikola
 *
 */
public class Zadatak05Course {

	public static void main(String[] args) {
		Course course = new Course("Computer Science"); // new course
		//adding students to the course
		course.addStudent("Blake");
		course.addStudent("Adam");
		course.addStudent("Anders");
		String[] studentsCopy = course.clone(); // cloning students array
		
		//printing students in the course
		System.out.println("Students: ");
		for(int i = 0; i<course.getNumberOfStudents();i++){
			System.out.print(course.getStudents()[i] + " ");
		}
		
		// printing copy of students
		System.out.println("\nCopy of students: ");
		for(String copy: studentsCopy){
			System.out.print(copy + " ");
		}
	}

}

class Course implements Cloneable {
	
		protected String courseName; // name of the course
		protected String[] students = new String[100]; // list of students which attend the course
		protected int numberOfStudents; // number of students which attend the course

		/** Constructor which creates an instance with defined name of the course */
		public Course(String courseName) {
			this.courseName = courseName;
		}

		/**
		 * Adding a student to the course
		 * @param student  name of the student
		 */
		public void addStudent(String student) {
			students[numberOfStudents] = student;
			numberOfStudents++;
		}

		/**
		 * Method return the list of students in the course
		 * @return list of students
		 */
		public String[] getStudents() {
			return students;
		}

		/**
		 * Method returns number of students in the course
		 * @return number of students
		 */
		public int getNumberOfStudents() {
			return numberOfStudents;
		}

		/**
		 * Method returns the name of the course
		 * @return the name of the course
		 */
		public String getCourseName() {
			return courseName;
		}
		
		/** Implemented clone method which performs a deep copy of Students array */
		@Override
		public String[] clone(){
			String[] clone = new String[numberOfStudents];
			for(int i = 0; i<numberOfStudents;i++){
				if(students[i]!=null){
				clone[i] = students[i];
				}
			}
			return clone;
		}
}