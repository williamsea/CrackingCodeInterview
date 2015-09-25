package Shapes;

public class Square implements IShapes{
	double length;
	
	public Square(double length){
		this.length = length;
	}
	
	@Override
	public double CalcArea(){
		double area = Math.pow(length,2);
		return area;
	}
}
