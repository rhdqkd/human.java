package javaStartjung;

import java.util.Arrays;
import com.human.dto.*;

public class Java001 {

	public static void main(String[] args) {
//�迭
		
		
//		int arr1[] =new int[3];
		int arr1[] = {1,2,3};
		arr1[1]=5;
		System.out.println(arr1[1]);
		
//		double arr2[] = new double[4];
		double arr2[] = {1.1,2.1,3.1,4.1};
		arr2[0]=1.5;
		System.out.println(arr2[0]);
		
		String arr3[] = {"������","�����","�ؾ�"};
		arr3[2]="�ܽ���";
		System.out.println(arr3[0]);
		
		
		Human arr4[]=new Human[3];
//		arr4[0]=new Human();
//		arr4[0].name="ȫ�泲";
//		arr4[0].age=11;
//		arr4[0].height=140.4;
		//1.�������Լ�
		arr4[0]=new Human("ȫ�浿",15,154.1);
		System.out.println(arr4[0]);
		
		arr4[1]=new Human();
		arr4[1].name="ȫ����";
		arr4[1].age=21;
		arr4[1].height=170.6;
		
		arr4[2]=arr4[0];
		//.equals() ������
		//�迭�� �̸��� ���� �ּҰ����.
		//Arrays�� ������ import�� �������
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr4[0]);
		//human.dto.Human@6d06d69c // �ü������ �����(�ּҰ�)�� �ٸ��� �ִ�.
		
		arr4[1].name="ȫ�泲";
		arr4[1].age=11;
		arr4[1].height=140.4;
		
		System.out.println(arr4[0]==arr4[1]);
		System.out.println(arr4[0].equals(arr4[1]));
		//�ֻ�����ü��  object
		//class�� �ֻ�����ü������ ���������� ���� ����.
		
		//���
		

	}

}
