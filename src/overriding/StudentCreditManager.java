package overriding;

public class StudentCreditManager extends BaseKrediManager {
		public double calculate(double amount) {
			return amount * 1.2;
		}
}
