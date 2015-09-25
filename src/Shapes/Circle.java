package Shapes;

public class Circle implements IShapes{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double CalcArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

}
