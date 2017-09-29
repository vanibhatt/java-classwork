package first.lesson.intro;

import java.io.File;
import java.io.IOException;

public class filewriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

    	FileManager filem = new FileManager();
    	File f = new File("C:\\Users\\PSAdmin\\Desktop\\testfile.txt");
    	filem.addData(f,"new added line");
    	
	}

}
