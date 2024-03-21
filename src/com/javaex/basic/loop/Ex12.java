package com.javaex.basic.loop;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		int r=1;
		for(int x=1;x<=num;x++) {
			r*=x;
		}
		System.out.println("결과값: "+r);
		scanner.close();
	}

}
