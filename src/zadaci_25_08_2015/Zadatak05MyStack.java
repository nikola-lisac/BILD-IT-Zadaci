package zadaci_25_08_2015;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

/**
 * (Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform
 * a deep copy of the list field.
 * 
 * Prema mojim istrazivanjima clone() metoda pravi shallow copy, sto znaci da ce
 * klonirati sve date fields objecta ako su primitivnog tipa, ali ako je data
 * field instanca neke klase kopirace samo referencu na lokaciju te instance pa
 * sam na savjet Senjina dosao do metode za pravljenje deep copy objekta metoda
 * je nadjena na:
 * http://javatechniques.com/blog/faster-deep-copies-of-java-objects/ Drugi
 * nacin bi bio copy constructor, koji bi kreirao novu instancu kao kopiju
 * postojece, ali to bi znacilo da za klasu svake instance koje bude ubacena u
 * stack moramo pisati jos jedan konstruktor sto nije optimalno rjesenje
 * 
 * @author Nikola
 *
 */
public class Zadatak05MyStack {

	public static void main(String[] args) {

		Date date = new Date(); //date instance with current date and time
		//creating original stack
		MyStack original = new MyStack();
		original.push("Nikola");
		original.push(date);
		
		// copying original stack
		MyStack copy = original.clone();
		
		System.out.println("Original stack: ");
		// printing original stack
		while (!original.isEmpty()) {
			System.out.println(original.pop().toString());
		}
		
		// making changes to the original stack
		date.setTime(156000000000l);
		original.push("Success!");
		original.push(date);
		
		System.out.println("\nPrinting changed original stack");
		// printing changed original stack
		while (!original.isEmpty()) {
			System.out.println(original.pop().toString());
		}
		
		System.out.println("\nPrinting copy of the original stack: ");
		// printing copied original stack
		while (!copy.isEmpty()) {
			System.out.println(copy.pop().toString());
		}
		
	}
}

class MyStack implements Cloneable {

	private ArrayList<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

	/**
	 * Method creates new stack with copies of objects of the calling stack
	 * 
	 * @return new stack of copies of objects
	 */
	@Override
	public MyStack clone() {
		MyStack clone = new MyStack();
		for (Object obj : this.list) {
			clone.push(copy(obj));
		}
		return clone;
	}

	/**
	 * method for deep copying the object
	 * 
	 * @param original
	 *            object to copy
	 * @return copy of the object
	 */
	public static Object copy(Object original) {
		Object objectCopy = null;
		try {
			// Write the object out to a byte array
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(original);
			out.flush();
			out.close();

			// Make an input stream from the byte array and read
			// a copy of the object back in.
			ObjectInputStream in = new ObjectInputStream(
					new ByteArrayInputStream(bos.toByteArray()));
			objectCopy = in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		return objectCopy;
	}

}