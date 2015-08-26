package helpClasses;

import java.util.Date;

/**
 * GeometricObject class that implements compareTo and max methods
 * @author Nikola
 *
 */
abstract public class GeometricObject implements Comparable<GeometricObject> {
	private String color = "white";
	private boolean filled = false;
	private Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Return dateCreated */
	public Date getDateCreated() {
		return dateCreated;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

	// implementacion of compareTo and max methods

	/** Compare two GeometricObject instances by their area */
	public int compareTo(GeometricObject object) {
		if (this.getArea() > object.getArea())
			return 1;
		else if (this.getArea() < object.getArea())
			return -1;
		else
			return 0;
	}

	/** Method return greater of two GeometricObject instances by their area. */
	public static GeometricObject max(GeometricObject object1, GeometricObject object2) {
		if (object1.compareTo(object2) == 1)
			return object1;
		else
			return object2;
	}

}
