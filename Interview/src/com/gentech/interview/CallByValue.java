package com.gentech.interview;
class Classes
{
	public void getsquare(int x,int y)
	{
		x*=100;
		y*=9;
		System.out.println(x);
		System.out.println(y);
	}
}

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classes o=new Classes();
		o.getsquare(10, 5);
	}

}
