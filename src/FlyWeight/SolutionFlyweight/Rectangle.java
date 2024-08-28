package FlyWeight.SolutionFlyweight;

public class Rectangle extends Shape {
	private String label;
	
	public Rectangle() {
		label = "Rectangle";
	}

	

	@Override
	public void draw(int length, int breadth, String fillColour) {
       	System.out.println("Drawing a label "+label+" with length "+ length+" and breadth "+breadth
       			+" by using "+fillColour+" colour");	
	}

}
