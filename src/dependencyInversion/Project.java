package dependencyInversion;

public class Project {
	/*
	 * High-level class
	 * This class violates the dependency inversion principle.
	 */
	private BackendDeveloper backenDeveloper = new BackendDeveloper();
	private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
	
	public void implement() {
		//breaks Dependency Inversion principle by depending on the methods of low-level classes.
		backenDeveloper.writeJava();
		frontEndDeveloper.writeJavaScript();
	}
}
