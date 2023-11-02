package Inhrritance;
//Abstract program
public class AbstractProgram {
	public static void main(String[] args) {
		PhysicsTeachers1 pt=new PhysicsTeachers1();
		ChemistryTeachers1 ct=new ChemistryTeachers1();
		BiologyTeachers1 bt=new BiologyTeachers1();
		TeacherApp1 t=new TeacherApp1();
		t.accept(pt);
		System.out.println();
		t.accept(ct);
		System.out.println();
		t.accept(bt);
	}
}
//abstract class
abstract class Teachers2{
	//abstract method()
	abstract void teach();
	//abstract method()
	abstract void doExep();
}
//Child Class
class PhysicsTeachers1 extends Teachers2{
	
	public void teach() {
		System.out.println("Physics Teacher is teaching the Physics");
	}
	public void doExep()
	{
		System.out.println("Physics Teacher is doing law's Experiments");
	}
}


//Child Class
class ChemistryTeachers1 extends Teachers2 {
	@Override
	public void teach() {
		System.out.println("Chemistry Teacher  is teaching the Chemistry");
	}
	public void doExep()
	{
		System.out.println("ChemistryTeacher  is doing Chimical Experiments");
	}
}

//Child Class
class BiologyTeachers1 extends Teachers2{
	@Override
	public void teach() {
		System.out.println("Biology Teacheris teaching the Biology");
	}
	public void doExep()
	{
		System.out.println("Biology Teacher is doing  Botony Experiments");
	}
}

//This class for code compactness Class
class TeacherApp1 {
	public void accept(Teachers2 ref) {
		ref.teach();
		ref.doExep();
	}
}