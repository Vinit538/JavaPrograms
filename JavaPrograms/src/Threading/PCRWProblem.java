package Threading;

public class PCRWProblem {
	public static void main(String[] args) {
		Factory factory=new Factory();
		Producer p=new Producer(factory);
		Consumer c=new Consumer(factory);
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
	}
}
class Producer implements Runnable{

	Factory ref;
	
	public Producer(Factory ref) {
		super();
		this.ref = ref;
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			ref.put(i++);
		}
		
	}
	
}
class Factory{

	int x;
	public void put(int j) {
		x=j;
		System.out.println("I have put "+j+" in x");
	}
	
	
	public void get()
	{
		System.out.println("I have got "+x+" from x");
	}
}
class Consumer implements Runnable{

	Factory ref;
	
	public Consumer(Factory ref)
	{
		this.ref=ref;
	}
	
	@Override
	public void run() {
		while(true)
		{
			ref.get();
		}
	}
}
