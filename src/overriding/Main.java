package overriding;

public class Main {

	public static void main(String[] args) {
			BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(),
																	   new TarimKrediManager(),
																	   new StudentCreditManager()};
			
			for(BaseKrediManager krediManager : krediManagers) {
				System.out.println(krediManager.calculate(1000));
			}
	}

}
