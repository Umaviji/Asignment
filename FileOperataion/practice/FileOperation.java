
	package FileOperataion.practice;
	import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class FileOperation {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ARUN\\Desktop\\uma\\.txt");
		file.createNewFile(); 
		FileWriter u=new FileWriter(file); 
		BufferedWriter Bf=new BufferedWriter(u); 
		Bf.write("Practice of FileOperation");
		Bf.close();
		FileReader F=new FileReader(file);
		int i;
		while ((i=F.read()) != -1) { 
			System.out.println((char) i); 
			F.close();
			long time =file.lastModified();
System.out.println("");
DateFormat s=new SimpleDateFormat("dd-MMMM-YYYY hh:mm:ss"); 
System.out.println("Modified date is:"+s.format(time));
}
		} 
	}


