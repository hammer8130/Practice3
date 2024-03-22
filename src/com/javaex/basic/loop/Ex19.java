package com.javaex.basic.loop;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("--------------------");
		
		int money=0;
		int amount =0;
		while(true) {
			System.out.print("선택>");
			int n = scanner.nextInt();
			if(n==1) {
				System.out.print("예금액>");
				money= scanner.nextInt();
				amount+=money;
			}else if(n==2) {
				System.out.print("출금액>");
				money = scanner.nextInt();
				amount-=money;
			}else if(n==3) {
				System.out.print("잔고액>");
				System.out.println(amount);
			}else if(n==4) {
				
				System.out.print("프로그램 종료");
				break;
				
			}else {
				System.out.print("다시 입력해주세요.");
				n = scanner.nextInt();
			}
		}
		
		scanner.close();
	}

}
