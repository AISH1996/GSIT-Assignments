package weeklyAssignments_Assignment3;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

}

class Student extends Person{
	float marks;
	public Student(String name, int age, float marks) {
		super(name, age);
		this.marks=marks;
		}
	
	public void display() {
		System.out.println("Person's name: "+ name);
		System.out.println("Age of the person: "+age);
		System.out.println("Markes of student: "+ marks);
	}

	
	
}
