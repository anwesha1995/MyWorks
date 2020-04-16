import java.util.Scanner;

public class NprandNcr {
	
	public static int fact(int num){
		int fact=1,i;
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		System.out.println("Enter the value of r:");
		int r=sc.nextInt();
		
		System.out.println("NCR= "+fact(n)/(fact(n-r)*fact(r)));
		System.out.println("NPR= "+fact(n)/fact(n-r));

	}

}
