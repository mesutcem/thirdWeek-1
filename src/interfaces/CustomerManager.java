package interfaces;

public class CustomerManager {
	
	private ICustommerDal custommerDal;
	
	public CustomerManager(ICustommerDal custommerDal) {
		this.custommerDal = custommerDal;
	}
	public void add() {
		custommerDal.add();
	}
}
