package weeklyAssignments_Assignment3;

public class Employee {
	
	int id;
	String name;
	static double basicSalary ;

	public Employee(int id, String name, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public static double calculateSalary() {
		double HRA = (basicSalary*20)/100;
		double bonus = (basicSalary*10)/100;
		
		double totalSalary = basicSalary + HRA + bonus;
		return totalSalary;
	}
	
	public void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("basicSalary: "+ basicSalary);
		System.out.println("totalSalary: "+calculateSalary());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
