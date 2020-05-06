import java.io.File;
import java.util.Scanner;

public class GetFileByExt {

	public static void getFileNames(File [] arr){

		for(File f:arr){
			if(f.isFile()){
				if(f.getName().endsWith(".txt")){
					System.out.println(f.getName());
				}
			}else if(f.isDirectory()){
				getFileNames(f.listFiles());
			}
		}

	}	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the path here:");
		String str=sc.nextLine();
		File dir=new File(str);

		if(dir.exists() && dir.isDirectory()){
			File [] arr=dir.listFiles();
			getFileNames(arr);
		}
	}

}
