package Singleton;

public class DesignBasics {

	private static DesignBasics designBasics;
	
	private DesignBasics() {
		
	}
	
	public static DesignBasics getInstance() {
		if(designBasics == null) {
			designBasics = new DesignBasics();
		}
		return designBasics;
	}
	
	//For Multiple threads we have to create an instance only one time.
	public static DesignBasics getInstanceForMultipleThread() {
		synchronized(DesignBasics.class) {
			if(designBasics == null) {
				designBasics = new DesignBasics();
			}
		}
		
		return designBasics;
	}
	
}
