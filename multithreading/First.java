package multithreading;

class A extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class First {

	public static void main(String[] args) {
		
		A obj1 = new A();
		A obj2 = new A();
		obj1.start();
		obj2.start();
		
	}

}
