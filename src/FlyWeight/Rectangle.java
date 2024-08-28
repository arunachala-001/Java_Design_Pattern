package FlyWeight;

public class Rectangle implements Shape {
	private String label;
	private int length;
	private int breadth;
	private String fillColour;
	
	public Rectangle() {
		label = "Rectangle";
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public String getFillColour() {
		return fillColour;
	}

	public void setFillColour(String fillColour) {
		this.fillColour = fillColour;
	}

	@Override
	public void draw() {
       	System.out.println("Drawing a label "+label+" with length "+ length+" and breadth "+breadth
       			+" by using "+fillColour+" colour");	
	}

}
