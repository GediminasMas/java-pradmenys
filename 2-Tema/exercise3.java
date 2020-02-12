import java.util.Scanner;
public class Exercise3 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number first: ");
		int num1 = in.nextInt();
		
		System.out.println("Input second number: ");
		int num2 = in.nextInt();
		
		System.out.println("Input the third number: ");
		int num3 = in.nextInt();
		
		if (num1 > num2 && num1 > num3)
			System.out.println("The number is greatest: " + num1);
			
		if (num2 > num1 && num2 > num3)
			System.out.println("The greatest: " + num2);
		
		if (num3 > num1 && num3 > num2)
			System.out.println("The greatest: " + num3);
		
		
	}
}