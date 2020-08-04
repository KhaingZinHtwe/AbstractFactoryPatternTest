package AbstractFactoryPattern;

public class Rectangle implements Shape {
	public double width,length;

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("Inside Rectangle::draw() method.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+length);
	}

}
