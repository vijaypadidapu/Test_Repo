package Java_Basics;

public class LoopsConcepts {

	public static void main(String[] args) {
		
		//1. while loop
		//disadvantage of while loop: it will generate infinite loop if you don't give incremental/decremental part
		int i=0;//initialization
		while(i<=100) {//conditional
			
			System.out.println(i);
			i++;//incremental/decremental
			System.out.println("***************");
		}
		//j++ means j=j+1
		// for loop
		for (int j =0; j<10; j++) {//initialization,condition,incremental
			System.out.println(j);
			System.out.println("**************");
		}
		//print 10-1
		for(int k=10; k>=1;k--) {
			System.out.println(k);
			
		}

	}

}
