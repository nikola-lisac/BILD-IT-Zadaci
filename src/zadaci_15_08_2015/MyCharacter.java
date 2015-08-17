package zadaci_15_08_2015;

/**
 * 10.24 (Implement the Character class) The Character class is provided in the
 * Java library. Provide your own implementation for this class. Name the new
 * class MyCharacter.
 * 
 * @author Nikola Lisicic
 */
public class MyCharacter {

	char data; //character
	
	/**Counstructor */
	MyCharacter(char c){
		this.data = c;
	}
	
	/**
	 * Converting an upper case character to lower case character
	 * @return  instance with converted character to lower case
	 */
	public MyCharacter toLowerCase(){
		if(data >= 65 && data <= 90){
			return new MyCharacter((char)((int)this.data + 32));
		}
		else{
			return new MyCharacter(data);
		}
	}
	
	/**
	 * Converting an upper case character to lower case character
	 * @return  instance with converted character to lower case
	 */
	public MyCharacter toUpperCase(){
		if(data >= 97 && data <= 122){
			return new MyCharacter((char)((int)data - 32));
		}
		else{
			return new MyCharacter(data);
		}
	}
	
	/**
	 * Checking is the instance a lower case character
	 * @return true if it is a lower case character, otherwise false
	 */
	public boolean isLowerCase(){
		if(data >= 97 && data <= 122){
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Checking is the instance a upper case character
	 * @return true if it is a upper case character, otherwise false
	 */
	public boolean isUpperCase(){
		if(data >= 65 && data <= 90){
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/** Overriden toString method */
	@Override
	public String toString(){
		return data + "";
	}
	
	/** testing the methods */
	public static void main(String[] args) {
		MyCharacter c = new MyCharacter('n');
		System.out.println("Character: "+c);
		
		//testing isLowerCase and isUpperSase
		System.out.println("Is the character lower case? "+c.isLowerCase());
		System.out.println("Is the character upper case? "+c.isUpperCase());
		
		//testing toUpperCase()
		MyCharacter c1 = c.toUpperCase();
		System.out.println("Converted character "+c.toString()+" to upper case: "+c1.toString());
		
		//testing toLowerCase()
		MyCharacter c2 = c1.toLowerCase();
		System.out.println("Converted character "+c1.toString()+" to lower case: "+c2.toString());
	}

}
