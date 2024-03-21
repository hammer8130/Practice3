package com.javaex.basic.loop;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int r=0;
		
		if(num%2==0) {
			for(int x=2;x<=num;x=x+2) {
				r+=x;
			}
			System.out.println("결과값: "+r);
		}else if(num%2!=0) {
			for(int x=1;x<=num;x=x+2) {
				r+=x;
			}
			System.out.println("결과값: "+r);
		}
		scanner.close();
	}

}
