package Inhrritance;

public class SchoolApp {
	public static void main(String[] args) {
		PhysicsTeacher pt=new PhysicsTeacher();
		pt.MarkAttendence();
		pt.teach();
		pt.doPhyExp();
		System.out.println();
		ChemistryTeacher ct=new ChemistryTeacher();
		ct.MarkAttendence();
		ct.teach();
		ct.doCheExp();
		System.out.println();
		BiologyTeacher bt=new BiologyTeacher();
		bt.MarkAttendence();
		bt.teach();
		bt.doBioExp();
	}
}
//parent class 
class Teacher
{
	//parent behaviors 
	public void MarkAttendence() {
		System.out.println("Teacher is Marking Attendence");
	}
	//parent behaviors
	public void teach() {
		System.out.println("Teacher is Teaching");
	}
}
//child class 
class PhysicsTeacher extends Teacher
{
	//inherited   but overridden behavior
	public void teach() {
		System.out.println("Physics Teacher is Teaching Physics");
	}
	//Specialized Behavior
	public void doPhyExp() {
		System.out.println("Physics Teacher is doing law's Exp");
	}
}
//child class
class ChemistryTeacher extends Teacher
{
	//inherited  but overridden behavior
	public void teach() {
		System.out.println(" Chemistry Teacher is Teaching Chemistry");
	}
	//Specialized Behavior
	public void doCheExp() {
		System.out.println("Chemistry Teacher is doing Chemical Exp");
	}
}
//child class
class BiologyTeacher extends Teacher
{
	//inherited  but overridden behavior
	public void teach() {
		System.out.println("Biology Teacher is Teaching Botony");
	}
	//Specialized Behavior
	public void doBioExp() {
		System.out.println("Biology Teacher is doing Botony Exp");
	}
}