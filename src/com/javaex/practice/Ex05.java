package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		int i=1;
		boolean flag=true;
		
		while(flag) {
			if(i>=5) {
				flag=false;
			}
			System.out.println(i);
			i=i+1;
		}
		//1
		//2
		//3
		//4
		//5
		//while문의 flag가 true일때까지 안쪽의 if문을 반복한다.
		//따라서 if문의 i가 5가 될때까지 개행을 하여 숫자 출력.
	}

}
