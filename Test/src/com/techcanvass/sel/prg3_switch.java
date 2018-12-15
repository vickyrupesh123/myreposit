package com.techcanvass.sel;

public class prg3_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=16;
switch (m)
	{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("No of days in month are 31");
			//break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("No of days in month are 30");
			break;
		case 2:
			System.out.println("No of days in month are 28 or 29");
			break;
		default :
			System.out.println("select proper month");
			break;
			
	}
}

}

