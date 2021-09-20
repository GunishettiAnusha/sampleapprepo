package org.cap.demo;

public class Bootclass {

	public static void main(String[] args) {
		System.out.println("Hello from sts");
		show();

	}
	public static void show()
	{
		int[] arr= {20,30,40};
		for(int n:arr)
		{
			int sum=0;
			sum+=n;
			System.out.println(n);
		}
	System.out.println("show method here1");
	}

}
