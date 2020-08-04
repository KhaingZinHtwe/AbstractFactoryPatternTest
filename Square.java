/**
 * 
 */
package AbstractFactoryPattern;

/**
 * @author Lenovo
 *
 */
public class Square implements Shape {
	public double size;

	public Square(double size) {
		super();
		this.size = size;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("Inside Square::draw() method.");
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
