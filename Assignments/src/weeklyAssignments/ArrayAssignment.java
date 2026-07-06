package weeklyAssignments;

import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
		//Q1)  Print only the unique elements from an array.
		
		int arr[] = {5, 3, 8, 5,5, 5, 2, 3, 9, 8};
		int j=0;
		for(int i=0; i<arr.length; i++) {
			for(j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					break;
				}
				
				
			}
			if(i==j) {
				System.out.println(arr[i]);
			}
		}
		System.out.println();
		
		//Q2) Given two integer arrays of the same size, print all common elements.
		//Avoid printing duplicate common elements.
		
		int arr1[] = {2, 5, 7, 9, 11, 5};
		int arr2[] = {1, 5, 7, 15, 20, 5};
		
		for(int a : arr1) {
			for(int b : arr2) {
				if(a==b) {
					System.out.println(a);
					break;
				}
			}
			
		}
		
		
		// Q3) Print the frequency of every unique element in the array.
		     //Do not print the frequency of the same element more than once.
		
		int arr3[] = {4, 2, 4, 6, 2, 2, 7};
		
		Arrays.sort(arr3);
		
		//int k =0;
		
		for(int i=0; i<arr3.length; i++) {
			int frequency =1;
//			for(k=0; k<i; k++) {
//				if(arr3[i]==arr3[k]) {
//					frequency++;
//					break;
//				}
//			}
//			
			while(i<arr3.length-1 && arr3[i]==arr3[i+1]) {
				frequency++;
				i++;
			}
			System.out.println(arr3[i] +" occures "+frequency+" times");
			
			
		}


//		

	}

}
