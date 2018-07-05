package OOPConceptPart1;

public class CallByValAndCalByRef {
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCalByRef obj= new CallByValAndCalByRef();
		int x=10;
		int y=20;
		obj.testSum(x,y);//Call by value or pass by value
		obj.p = 50;
		obj.q=60;
		obj.swap(obj);
			//after Swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	public int testSum(int a,int b) {
		a=30;
		b=40;
		int c=a+b;
		return c;
		
	}
	//call by Reference
	public void swap(CallByValAndCalByRef t) {
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}

}
