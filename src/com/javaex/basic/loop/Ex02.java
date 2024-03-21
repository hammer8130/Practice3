package com.javaex.basic.loop;

public class Ex02 {

	public static void main(String[] args) {
		int x,y;
		for(x=0;x<4;x++) {
			for(y=0;y<2;y++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		// 안쪽 for문에 *을 두번 찍히는 반복문이다.
		// 바깥쪽 for문은 안쪽문이 처리가 될 시 줄바꿈.
		// 따라서 ** 이 4줄로 찍히게 된다.
	}

}
