package javaStartjung;

public class Java014 {

		public static void a1() {
			System.out.println("function1-시작");
			
			
			a2();
			System.out.println("function1-끝");
			
		}
		public static void a2() {
				System.out.println("function2-시작");
				System.out.println("function2-끝");
			}
		
		
		
		public static void a3() {
			
			System.out.println("function4-시작");
			System.out.println("function4-끝");
		}
		
		public static void a4() {
				
				System.out.println("function3-시작");
				System.out.println("function3-끝");
		}
		
		
		
		public static void main(String[] args) {
		a1();
		a3();
		a4();
			
	}

}
