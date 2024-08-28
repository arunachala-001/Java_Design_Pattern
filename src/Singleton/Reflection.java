package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesignBasics db = DesignBasics.getInstance();
		DesignBasics db1 = null;
		
		Constructor[] declaredConstructors = DesignBasics.class.getDeclaredConstructors();
		for(Constructor constructor : declaredConstructors) {
			constructor.setAccessible(true);
			try {
				db1 = (DesignBasics) constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(db.hashCode());
		System.out.println(db1.hashCode());

	}

}
