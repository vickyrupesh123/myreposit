package com.techcanvass.sel;

public class prg8_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] num= {{10,20,30},{100,200,300}};
		for (int row=0;row<num.length;row++)
		{
			for (int col=0;col<num[row].length;col++)
			{
				System.out.print(num[row][col]+"\t");
			}
			System.out.println();
		}
		
	}

}
