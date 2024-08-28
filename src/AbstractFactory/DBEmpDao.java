package AbstractFactory;

public class DBEmpDao implements DAO{

	@Override
	public void save() {
		System.out.println("Data accessing for Employee in Database");
		
	}

}
