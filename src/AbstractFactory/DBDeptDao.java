package AbstractFactory;

public class DBDeptDao implements DAO{

	@Override
	public void save() {
		System.out.println("Data accessing for Department in Database");
		
	}

}
