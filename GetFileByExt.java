import java.io.File;

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

		File dir=new File("C:\\Users\\prlan\\Desktop\\Test");

		if(dir.exists() && dir.isDirectory()){
			File [] arr=dir.listFiles();
			getFileNames(arr);
		}
	}

}
