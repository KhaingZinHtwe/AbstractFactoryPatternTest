package AbstractFactoryPattern;

import java.util.Scanner;

import PatternEgs.Shape;
import PatternEgs.ShapeFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char response;
		do {
		System.out.println("Enter true or false whenever your shape is rounded");
		String rounded=sc.nextLine();
		
		AbstractFactory shapeFactory=FactoryProducer.getFactory(rounded.toLowerCase());
		
		System.out.println("Enter type of shape(rectangle,square):");
		String shape=sc.nextLine();
		
		AbstractFactoryPattern.Shape s=shapeFactory.getShape(shape.toUpperCase());
		s.draw();
		System.out.println("Area of circle:"+s.getArea());
		System.out.println("Perimeter of circle:"+s.getPerimeter());
		
		System.out.println("Enter continue(y/n):");
		response=sc.nextLine().charAt(0);
		
		}while(response=='y');
		
//		AbstractFactory shape=FactoryProducer.getFactory(false);
//		
//		Shape s1=shape.getShape("RECTANGLE");
//		s1.draw();
//		
//		Shape s2=shape.getShape("SQUARE");
//		s2.draw();
//		
//		AbstractFactory  shape1=FactoryProducer.getFactory(true);
//		
//		Shape s3=shape1.getShape("RECTANGLE");
//		s3.draw();
//		
//		Shape s4=shape1.getShape("SQUARE");
//		s4.draw();
	}

}
