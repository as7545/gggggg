
import java.util.*;

	public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a , b);
        System.out.println("Sum is" + sum);
        
        int multiply = multiply(a , b);
        System.out.println("multiply is" + multiply);
        
   }
	public static int add(int a , int b) {
		return a+b;
	}
	
	public static int multiply(int a , int b) {
		return a*b;
		
	}
