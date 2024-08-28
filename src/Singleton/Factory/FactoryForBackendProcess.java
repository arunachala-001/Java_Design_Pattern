package Singleton.Factory;

public class FactoryForBackendProcess {

	public BackendProcess orderSoftware(String type) {
		BackendProcess Bp = null;
		
		if(type.equals("Inventory")) {
			Bp = new InventoryManagement();
		} else if(type.equals("Library")) {
			Bp = new LibraryManagement();
		}
		
		Bp.prepareBackend();
		Bp.prepareFrontend();
		Bp.prepareDB();
		
		return Bp;
	}
}
