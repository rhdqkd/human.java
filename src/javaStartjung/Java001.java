package javaStartjung;

import java.util.Arrays;
import com.human.dto.*;

public class Java001 {

	public static void main(String[] args) {
//배열
		
		
//		int arr1[] =new int[3];
		int arr1[] = {1,2,3};
		arr1[1]=5;
		System.out.println(arr1[1]);
		
//		double arr2[] = new double[4];
		double arr2[] = {1.1,2.1,3.1,4.1};
		arr2[0]=1.5;
		System.out.println(arr2[0]);
		
		String arr3[] = {"강아지","고양이","붕어"};
		arr3[2]="햄스터";
		System.out.println(arr3[0]);
		
		
		Human arr4[]=new Human[3];
//		arr4[0]=new Human();
//		arr4[0].name="홍길남";
//		arr4[0].age=11;
//		arr4[0].height=140.4;
		//1.생성자함수
		arr4[0]=new Human("홍길동",15,154.1);
		System.out.println(arr4[0]);
		
		arr4[1]=new Human();
		arr4[1].name="홍길이";
		arr4[1].age=21;
		arr4[1].height=170.6;
		
		arr4[2]=arr4[0];
		//.equals() 이퀄스
		//배열의 이름을 쓰면 주소가뜬다.
		//Arrays를 쓰려면 import를 써줘야함
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr4[0]);
		//human.dto.Human@6d06d69c // 운영체제마다 결과값(주소값)이 다를수 있다.
		
		arr4[1].name="홍길남";
		arr4[1].age=11;
		arr4[1].height=140.4;
		
		System.out.println(arr4[0]==arr4[1]);
		System.out.println(arr4[0].equals(arr4[1]));
		//최상위객체는  object
		//class의 최상위객체에대한 면접질문이 많이 나옴.
		
		//명상
		

	}

}
