package first.lesson.intro;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class newException {

	public static void main(String[] args) throws IOException {
		try {
			throw new FileNotFoundException("This is a error Message");
//			throw new EOFException("this is error");
//			throw new IOException("this is error");
			
		}
		
		catch (FileNotFoundException e){
		System.out.println("File not found : " + e.getMessage());
		}
//		catch (EOFException e){
//		System.out.println("End of file reached : " + e.getMessage());
//		}	
//		
//		catch (IOException e){
//		System.out.println("General I/O Exception : " + e.getMessage());

			
		}
}
