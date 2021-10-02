
public class Main
{
	public static void main(String[] args) {
		int [] arr = {10,20,30,10,30};
		for(int i = 0; i<arr.length;i++) {
			int count = 0;
			
			for(int j = 0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
		}
	}
}
//public static void main(String[] args){
    //notRep(new int[]{10,20,30,10,30})
//}
