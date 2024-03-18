package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = scanner.nextInt();
		int r;
		for(int x=1;x<=n;x++) {
//			for(int y=n;y>0;y--) {
//				System.out.print(x*y+"\t");
//			}
			r=x*x;
			System.out.println(r);
		}
		scanner.close();
	}

}
