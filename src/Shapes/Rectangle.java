package Shapes;

public class Rectangle implements IShapes{
	double length1, length2;
	
	public Rectangle(double length1, double length2){
		this.length1 = length1;
		this.length2 = length2;
	}
	
	@Override
	public double CalcArea(){
		double area = length1 * length2;
		return area;
	}
}
