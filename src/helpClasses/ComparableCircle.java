package helpClasses;

/**
 * Since circle inherits Comparable interface from Geometric Object
 * there's no need to write another circle class just to implement comparable in this class
 * @author Nikola
 *
 */
public class ComparableCircle extends Circle {
	
	/** Default construct which calls Circle constructor */
	public ComparableCircle(double radius) {
		super(radius);
	}

	/**
	 * comparing two ComparableCircle instances by their area
	 */
	public int compareTo(ComparableCircle object) {
		if (this.getArea() > object.getArea())
			return 1;
		else if (this.getArea() < object.getArea())
			return -1;
		else
			return 0;
	}
}
