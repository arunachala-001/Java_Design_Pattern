package FlyWeight.SolutionFlyweight;

public class Paint {

	public void render(int noOfShapes) {
		Shape shapes = null;

		for(int i=1; i<=noOfShapes; i++) {
			if(i%2==0) {
				shapes = ShapeFactory.getShapes("circle");
				shapes.draw(i, "White");
			} else {
				shapes = ShapeFactory.getShapes("rectangle");
				shapes.draw(i, i+2, "Yellow");
			}
		}
	}
}
