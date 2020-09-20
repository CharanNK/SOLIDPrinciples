package dependencyInversion;

public class NewBackendDeveloper implements Developer {
	
	public void develop() {
		this.writeJava();
	}
	
	public void writeJava() {
		System.out.println("Writing java");
	}
}
