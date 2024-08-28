package AbstractFactory;

public class XMLDeptDao implements DAO{

	@Override
	public void save() {
		System.out.println("Data accessing for Department in XML");
		
	}

}
