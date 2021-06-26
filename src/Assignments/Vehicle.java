package Assignments;

public class Vehicle {
	private int speed;
	private long distance;
	
	public Vehicle() {
		
	}
	public Vehicle(int speed, int distance) {
		this.speed =speed;
		this.distance = distance;
	}
	
	public void run() {
		System.out.println("Run Method of Vehicle Class");
	}
	public void stop() {
		System.out.println("Stop Method of Vehicle Class");
	}
	
	public void fuel(int i) {
		
	}
	public void fuel(String s, float f) {
		
	}
	public void fuel(char c, int i) {
		
	}
	
}

class twoWheel extends Vehicle{
	private int speed;
	private long distance;
	int numOfTires=2;

	public twoWheel() {
			
	}
	public void run() {
		System.out.println("Run Method of twoWheel Class");
	}
	public void stop() {
		System.out.println("Stop Method of twoWheel Class");
	}
	
	void display() {
		System.out.println("-------------------twoWheel---------------------");
		System.out.println("twoWheel: Speed" + speed+ " distance " + distance + " number of Tires "+ numOfTires );
		System.out.println("Parent: Speed" + super(speed) + " distance " + distance + " number of Tires "+ numOfTires );
		System.out.println("-----------------------------------------------");
	}
}

class threeWheel extends Vehicle{
	private int speed;
	private long distance;
	int numOfTires=3;
	
	public threeWheel() {
		
	}
	public void run() {
		System.out.println("Run Method of threeWheel Class");
	}
	public void stop() {
		System.out.println("Stop Method of threeWheel Class");
	}
}

class fourWheel extends Vehicle{
	private int speed;
	private long distance;
	int numOfTires=4;
	
	public fourWheel() {
		
	}
	public void run() {
		System.out.println("Run Method of fourWheel Class");
	}
	public void stop() {
		System.out.println("Stop Method of fourWheel Class");
	}
}

class eightWheel extends Vehicle{
	private int speed;
	private long distance;
int numOfTires=8;
	
	public eightWheel() {
		
	}
	public void run() {
		System.out.println("Run Method of eightWheel Class");
	}
	public void stop() {
		System.out.println("Stop Method of eightWheel Class");
	}
}

/*

in vechile:
- create two methods - run() and stop()
- create three methods of public void fuel - 1st method will take int / 2nd method will float and string  / 3rd method will take char and int
- declare two variables - int speed and long distance
- create two constructors also- default and parametrized
2W:
- oveeride the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 2
- create methods here also as display() --> this will print the three variables of 2W  + all the variable of the parent Vechile
3W:
- oveeride the two methods - run() and stop()
- - create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 3
- create methods here also as display() --> this will print the three variables of 3W  + all the variable of the parent Vechile
4W:
- oveeride the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 4
- create methods here also as display() --> this will print the three variables of 4W  + all the variable of the parent Vechile
8W:
- oveeride the two methods - run() and stop()
- create default constructor
- declare two variables - int speed and long distance with different values from the parent vechile
- decalre one more variable as int nos_of_tyre = 8
- create  methods here also as display() --> this will print the three variables of 8W  + all the variable of the parent Vechile
  Main()
  call all the methods using runtime polymorphism here...+ all the methods of class Vechile

*/