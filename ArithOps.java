import java.util.Scanner;

public class ArithmeticOps {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st no:");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd no:");
		int n2=sc.nextInt();
		
		int n3;
		
		System.out.println("Enter the operator  (+,-,* & /):");
		char ops=sc.next().charAt(0);
		
		switch(ops){
		
		case '+':
			
			n3=n1+n2;
			break;
			
		case '-':
			
			n3=n1-n2;
			break;
		
		case '*':
			
			n3=n1*n2;
			break;
			
		case '/':
			
			n3=n1/n2;
			break;
			
		default:
			
			System.out.println("you may have entered wrong choice");
			return;
				
		}
		System.out.println(n1+" "+ops+" "+n2+" "+"="+" "+n3);

	}

}


