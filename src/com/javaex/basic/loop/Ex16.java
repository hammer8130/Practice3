package com.javaex.basic.loop;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int r=0;
		int s=0;
		for(int x=5;x<=num;x=x+5) {
			r+=x;
			s=num/5;
		}
		System.out.println("5의배수의 개수: "+s);
		System.out.println("5의배수의 합: "+r);
		scanner.close();
	}

}
