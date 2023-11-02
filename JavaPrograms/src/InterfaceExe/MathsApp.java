package InterfaceExe;

public class MathsApp {
	public static void main(String[] args) {
		MyCalculator c1=new MyCalculator();
		c1.add();
		c1.div();
		c1.mul();
	}
}
//class Maths{
//	public void accept(Calculator ref) {
//		ref.mul();
//		ref.div();
//		//ref.add(); it throws error 
//		//down casting
//		((MyCalculator)(ref)).add();
//		
//	}
//}