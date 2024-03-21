package com.javaex.basic.loop;

public class Ex09 {

	public static void main(String[] args) {
		int x,y;
		
		for(x=1;x<=10;x++) {
			for(y=x;y<=x+9;y++) {
				System.out.print(y+"\t");
				
			}
			System.out.println();
		}

	}

}
