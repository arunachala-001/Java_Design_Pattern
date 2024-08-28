package AbstractFactory;

public class XMLDaoFactory extends DaoAbstractFactory {

	@Override
	public DAO createDao(String type) {
		DAO dao = null;
		if(type.equals("emp")) {
			dao = new XMLEmpDao();
		} else if(type.equals("dept")) {
			dao = new XMLDeptDao();
		}
		return dao;
	}

}
