import java.text.DecimalFormat;

import java.util.*;

public class Main

{

	public static void main(String[] args) 

	{

		int ch,len,bre,si,ra;

		double area;

		Scanner sc=new Scanner(System.in);

		DecimalFormat df=new DecimalFormat("0.00");

		

		System.out.println("1. Rectangle\n2. Square\n3. Circle\nArea Calculator --- Choose your shape");

		ch=sc.nextInt();

		Shape objshape=new Shape();

		switch(ch)

		{

		case 1:System.out.println("Enter length and breadth:");

			   len=sc.nextInt();

			   bre=sc.nextInt();

			   //Shape objshape=new Shape();

			   objshape.setShapeName("Rectangle");

			   Rectangle objrec=new Rectangle(len,bre);

			   area=objrec.calculateArea();

			   System.out.println("Area of Rectangle is:"+df.format(area));

			   break;

		case 2:System.out.println("Enter side:");

			   si=sc.nextInt();

			   //Shape objshape=new Shape();

			   objshape.setShapeName("Square");

			   Square objsq=new Square(si);

			   area=objsq.calculateArea();

			   System.out.println("Area of Square is:"+df.format(area));

			   break;

		case 3:System.out.println("Enter Radius:");

			   ra=sc.nextInt();

			   //Shape objshape=new Shape();

			   objshape.setShapeName("Circle");

			   Circle objcr=new Circle(ra);

			   area=objcr.calculateArea();

			   System.out.println("Area of Circle is:"+String.format("%.2f",area));

			   break;	   

			   

		}

	}




}