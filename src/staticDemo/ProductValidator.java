package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("yapıcı static çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
}