package Assignments;
import java.util.Scanner;

public class MultiSphere {

		public static void main(String args[]) {
			Scanner user = new Scanner(System.in);
			Sphere a, b;
			
			System.out.println("Enter an integer for the diameter of Sphere A:");
			a = new Sphere(user.nextInt());
			System.out.println("Enter an integer for the diameter of Sphere B:");
			b = new Sphere(user.nextInt());
			
			System.out.println("The two spheres have the diameters of: ");
			System.out.println(a.getDiameter() + " and " + b.getDiameter() + " respectively.");
			b.setDiameter(2 * a.getDiameter());
			System.out.println("Now the diameter of the 2nd Sphere is " + b.getDiameter() + " which is twice the diameter of the first.");
			System.out.println("Volume of 1st Sphere: " + a.Volume() + " Surface Area of 2nd Sphere: " + b.SurfaceArea());
		}
}
