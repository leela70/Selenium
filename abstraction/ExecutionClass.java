package abstraction;

public class ExecutionClass extends  MultipleLanguage{

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");

	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");

	}

	public static void main(String[] args) {
		
		ExecutionClass object = new ExecutionClass();
		
		object.ruby();
		object.Selenium();
		object.Java();
		
	}
	
	
	
	
	
	
	
	
}
