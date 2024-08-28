package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DesignBasics db = new DesignBasics(); it will throw an error bcz the constructor was in private 
		DesignBasics db = DesignBasics.getInstance();
		DesignBasics db1 = DesignBasics.getInstance();
		System.out.println(db);
		System.out.println(db == db1); //both obj denoted same class methods.
		
		DesignBasics multithread = DesignBasics.getInstanceForMultipleThread();
		DesignBasics multithread1 = DesignBasics.getInstanceForMultipleThread();
		System.out.println("For Multiple threading "+multithread);
		System.out.println(multithread == multithread1);
		

	}

}
