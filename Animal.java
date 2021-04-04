
public class Animal {
	String name;
	int age;
	String breed;
	
	void printAnimal(String n, int a, String b){
		System.out.println("Profile");
		System.out.println("Name : " + n);
		System.out.println("Age : " + a + " years old");
		System.out.println("Breed : " + b);
	}
	
	void printCharacteristics(String t, String r, String d, double w, String c) {
		System.out.println("\nCharacteristics");
		System.out.println("Type : " + t);
		System.out.println("Thermoregulaion : " + r);
		System.out.println("Dietary : " + d);
		System.out.println("Weight : " + w);
		System.out.println("Colour : " + c);
	}
	
	void calculateAbility(double s,double j) {
	System.out.println("\nAbility");
	System.out.println("Speed : " + s + " m/s");
	System.out.println("Jumping power : " + j + " m");
	}
	
	void calculateFoodIntake(double f) {
		System.out.println("\nFood Intake");
		System.out.println("Food intake a day : " + f + " kg");
		System.out.println("Food intake a month : " + f * 30 + " kg");
	}

}
	
