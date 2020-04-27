import java.io.File;
import java.util.Date;

public class FileOps {

	public static void main(String[] args) throws Exception {
		
		File file1=new File(args[0]);
		File file2=new File(args[1]);
		
		if(file1.exists()){
			System.out.println("exist");
		}else{
			System.out.println("does not exist");
		}
		
		if(file1.isFile()){
			System.out.println("file");
		}else{
			System.out.println("not file");
		}
		
		if(file2.isDirectory()){
			System.out.println("directory");
		}else{
			System.out.println("not directory");
		}
		
		if(file1.canRead()){
			System.out.println("read");
		}else{
			System.out.println("can not read");
		}
		
		if(file2.canWrite()){
			System.out.println("write");
		}else{
			System.out.println("can not write");
		}
		
		if(file1.canExecute()){
			System.out.println("execute");
		}else{
			System.out.println("can not execute");
		}
		
		if(file2.isHidden()){
			System.out.println("hidden");
		}else{
			System.out.println("not hidden");
		}
		
		System.out.println("size:"+file1.length()+" bytes");
		System.out.println("size:"+file2.length()+" bytes");
		
		System.out.println("parent:"+file1.getParent());
		
		System.out.println("name:"+file1.getName());
		
		System.out.println("path:"+file2.getPath());
		
		System.out.println("path separator:"+file1.pathSeparator);
		
		Date date=new Date(file1.lastModified());
		System.out.println("last date modified:"+date);
		
		File file3=new File(args[2]);
		
		if(file3.createNewFile()){
			System.out.println("new file created");
		}else{
			System.out.println("not created");
		}
		File file4=new File(args[3]);
		file4.createNewFile();
		
		if(file4.delete()){
			System.out.println("deleted");
		}else{
			System.out.println("not deleted");
		}

	}

}
