package interchaing;

public class Interchangingwords {
	public static void main(String [] args) {
		String input = "Geekster is my class room";
		String[] inputArr = input.split(" ");
		int n = inputArr.length;
		String reversedInput = "";
		for(int i = n-1;i>=0;i--) {
			reversedInput += inputArr[i]+ " ";
		}
		System.out.println(reversedInput);
		
		
		
	}
	

}
