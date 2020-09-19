package singleresponsibilityprinciple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {
	/*Persistence class deals only of saving the contents or loading of journal.
	 * Hence it follows the Single Responsibility Principle.  
	 */
	
	public void saveToFile(Journal journal,String fileName,boolean isOverwrite ) throws FileNotFoundException {
		
		if(isOverwrite|| new File(fileName).exists()) {
			try(PrintStream outStream = new PrintStream(fileName)){
				outStream.println(journal.toString());
			}
		}
	}
	
	public Journal load(String fileName) {
		//loading the journal from a local file
		return null;
	}
	
	public Journal load(URL url) {
		//loading the journal from URL
		return null;
	}
	
}
