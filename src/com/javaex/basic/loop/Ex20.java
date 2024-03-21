package com.javaex.basic.loop;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("=================");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("=================");
		
		int random=(int)(Math.random()*100)+1;
		int r;
		
		while(random<101) {
			System.out.print(">>");
			int result=scanner.nextInt();
		
		if(random>result) {
			System.out.println("더 높게");
		}else if(random<result) {
			System.out.println("더 낮게");
		}else if(random==result) {
			System.out.print("맞았습니다.\n게임을 종료하시겠습니까?(y/n) >>");
			String a = scanner.next();
		
			
			if(a=="y") {
				System.out.println("=================");
				System.out.println("[숫자맞추기게임 종료]");
				System.out.println("=================");
				break;
			}else if(a=="n") {
				continue;
			}
		}
		}
		
		
		
		
		scanner.close();
		
	}

}
