package Threading;

public class RaceConditionDemo {

	public static void main(String[] args) {
		MSWord m1=new MSWord();
		MSWord m2=new MSWord();
		MSWord m3=new MSWord();
		
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		Thread t3=new Thread(m3);
		
	
		t1.setName("Type");
		////subsidiary activity or background Activity 
		t2.setName("Save");
		//subsidiary activity or background Activity 
		t3.setName("Spellcheck");
	
		t2.setDaemon(true);
		t3.setDaemon(true);
		t2.setPriority(7);
		t3.setPriority(8);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
class MSWord implements Runnable {
	public void run() {
		if(Thread.currentThread().getName().equals("Type"))
		{
			Typeing();
		}
		else if(Thread.currentThread().getName().equals("Save"))
		{
			AutoSave();
		}
		else
		{
			SpellCheck();
		}
	}
	
	private void Typeing() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<=4;i++)
			{
				System.out.println("Typeing ........");
				Thread.sleep(5000);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	private void SpellCheck() {
		try {
			// infinite loop
			for(;;)
			{
				System.out.println("Spell Check........");
				Thread.sleep(5000);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	private void AutoSave() {
		// TODO Auto-generated method stub
		try {
			for(;;)
			{
				System.out.println("Auto Save........");
				Thread.sleep(5000);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
