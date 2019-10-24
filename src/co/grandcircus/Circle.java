package co.grandcircus;

public class Circle {
	
	

	// you need to implement the formatNumber() method first.
	// This method will format numbers to the nearest 2 decimal places.
	// Then you can call this method inside getFormattedCircumference by sending the
	// calculated Circumference.
	// The calculated Circumference is done by calling the getCircumference

	// zybook chapter 7
	private double radius;
	private double circumference;
	private double area;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		return circumference = (2 * Math.PI * radius);
		// for the value of pi, use the PI constant of the java.lang.Math class
	}
	
	public double getArea() {
		return area = (Math.PI * (radius * radius));
	}
	
	private static String formatNumber(double x) {
		return String.format("%.2f", x);
		// return formatNumber(x);
	}

	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
	
	
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	@Override // this annotation is optional
	public String toString() {
//		return String.format(
//				"\nRadius: " + radius + "\nCircumference: " + getFormattedCircumference() + "\nArea: "
//				+ getFormattedArea());
		return String.format("\nRadius: %s \nCircumference: %s \nArea: %s", formatNumber(radius),
				getFormattedCircumference(), getFormattedArea());
	}
	
}
