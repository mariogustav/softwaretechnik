package Instanzvariablen;

public class Main {
	public static void main(String[] args) {
//		Test.i = 0;
		Test.k = 5;
		
		Test obj = new Test();
		obj.i = 3;
		
		Test obj2 = new Test();
		obj2.i = 6;
		
		System.out.println(obj.i);
		System.out.println(obj2.i);
		System.out.println(obj2.k);
		System.out.println(obj.k);
		System.out.println(Test.k);
	}		
}
