class Animal {
	String species;
	int age;
	Animal(String species, int age){
		this.species = species;
		this.age = age;
	}
}

class Monkey extends Animal {
	String zoo;
	Monkey(String species, int age){
		super(species, age);
	}
}

public class DowncastingEx {
	public static void main(String[] args) {
		Animal a = new Monkey("호모사피엔스", 19); //upcasting
		Monkey m = (Monkey)a; //downcasting
		
		System.out.println(m.species);
		m.age = 10;
	}
}
