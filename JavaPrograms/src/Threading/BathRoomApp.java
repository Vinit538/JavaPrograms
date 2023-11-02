package Threading;

public class BathRoomApp {
	public static void main(String[] args) {
		try {
		BathRoom b=new BathRoom();
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		Thread t3=new Thread(b);
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Other");
		t1.start();
		t2.start();
		t3.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class BathRoom implements Runnable {

	//synchronized is lock the resource
	@Override
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " is Entering Bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " is Using Bathroom");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " is Exiting Bathroom");
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

}