public class Rectangle extends Shape

{

	private int length,breadth;

	Rectangle(int l,int b)

	{

		length=l;

		breadth=b;

		shapeName="Rectangle";

	}

	double calculateArea()

	{

		double ar;

		ar=length*breadth;

		return ar;

	}

}