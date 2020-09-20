package dependencyInversion;
import java.util.*;

public class DependencyInversionDemo {
	public static void main(String[] args) {
		NewBackendDeveloper backEndDeveloper = new NewBackendDeveloper();
		NewBackendDeveloper backendDeveloper2 = new NewBackendDeveloper();
		
		NewFrontEndDeveloper frontEndDeveloper = new NewFrontEndDeveloper();
		
		List<Developer> developerList = new ArrayList<Developer>();
		developerList.add(frontEndDeveloper);
		developerList.add(backendDeveloper2);
		developerList.add(backEndDeveloper);
		
		NewProject project = new NewProject(developerList);
		project.implement();
	}
}
