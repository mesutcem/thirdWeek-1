package interfaces;

public class MySqlCustomerDal implements ICustommerDal, IRepository {

	@Override
	public void add() {
		System.out.println("My Sql eklendi");
		
	}

}
