package com.javaex.basic.loop;

public class Ex08 {

	public static void main(String[] args) {
		int x,y;
		
		for(x=1;x<=9;x++) {
			for(y=2;y<=9;y++) {
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}

	}

}
