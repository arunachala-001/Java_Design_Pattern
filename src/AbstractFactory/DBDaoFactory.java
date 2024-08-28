package AbstractFactory;

public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public DAO createDao(String type) {
		DAO dao = null;
		if(type.equals("emp")) {
			dao = new DBEmpDao();
		} else if(type.equals("dept")) {
			dao = new DBDeptDao();
		}
		return dao;
	}

}
