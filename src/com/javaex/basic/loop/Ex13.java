package com.javaex.basic.loop;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int r=0;
		for(int x=1;x<=num;x++) {
			r+=x;
		}
		System.out.println("합계: "+r);
		scanner.close();
	}

}
