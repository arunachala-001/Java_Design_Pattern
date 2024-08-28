package FlyWeight;

public class Paint {

	public void render(int noOfShapes) {
		Shape[] shapes = new Shape[noOfShapes+1];
		
		for(int i=1; i<=noOfShapes; i++) {
			if(i%2==0) {
				shapes[i] = new Circle();
				((Circle) shapes[i]).setRadius(i);
				((Circle) shapes[i]).setFillColour("Blue");
				shapes[i].draw();
			} else {
				shapes[i] = new Rectangle();
				((Rectangle) shapes[i]).setLength(i);
				((Rectangle) shapes[i]).setBreadth(i+2);
				((Rectangle) shapes[i]).setFillColour("Green");
				shapes[i].draw();
				
			}
		}
	}
}
