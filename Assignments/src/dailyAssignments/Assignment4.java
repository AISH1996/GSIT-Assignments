package dailyAssignments;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13594;
		int largest = 0;
		
		
		while(num!=0) {
			int r = num%10;
			largest = Math.max(r,largest);
			
			num = num/10;
			
		}
		System.out.println("Largest digit: "+ largest);

	}

}
