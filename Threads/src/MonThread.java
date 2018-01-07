
public class MonThread extends Thread {

	public MonThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print(this.getName() + " ");
		}
	}
}