package OOPConceptPart2;

public class BMW extends Car{//has- a relationship
	
	
	//when the same methods are present in parent as well as child class with same name and same no of arguments, is called Method-Overriding
	public void start() {//overridden method
		
		System.out.println("BMW---- Start");
	}
	public void theftSafety() {
		System.out.println("BMW the --- theft Safety");
	}

}
