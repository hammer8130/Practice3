package com.javaex.basic.loop;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		int r=0;
		for(int x=num;x>0;x--) {
			if(num%x==0) {
				r=num/x;
				System.out.println(r);
			}
		}
		scanner.close();
		}
	

}
