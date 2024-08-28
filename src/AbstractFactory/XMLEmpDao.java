package AbstractFactory;

public class XMLEmpDao implements DAO{

	@Override
	public void save() {
		System.out.println("Data accessing for Employee in XML");
		
	}

}
