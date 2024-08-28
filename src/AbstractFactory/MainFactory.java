package AbstractFactory;

public class MainFactory {

	public static void main(String[] args) {
		DaoAbstractFactory producer = DaoFactoryProducer.producer("xml");
		DAO createDao = producer.createDao("dept");
		createDao.save();
		

	}

}
