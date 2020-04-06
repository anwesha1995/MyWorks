import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want:");
		String str=sc.nextLine();
		System.out.println("The reverse string is:");
		int i=str.length();
		
		while(i>0){
			System.out.print(str.charAt(i-1));
			i--;
		}
	}

}
