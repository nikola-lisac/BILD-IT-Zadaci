package zadaci_12_08_2015;

public class StackOfIntegers {
	 private int[] elements;
     private int size;
     public static final int DEFAULT_CAPACITY = 16;
    
     /** Construct a stack with the default capacity 16 */
     public StackOfIntegers() {
             this (DEFAULT_CAPACITY);
     }
    
     /** Construct a stack with the specified maximum capacity */
     public StackOfIntegers(int capacity) {
             elements = new int[capacity];
     }
    
     /**
      * Push a new integer to the top of the stack
      * @param value  new integer to be pushed to the top of the stack
      */
     public void push(int value) {
             if (size >= elements.length) {
                     int[] temp = new int[elements.length * 2];
                     System.arraycopy(elements, 0, temp, 0, elements.length);
                     elements = temp;
             }
            
             elements[size++] = value;
     }
    
     /**
      *  Return the top element from the stack 
      * @return top element
      */
     public int pop() {
             return elements[--size];
     }
    
     /**
      * Test whether the stack is empty
      * @return true if it is empty, false if it isn't
      */
     public boolean empty() {
             return size == 0;
     }
    
     /**
      * 
      * @return number of elements in the element array
      */
     public int getSize() {
             return size;
     }
}
