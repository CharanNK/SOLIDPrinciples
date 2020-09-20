package dependencyInversion;

public class NewFrontEndDeveloper implements Developer {
	
	public void develop() {
		this.writeJavaScript();
	}
	
	public void writeJavaScript() {
		System.out.println("Writing javascript");
	}
}
