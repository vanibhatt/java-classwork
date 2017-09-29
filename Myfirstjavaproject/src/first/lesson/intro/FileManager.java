package first.lesson.intro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager{
	

	FileWriter outputStream = null;
	
	void addData(File f, String data) throws IOException {	
	try {
		outputStream = new FileWriter(f, true);
	
		outputStream.write(data);
//		writer.newLine();
		
	   } catch (IOException e) {
		e.printStackTrace();
	   } finally {
			if (outputStream != null) {	outputStream.close();}
	   }
	   }
	}



	

	
	
    
