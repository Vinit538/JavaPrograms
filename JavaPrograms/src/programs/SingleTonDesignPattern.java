package programs;

public class SingleTonDesignPattern {
	
	public static void main(String[] args) {
		PrimeMinister modi1=PrimeMinister.getObject();
		System.out.println(modi1.count+" : "+modi1);
		PrimeMinister modi2=PrimeMinister.getObject();
		System.out.println(modi2.count+" : "+modi2);
		PrimeMinister modi3=PrimeMinister.getObject();
		System.out.println(modi3.count+" : "+modi3);
	}
	
}
class PrimeMinister
{
	//reference  it hold address of object
	static PrimeMinister ref=null;
	static int count=0;

	//private constructor 
	private PrimeMinister() {
		count++;
	}
	//it is method it return reference of object
	static public PrimeMinister getObject()
	{
		// it check the reference is null or not
		if(ref==null)
		{
			//if null it allow to create object
			ref=new PrimeMinister();
			return ref;
		}
		//else it return old reference 
		return ref;
	}
}
