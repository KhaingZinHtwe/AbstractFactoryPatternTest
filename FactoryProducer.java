package AbstractFactoryPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String rounded) {
		if(rounded.equals("true")) {
			return new RoundedShapeFactory();
		}else {
			return new ShapeFactory();
		}
	}

}
