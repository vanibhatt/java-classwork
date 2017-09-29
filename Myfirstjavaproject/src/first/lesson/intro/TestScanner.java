package first.lesson.intro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	try {
		FileReader reader = new FileReader( new File("C:\\Users\\PSAdmin\\Desktop\\testfile.txt"));
		Scanner scan = new Scanner(reader);
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
	} catch (FileNotFoundException e) {
		System.out.println("Error Reading File");
	}

	}

}
