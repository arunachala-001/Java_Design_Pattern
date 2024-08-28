package FlyWeight.SolutionFlyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	public static Map<String, Shape> shapes = new HashMap<>();   //key type and value is Shape. Ex <circle, draw()>
	
	public static Shape getShapes(String type) {
		Shape shape = null;
		if(shapes.get(type) != null) {
			shape = shapes.get(type);
		} else {
			if(type.equals("circle")) {
				shape = new Circle();
			} else if(type.equals("rectangle")) {
				shape = new Rectangle();
			}
			shapes.put(type, shape);
		}
		
		return shape;
	}
}
