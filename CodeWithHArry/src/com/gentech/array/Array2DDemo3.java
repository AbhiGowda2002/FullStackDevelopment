package com.gentech.array;

public class Array2DDemo3 {

	public static void main(String[] args) {
		// Read Elements of 2D array in Reverse Order

		int a[][]= {{20,30,40},{40,50,60},{70,80,90}};
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
