package FlyWeight;


public class Circle implements Shape {
	private String label;
	private int radius;
	private String fillColour;
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getFillColour() {
		return fillColour;
	}

	public void setFillColour(String fillColour) {
		this.fillColour = fillColour;
	}

	public Circle() {
		label = "Circle";
	}

	@Override
	public void draw() {
       	System.out.println("Drawing a label "+label+" with radius "+ radius+" by using "+fillColour+" colour");	
	}

}
