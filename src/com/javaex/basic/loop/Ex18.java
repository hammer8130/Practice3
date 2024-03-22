package com.javaex.basic.loop;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();

		for (int x = num * 2 - 1; x > 1; x--) {
			for (int y = num; y <= x; y++) {
				System.out.print("*");
				
			}
			System.out.println("");
			for (int y = num-1; y >= x-1; y--) {
				System.out.print("*");
			}
			
		}
		scanner.close();
	}

}
