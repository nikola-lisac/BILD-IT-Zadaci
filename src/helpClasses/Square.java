package helpClasses;

public class Square extends GeometricObject implements Colorable{
	
	private double side = 1; //length of the square's side
	
	/** default constructor */
	public Square(){
		
	}
	
	/** constructor with defined length of the side */
	public Square (double side){
		this.side = side;
	}
	
	/** calculating area of the square
	 * implementing getArea from GeometricObject
	 */
	public double getArea(){
		return side * side;
		
	}
	
	/**
	 * calculating perimeter of the square
	 * implemented getPerimeter from GeometricObject
	 */ 
	public double getPerimeter(){
		return side * 4;
	}

	/** implemented method from Colorable */
	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}
}
