package Singleton.Factory;

public class InventoryManagement implements BackendProcess {

	@Override
	public void prepareBackend() {
		System.out.println("Preparing backend for Inventory Management");
		
	}

	@Override
	public void prepareFrontend() {
		System.out.println("Preparing Frontend for Inventory Management");
		
	}

	@Override
	public void prepareDB() {
		System.out.println("Preparing Database activity for Inventory Management");
		
	}

}
