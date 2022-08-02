import java.util.*;
public class AccessingArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		
		//accessing array elements
		int[] numbers = {1, 2, 3, 4, 5};
		
		System.out.println("\nAccessing Elements of an Array");
		System.out.println("First element: " + numbers[0]);
		System.out.println("First element: " + numbers[1]);
		System.out.println("First element: " + numbers[2]);
		System.out.println("First element: " + numbers[3]);
		System.out.println("First element: " + numbers[4]);
	
		//initializing array using for loop
		int[] age = {10, 13, 17, 19, 21};
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Using for loop: " + age[i]);
		}
		
		//accessing array using for-each loop
		int[] grades = {91, 80, 85, 89};
		
		System.out.println("\nUsing for-each loop");
		for(int a: grades) {
			System.out.println(a);
		}
	}

}
