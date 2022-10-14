package abstractClasses;

public abstract class GameCalculator {
	public abstract void calculate();
	
	public final void gameOver() {
		System.out.println("Yandın ay aman ay aman");
	}
}
