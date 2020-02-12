
import java.util.*; // for Scanner

public class Structural {
// constant for Earth acceleration in meters/second^2
	public static final double ACCELERATION = -9.81;
	static double velocity;
	static double angle;
	static int steps;

	public static void readings() {
		Scanner console = new Scanner(System.in);
		System.out.print("velocity (meters/second)? ");
		velocity = console.nextDouble();
		System.out.print("angle (degrees)? ");
		angle = Math.toRadians(console.nextDouble());
		System.out.print("number of steps to display? ");
		steps = console.nextInt();
		System.out.println();
	}

	public static void flightPath() {
		double xVelocity = velocity * Math.cos(angle);
		double yVelocity = velocity * Math.sin(angle);
		double totalTime = -2.0 * yVelocity / ACCELERATION;
		double timeIncrement = totalTime / steps;
		double xIncrement = xVelocity * timeIncrement;

		double x = 0.0;
		double y = 0.0;
		double t = 0.0;
		System.out.println("step\tx(m)\ty(m)\ttime(sec)");
		System.out.println("0\t0.0\t0.0\t0.0");
		for (int i = 1; i <= steps; i++) {
			t += timeIncrement;
			x += xIncrement;
			y = yVelocity * t + 0.5 * ACCELERATION * t * t;
			System.out.println(i + "\t" + round2(x) + "\t" + round2(y) + "\t" + round2(t));
		}
	}

	public static void main(String[] args) {
		System.out.println("This program computes the");
		System.out.println("trajectory of a projectile given");
		System.out.println("its initial velocity and its");
		System.out.println("angle relative to the horizontal.");
		System.out.println();
		readings();
		flightPath();
	}

	public static double round2(double n) {
		return (int) (n * 100.0 + 0.5) / 100.0;
	}
}