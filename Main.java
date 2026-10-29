class Animal {
	String type = "Wild Animal";
	
	void makeSound() {
		System.out.println("This animal makes a sound.");
	}
	
	void sleep() {
		System.out.println("This animal sleeps.");
	}
}

class Tiger extends Animal {
	String name = "Bengal Tiger";
	
	void roar() {
		System.out.println(name + " roars loudly!");
	}
	
	void hunt() {
		System.out.println(name + " is hunting in the jungle.");
	}
}

public class Main {
	public static void main(String[] args) {
		Tiger myTiger = new Tiger();
		
		myTiger.makeSound();
		myTiger.sleep();
		myTiger.roar();
		myTiger.hunt();
	}
}