package Singleton;

public class TestEnum {

	public static void main(String[] args) {
		EnumForSingleton singleton = EnumForSingleton.INSTANCE;
		singleton.getName();
		singleton.setName("Arun");
		System.out.println(singleton.getName());
		System.out.println(singleton);
	}
}
