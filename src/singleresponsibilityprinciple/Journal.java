package singleresponsibilityprinciple;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;

public class Journal {
	private final ArrayList<String> entries = new ArrayList<>();
	private static int count = 0;
	
	public void addEntry(String text) {
		entries.add(""+(++count)+": "+text);
	}
	
	public void removeEntry(int index) {
		entries.remove(index);
	}

	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}
	
	/* so far the journal concerns only adding, removind and returning the entries of a journal.
	 * which follow the Single Responsiblity Principle. Journal class is concerned only of Journal activities.
	 */
	
	//the below methods violate the principle of Single Responsibility.
	public void save(String fileName) throws FileNotFoundException{
		try(PrintStream outStream = new PrintStream(fileName)){
			outStream.println(this.toString());
		}
	}
	
	public void load(String fileName) {} // the contents of a journal are loaded from a file.
	public void load(URL url) {} //the contents of a journal are loaded from URL.
}
