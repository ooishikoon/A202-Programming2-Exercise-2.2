
public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal(); //create first new obejct
		
		dog.printAnimal("Fifteen",2,"Golden Retriver");
		dog.printCharacteristics("Mammals", "Warm-blooded", "Omnivores", 5.32, "White");
		dog.calculateAbility(15.84, 1.56);
		dog.calculateFoodIntake(1.0);
		
		System.out.println();

		Animal cat = new Animal(); //create second new object
	
		cat.printAnimal("Nineteen",3,"Ragdoll");
		cat.printCharacteristics("Mammals", "Warm-blooded", "Omnivores", 3.93, "Brown");
		cat.calculateAbility(17.65, 1.87);
		dog.calculateFoodIntake(0.5);

	}

}
