package com.test.exam01; //package 는 자바 파일의 최상단에 써준다

import java.util.Scanner; //import 는 외부 패키지로부터 클래스를 가져온다 순서는 package 다음

public class SumExam {  
	
		public static int sum(int a, int b) {
			
			return a+b;
			
		}
		public static void main(String[] agrv) {
			
			int i = 10;
			long l_value = 10L;
			double d_value = 10;
			float f_value = 10;
			
			System.out.println("Integer i =" + i + "\n" + "long type l_value =" + l_value +"\n");
			System.out.println("Double d_value =" + d_value + "\n" + "float f_value =" + f_value +"\n");
			
			String[] names = new String[3];
			int size = names.length;
			
			Scanner put = new Scanner(System.in);
			
			for(int index=0; index<size; index++) {
				
				System.out.println("이름을입력하세요");
				names[index] = put.nextLine();
				
				
			}
		
			
			for(int index=0; index <size; index++)		
				System.out.println("이름 : " + names[index]);
			
			put.close();
		}
}