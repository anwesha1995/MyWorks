import java.util.ArrayList;
import java.util.Scanner;

public class ListFunction {

	public static void main(String[] args) {
		
		ArrayList <String> al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of elements:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++){
			al.add(sc.next());
		}
		System.out.println(al);
		System.out.println("no. of elements:"+al.size());
		System.out.println("first element:"+al.get(0));
		System.out.println("last element:"+al.get(al.size()-1));
		
		String str=al.remove(3);
		System.out.println("removed element:"+str);
		System.out.println(al);
		
		al.clear();
		if(al.isEmpty()){
			System.out.println("Empty");
		}else{
			System.out.println("not empty");
		}

	}

}
