package nurseryRhymes;
import java.io.*;

import nurseryRhymes.oldMacdonald.Song;


public class Main {

	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader newInput = new BufferedReader(input); 

		Song.songIntro();
		
		do {
			try {
				String animal = newInput.readLine().toLowerCase();
				new Song(animal);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!Song.hasAnimal);
		
	}
		
}




