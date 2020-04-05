import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of terms:");
		int n=sc.nextInt();
		int f1=0,f2=1,next;
		System.out.println("Fibonacci series is: ");
		int i=0;
		while(i<n){
			if(i<=1){
				next=i;
			}else{
				next=f1+f2;
				f1=f2;
				f2=next;
			}
			System.out.print(" "+next);
			i++;
		}

	}

}