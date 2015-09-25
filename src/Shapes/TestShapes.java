package Shapes;

public class TestShapes {
	public static void main(String[] args){
		Circle myCircle = new Circle(3);
		Rectangle myRectangle = new Rectangle(2,5);
		Square mySquare = new Square(5);
		
		double areaCircle = myCircle.CalcArea();
		double areaRectangle = myRectangle.CalcArea();
		double areaSquare = mySquare.CalcArea();
		
		System.out.print("Area of Circle is " + areaCircle + "\n");
		System.out.print("Area of Rectangle is " + areaRectangle + "\n");
		System.out.print("Area of Square is " + areaSquare + "\n");
	}
}
