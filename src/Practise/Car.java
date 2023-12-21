package Practise;
//Add Reamdme.md file to the project
//Explain Each Line of the code
public class Car {
public String Brand="BMW";
public static int Wheels=4;
private float EngineCapacity=4.6f;
public double FuelCapacity=2.66;
public int limit=-2140000000;
public long limit2=-900l;

public String Start(){
	String Start="Press the 'start' button";
	System.out.println(Start);
	return Start;

};
public int ShiftControl(){
	int ShiftControl=1;
	System.out.println(ShiftControl);
	return ShiftControl;
};
public int Park(){
	int Park=1;
	int Rear=2;
	int Drive=3;
	System.out.println(Park);
	return Park;
};
public static int Park(int input){
	int Park=1;
	int Rear=2;
	int Drive=3;
	System.out.println(Park);
	return Park;
};
public int Rear(int input){
	int Park=1;
	int Rear=2;
	int Drive=3;
	System.out.println(Rear);
	return Rear;
};
public int Drive(int input){
	int Park=1;
	int Rear=2;
	int Drive=3;
	System.out.println(Drive);
	return Drive;
};
	public static void Break(int input){
		int Break=1;
		System.out.println(Break);
	};
	public static void main(String[] args) {
	Car BMW= new Car();
		System.out.print("Hello, World");
		System.out.print(" \nMy name is Larry");
		System.out.print(". \nThis is my car");
		System.out.print(". \nThe name of the brand is "+ BMW.Brand);
		System.out.print(". \nThe car has "+ Wheels +" Wheels");
		System.out.print(". \nThe Fuel capacity of the car is "+ BMW.FuelCapacity +" Litres");
		System.out.print(". \nThe Engine capacity of the car is "+ BMW.EngineCapacity +" mile/hour.");
		System.out.print(". \nThe limit of the car is "+ BMW.limit2 +" mile/hour.");
		BMW.EngineCapacity=5.6f;
		System.out.println(BMW.EngineCapacity);
		Wheels=5;
		System.out.println(Wheels);
		BMW.Start();
		BMW.Park();
		
	}

}
