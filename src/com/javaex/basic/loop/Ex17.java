package com.javaex.basic.loop;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		for(int x=num;x>0;x--) {
			for(int y=x;y>0;y--) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
