package OOPConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj= new MethodOverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum(9, 5);
			

	}
	//We can overload main method also 
	//you cannot create method inside a method
	//duplicate methods-->ie same method name with same number of arguments are not allowed
	
	//Method Over loading-->when the method name is same with different arguments or input parameters within the same class
	
	public void sum() {//0 input param
		System.out.println("Sum Method");
	}
	
	public void sum(int i) {
		System.out.println("Sum Method---> 1 para");
		System.out.println(i);
	}
	
	public void sum(int k, int l) {
		System.out.println("Sum Method----> 2 para");
		System.out.println(k+l);
	}

}
