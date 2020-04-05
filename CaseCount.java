import java.util.Scanner;

public class CaseCount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int uppercase=0,lowercase=0;
		
		for(int i=0;i<str.length();i++){
			
			if(Character.isLowerCase(str.charAt(i))){
				lowercase++;
			}else if(Character.isUpperCase(str.charAt(i))){
				uppercase++;
			}
			
		}
		System.out.println("Uppercase letter count:"+uppercase);
		System.out.println("Lowercase letter count:"+lowercase);
		
		
			sc.close();
		

	}

}
