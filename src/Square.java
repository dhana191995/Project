public class Square extends Shape

{

	private int side;

	Square(int s)

	{

		side=s;

		shapeName="Square";

	}

	double calculateArea()

	{

		double ar;

		ar=side*side;

		return ar;

	}

}