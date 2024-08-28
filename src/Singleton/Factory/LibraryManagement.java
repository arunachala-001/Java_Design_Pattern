package Singleton.Factory;

public class LibraryManagement implements BackendProcess {

	@Override
	public void prepareBackend() {
		System.out.println("Preparing backend for Library Management");
		
	}

	@Override
	public void prepareFrontend() {
		System.out.println("Preparing Frontend for Library Management");
		
	}

	@Override
	public void prepareDB() {
		System.out.println("Preparing Database activity for Library Management");
		
	}

}
