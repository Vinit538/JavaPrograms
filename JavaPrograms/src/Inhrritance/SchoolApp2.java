package Inhrritance;

public class SchoolApp2 {
	public static void main(String[] args) {
		PhysicsTeachers pt =new PhysicsTeachers();
		ChemistryTeachers ct=new ChemistryTeachers();
		BiologyTeachers bt=new BiologyTeachers();
		TeacherApp t=new TeacherApp();
		t.accept(pt);
		System.out.println("-----------------------------------------------------");
		t.accept(ct);
		System.out.println("-----------------------------------------------------");
		t.accept(bt);
	}
}
//Parent Class
class Teachers {
	public void markattendence() {
		System.out.println("Teacher is marking the attedence");
	}
	public void teach() {
		System.out.println("Teacher is teaching");
	}
	public void doExep()
	{
		System.out.println("Teacher is doing Experiments");
	}
}

//Child Class
class PhysicsTeachers extends Teachers{
	
	public void teach() {
		System.out.println("Physics Teacher is teaching the Physics");
	}
	public void doExep()
	{
		System.out.println("Physics Teacher is doing law's Experiments");
	}
}


//Child Class
class ChemistryTeachers extends Teachers {
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
class BiologyTeachers extends Teachers{
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
class TeacherApp {
	public void accept(Teachers ref) {
		ref.markattendence();
		ref.teach();
		ref.doExep();
	}
}
