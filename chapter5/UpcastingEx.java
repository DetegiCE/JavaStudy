class Person {
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
}

public class UpcastingEx {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("차고컴");
		p = s; //upcasting
		
		System.out.println(p.name);
		
		p.grade = "A"; //error
		s.grade = "A";
		
		p.department = "Computer"; //error
		s.grade = "Computer";
	}
}
