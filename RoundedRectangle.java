package AbstractFactoryPattern;

public class RoundedRectangle implements Shape {
	public double width,length;

	public RoundedRectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("Inside Rounded Rectangle::draw() method.");
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
