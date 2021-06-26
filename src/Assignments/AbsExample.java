package Assignments;

abstract class MNC {
	int var;
	MNC(){
		
	}
	public void setVar(int i) {
		var =i;
	}
	abstract void reserve();
	abstract void dereserve();
}

abstract class Infosys extends MNC{
	void reserve() {
		System.out.println("calling reserve method");
	}
}
	
class Hello extends Infosys{

	@Override
	void dereserve() {
System.out.println("dereserve from hello class");		
	}
	
	public void hello() {
		System.out.println("Hello from hello class");
	}
	
}

public class AbsExample {

	public static void main(String[] args) {

		Hello i = new Hello();
		i.dereserve();
		i.hello();
		
	}

}




/*

(Parent) MNC ---> 2 abstract methods + 1 constructor + 1 normal method
Infosys (child of MNC) ----> make it abstract also  but give the implementation of single abstarct method
Hello (child of Infosys) ----> here implement all the abstarct methods + 1 create noraml method also
main class ---> call all the methods of all classes using the dynamic polymorphism
*/
