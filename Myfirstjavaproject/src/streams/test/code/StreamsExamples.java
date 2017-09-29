package streams.test.code;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamsExamples extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
				new Person("Mike", "Luke", 25),
				new Person ("Ben", "Tom", 34));
		Iterator<Person> it = people.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().Fname);
		}
		System.out.println("\n");
		people.stream()
		 .filter(p -> p.Fname.startsWith("M"))
		 .forEach(p -> System.out.println(p.Fname));	
	}
}
