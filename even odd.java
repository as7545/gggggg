/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter a number: ");
      int number = sc.nextInt();
      if((number & 1) == 0)
      {
         System.out.println(number + " is an even number.");
      }
      else
      {
         System.out.println(number + " is an odd number.");
      }
      sc.close();
	
	}
}
