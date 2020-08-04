package AbstractFactoryPattern;

public class RoundedSquare implements Shape{
	public double size;

	public RoundedSquare(double size) {
		super();
		this.size = size;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rounded Square::draw() method.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return size*size;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(size+size);
	}

}
