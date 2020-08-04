package AbstractFactoryPattern;

import java.util.Scanner;

import PatternEgs.Circle;
import PatternEgs.Rectangle;
import PatternEgs.Square;

public class ShapeFactory extends AbstractFactory {

	Scanner sc=new Scanner(System.in);
	
	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		
		if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			System.out.println("\nEnter width for rectangle:");
			double w=sc.nextDouble();
			System.out.println("Enter length for rectangle:");
			double l=sc.nextDouble();
			return new AbstractFactoryPattern.Rectangle(w, l);
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			System.out.println("\nEnter size for square:");
			double s=sc.nextDouble();
			return new AbstractFactoryPattern.Square(s);
		}
		
		return null;
	}

}
