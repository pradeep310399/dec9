package assignments.oops;

public class Automation extends MultipleLanguage {
	

	public void Selenium() {
		System.out.println("The tool used to Automate the WebApplication alone:");
		
	}

	public void Java() {
		System.out.println("Using java codes with selenium we can automate the  webapplication:");
		
	}
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Selenium();
		auto.Java();
		auto.python();
		auto.ruby();//it is unimplemented method in the abstract class
	}
	

}
