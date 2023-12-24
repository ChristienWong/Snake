package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class BodySegment {

	private double x, y, size;
	private Color color;
	
	public BodySegment(double x, double y, double size) {
		this.x=x;
		this.y=y;
		this.size=size;
	}
	public double getSize(){
		return size;
	}
	public double setX(double x) {
		this.x=x;
		return x;
	}
	public double setY(double y) {
		this.y=y;
		return y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	
	/**
	 * Draws the segment
	 */
	public void draw() {
		//FIXME
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, size);
	}
	
}
