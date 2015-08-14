package zadaci_13_08_2015;

import helpClasses.MyPoint;

import java.awt.geom.Line2D;
/**
 * Zadatak br. 10.12
 * @author Nikola Lisicic
 *
 */
public class Triangle2D {

	private MyPoint p1; //first point of the triangle
	private MyPoint p2; //second point of the triangle
	private MyPoint p3; //third point of the triangle

	/** default class counstructor
	Triangle2D() {
		p1 = new MyPoint(0, 0);
		p2 = new MyPoint(1, 2);
		p3 = new MyPoint(2, 5);
	}

	/** Class constructor with defined points of the triangle */
	Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	/**
	 * Calculating area of the triangle
	 * @return area
	 */
	double getArea() {

		double side1 = p1.distance(p2);
		double side2 = p3.distance(p2);
		double side3 = p3.distance(p1);

		double s = (side1 + side2 + side3) / 2;// half-perimeter
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// vracanje povrsine
		return area;

	}

	/**
	 * Calculating perimeter of the triangle
	 * @return perimeter
	 */
	double getPerimeter() {

		double side1 = p1.distance(p2);
		double side2 = p3.distance(p2);
		double side3 = p3.distance(p1);

		return side1 + side2 + side3;
	}

	/**
	 * Checking if the specified point (MyPoint p) is inside a calling Triangle instance
	 * @param p  specified point 
	 * @return true if it is inside, false if it isnt
	 */
	boolean contains(MyPoint p) {

		double triangleArea = this.getArea();

		//new triangle consisted of p,p1,p2
		Triangle2D subTriangleOne = new Triangle2D(p, p1, p2);
		//area of the that triangle
		double subAreaOne = subTriangleOne.getArea();

		//new triangle consisted of p,p2,p3
		Triangle2D subTriangleTwo = new Triangle2D(p, p2, p3);
		//area of the that triangle
		double subAreaTwo = subTriangleTwo.getArea();

		//new triangle consisted of p,p1,p3
		Triangle2D subTriangleThree = new Triangle2D(p, p1, p3);
		//area of the that triangle
		double subAreaThree = subTriangleThree.getArea();

		//condition for containing
		if (Math.abs(subAreaOne + subAreaTwo + subAreaThree) - triangleArea <= 0.5) {
			return true;
		} else {
			return false;
		}

	

	}

	/**
	 * Check if calling instance contains specified triangle instance
	 * @param t  specified Triangle2D instance
	 * @return  true if the calling triangle does contain specified instance, false if it doesn't
	 */
	boolean contains(Triangle2D t) {
		// if all three points of the triangle are inside the triangle, then the
		// whole triangle is inside
		return this.contains(t.p1) && this.contains(t.p2)
				&& this.contains(t.p3);
	}

	/**
	 * Check if two triangles overlap
	 * @param t  specified triangle object to check for overlaping with calling instance of Triangle2D
	 * @return true if they overlap, false if they dont
	 */
	boolean overlaps(Triangle2D t) {
		//side 1 of the triangle
		Line2D l1 = new Line2D.Double(this.p1.getX(), this.p1.getY(),
				this.p2.getX(), this.p2.getY());
		//side 2 of the triangle
		Line2D l2 = new Line2D.Double(this.p1.getX(), this.p1.getY(),
				this.p3.getX(), this.p3.getY());
		//side 3 of the triangle
		Line2D l3 = new Line2D.Double(this.p2.getX(), this.p2.getY(),
				this.p3.getX(), this.p3.getY());
		
		//side 1 of the triangle from the parametar
		Line2D tL1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(),
				t.p2.getY());
		//side 2 of the triangle from the parametar
		Line2D tL2 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(),
				t.p3.getY());
		//side 3 of the triangle from the parametar
		Line2D tL3 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(),
				t.p3.getY());
		
		//if any of the sides of the first triangle intersects any of the sides of parametar triangle
		//the triangles overlap
		if (l1.intersectsLine(tL1) || l1.intersectsLine(tL2)
				|| l1.intersectsLine(tL3) || l2.intersectsLine(tL1)
				|| l2.intersectsLine(tL2) || l2.intersectsLine(tL3)
				|| l3.intersectsLine(tL1) || l3.intersectsLine(tL2)
				|| (l3.intersectsLine(tL3))) {
			return true;
		} else {
			return false;
		}

	}

	
	/** Getters and setters */
	
	MyPoint getP1() {
		return p1;
	}

	void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	MyPoint getP2() {
		return p2;
	}

	void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	MyPoint getP3() {
		return p3;
	}

	void setP3(MyPoint p3) {
		this.p3 = p3;
	}

	/** main method */
	public static void main(String[] args) {
		// triangle object
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2),
				new MyPoint(4.2, 3), new MyPoint(5, 3.5));

		//print area and perimetar
		System.out.println("Area of the triangle: " +t1.getArea()+"\nPerimeter of the triangle: " + t1.getPerimeter());
		// check if the triangle contains a point
		System.out.println("t1 contains (3,3)?  "
				+ t1.contains(new MyPoint(3, 3)));

		// check if triangle t1 contains given triangle
		System.out.println("t1 contains triangle: (2.9,2), (4,1), (1, 3.4)? "
				+ t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(
						4, 1), new MyPoint(1, 3.4))));

		// check if triangle t1 overlaps given triangle
		System.out.println("t1 overlap triangle: (2,5.5), (4,-3), (2, 6.5)? "
				+ t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(
						4, -3), new MyPoint(2, 6.5))));

		
	}

}
