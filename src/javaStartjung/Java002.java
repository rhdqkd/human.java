package javaStartjung;

public class Java002 {

	public static void main(String[] args) {
		String str1="홍길동"; //0X01
		String str2="홍길동"; //0X01
		//string의 equals 메소드는 들어있는 문자열데이터를 비교한다.
		//상수는 쓸때마다 새로생성된다. 변경할 방법이 없음
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		//new를 쓰면 새롭게 또 만든다.ㅏ
		if(str1==str2) { 	//주소가 같으므로 true이다.
			System.out.println("str1==2는 같다");
		}
		if(str1==str3) { 	//false
			System.out.println("str1==3는 같다");
		}
		if(str1.equals(str2)) { 	//true
			System.out.println("str1==2는 같다");
		}
		if(str1.equals(str2)) { 	//
			System.out.println("str1==2는 같다");
		}

	}

}
