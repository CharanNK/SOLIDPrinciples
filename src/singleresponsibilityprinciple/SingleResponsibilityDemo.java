package singleresponsibilityprinciple;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SingleResponsibilityDemo {

	public static void main(String[] args) throws Exception {
		Journal charanJournal = new Journal();
		
		charanJournal.addEntry("I cycled 30 km today");
		charanJournal.addEntry("I ate Chicken toast today");
		charanJournal.addEntry("I started with Design Principles today");
		
		System.out.println(charanJournal);
		
		//calling the persistence class to save journal to file
		Persistence persistence = new Persistence();
		String fileName = "c:\\temp\\journal.txt";
		persistence.saveToFile(charanJournal, fileName, true);
		
		//Accessing the file to check 
		Runtime.getRuntime().exec("notepad.exe "+fileName);
	}

}
