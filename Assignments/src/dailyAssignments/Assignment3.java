package dailyAssignments;

public class Assignment3 {

	public static void main(String[] args) {
		int marks = 441;
		
		if(marks<= 100 && marks >= 90) {
			System.out.println("Grade: A");
		}
		else if(marks<=89 && marks >= 75) {
			System.out.println("Grade: B");
		}
		
		else if(marks<=74 && marks >= 60) {
			System.out.println("Grade: C");
		}
		
		else if(marks<=59 && marks >= 40) {
			System.out.println("Grade: D");
		}
		
		else if(marks <= 39 && marks>=0) {
			System.out.println("Failed");
		}
		else {
			System.out.println("Invalid marks");
		}

	}

}
