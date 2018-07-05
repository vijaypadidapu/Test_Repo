package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global Variables-->Class Variables
	
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		
		int i=10;//Local Variable
		System.out.println(i);
       LocalVsGlobalVariables LG= new LocalVsGlobalVariables();
       System.out.println(LG.name);
       System.out.println(LG.age);
       
	}
	public void sum() {
		int i=15;//local variable for sum method
		int j=20;
		
	}

}
