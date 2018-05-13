package Assignments;

public class Sphere {
	private int diameter;
	private double radius, surfArea, volume; 
	
	public Sphere(int initLength)	{
		diameter = initLength;
		radius = diameter / 2.0;
	}
	
	public int getDiameter() {
		return diameter;
	}
	
	public void setDiameter(int newLength) {
		diameter = newLength;
		radius = diameter / 2.0;
	}
	
	public double Volume() {
		volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
	public double SurfaceArea() {
		surfArea = 4.0 * Math.PI * Math.pow(radius, 2);
		return surfArea;
	}
	
	public String toString() {
		return getDiameter() + " " + Volume() + " " + SurfaceArea();
	}
}
