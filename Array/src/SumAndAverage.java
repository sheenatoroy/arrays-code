import java.util.Scanner;

public class SumAndAverage {

public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		//computing the sum and average of an array
		int[] numbers = {1, 4, 5, -9, 6, -2, 8, 3, 10, 12};
		int sum = 0;
		Double average;
		
		
		//accessing all elements using for-each loop
		//add each element in sum
		for(int num: numbers) {
			
			sum += num;
		}
		
		//get the total number of elements
		//calculate the size of an array
		int length = numbers.length;
		
		//calculate the average
		//convert the average from int to double
		//typecasting
		average = ((double)sum / (double)length);
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		
		
		
	}
}
