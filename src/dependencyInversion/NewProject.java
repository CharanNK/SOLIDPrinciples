package dependencyInversion;
import java.util.*;

public class NewProject {
	private List<Developer> developers;
	
	public NewProject(List<Developer> developers) {
		this.developers = developers;
	}
	
	public void implement() {
		developers.forEach(d -> d.develop());
	}
}
