package FlyWeight.SolutionFlyweight;


public class Circle extends Shape {
	private String label;
	
	public Circle() {
		label = "Circle";
	}

	@Override
	public void draw(int radius, String fillColour) {
       	System.out.println("Drawing a "+label+" with radius "+ radius+" by using "+fillColour+" colour");	
	}

}
