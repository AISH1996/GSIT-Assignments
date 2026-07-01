package weeklyAssignments;

public class AssignmentLoops {

	public static void main(String[] args) {
		//1) Factorial of a Number
		int num = 6;
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+num+" is: "+ fact);
		
		//2) Write a Java program to count the number of digits in the number 987654 using a loop.
		
		int number = 234671689;
		int count=0;
		while(number!=0) {
			
			count++;
			number = number/10;
			
		}
		System.out.println("total number of digits: "+count);
		
		
		//3) Write a Java program to find the sum of digits of the number 4567.
		
		int number1 = 4567;
		int sum=0;
		
		while(number1!=0)
		{
			int rem = number1%10;
			sum+=rem;
			number1=number1/10;
		}
		
		System.out.println("Sum of the digits of the number: "+sum);
		
		//4) Write a Java program to print all the factors of the number 24 using a loop.
		
		int number2 = 24;
		int factor = 1;
	    
		for(int i=1; i<=number2;i++) {
			if(number2%i==0) {
				System.out.println(i);
			}
			
		}
		System.out.println();
		
		//5) Write a Java program to print the first 10 terms of the Fibonacci series using a loop.
		int number3 = 6;
		int first = 0;
		int second = 1;
		
		for(int i=1; i <= number3; ++i) {
			System.out.print(first + " ");
			
			int temp = first + second;
			
			first = second;
			second = temp;
		}

	}

}
