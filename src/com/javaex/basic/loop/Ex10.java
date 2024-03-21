package com.javaex.basic.loop;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요\n숫자: ");
		int n1=scanner.nextInt();
		System.out.print("숫자: ");
		int n2=scanner.nextInt();
		System.out.print("숫자: ");
		int n3=scanner.nextInt();
		System.out.print("숫자: ");
		int n4=scanner.nextInt();
		System.out.print("숫자: ");
		int n5=scanner.nextInt();
		
		int x,y;
		int max=n1;
		int min=n1;
		if(n2>max) {
			max=n2;
			}
		if(n3>max) {
			max=n3;
		}
		if(n4>max) {
			max=n4;
		}
		if(n5>max) {
			max=n5;
		}
		if(min>n2) {
			min=n2;
		}
		scanner.close();
		}
	}


