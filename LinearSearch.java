import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n=sc.nextInt();
		
		int []a=new int[n];
		System.out.println("Enter "+n+" elements:");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the key element to search:");
		int key=sc.nextInt();
		
		for(i=0;i<n;i++){
			if(a[i]==key){
				System.out.println("The key element is present in position "+(i+1));
				break;
			}
		}
		if(i==n){
		System.out.println("The key element is not present in the array");	
		}

	}

}
