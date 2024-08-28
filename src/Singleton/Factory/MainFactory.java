package Singleton.Factory;

public class MainFactory {

	public static void main(String[] args) {
		FactoryForBackendProcess FB = new FactoryForBackendProcess();
		
		FB.orderSoftware("Library");
	}
}
