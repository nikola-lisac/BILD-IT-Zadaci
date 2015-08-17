package zadaci_15_08_2015;

import java.util.ArrayList;
/**
 * (New string split method) The split method in the String class returns an
 * array of strings consisting of the substrings split by the delimiters. 
 * However, the delimiters are not returned. 
 * Implement the following new method that returns an array of strings 
 * consisting of the substrings split by the matching delimiters,
 * including the matching delimiters.
 * public static String[] split(String s, String regex)
 * 
 * @author Nikola Lisicic
 *
 */
public class NewSplitMethod {
	
	/**
	 * Check if defined string contains defined character
	 * @param regex  string to check for character
	 * @param ch   character for checking in the string
	 * @return     true if the string contains the character,otherwise false
	 */
	public static boolean contains(String regex, char ch){
		String bl = ch +"";
		if(bl.matches(regex)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * Creating an array of string by spliting a defined string by characters from a defined string
	 * @param s       defined string to split 
	 * @param regex   defined string which contains the characters used as delimeters to split the string s
	 * @return        array of strings created by splitting the string "s" by characters of the string "regex"
	 */
	public static String[] split(String s, String regex){
		//list which will contain substrings of the string s, splited by chars from regex
		ArrayList<String> splitStringList = new ArrayList<>();
		//string which will hold the characters until a delimeter apiers
		String currentString = "";
		
		//loop through the characters of string s
		for(int i=0;i<s.length();i++){
			//if string regex contains current character of string s used as delimeter
			if(contains(regex,s.charAt(i))){
				//if the current string length isnt 0
				if(currentString.length() !=0){
					//add current string to the list
					splitStringList.add(currentString);
					//add delimeter to the list
					splitStringList.add(s.charAt(i) + "");
					//set current string to an empty string
					currentString = "";
				}
			} else {
				//if the current char isnt a delimeter, add it to the current string
				currentString +=s.charAt(i);
				
				//if do loop is on last iteration
				if(i == s.length()-1){
					//add current string to the list
					splitStringList.add(currentString);
				}
			}
			
		}
		
		//array of strings which has the length of the size of the array list with split strings
		String[] splitString = new String[splitStringList.size()];
		//copying strings from arraylist to string array
		splitString = splitStringList.toArray(splitString);
		//return the string array with split strings
		return splitString;
		
		
	}
	
	/** test */
	public static void main(String[] args) {
		//string to be split
		String str = "Nikola1has2finished3the6goddamned7split8method9";
		//string with characters to be used as delimeters
		String regex = "[0-9]";
		
		//printing string and regex
		System.out.println("String: "+str);
		System.out.println("Regex: "+regex);
		System.out.print("Split: ");
		
		//string array of the split string str
		String[] split = split(str,regex);
		//printing elemts of array
		for(String s: split){
			System.out.print(s+" ");
		}
		
	}

}
