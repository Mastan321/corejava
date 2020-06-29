package com.core;

public class Test09 {

	
	public static void main(String[] args) {
		
		int arr[][]=null;
		//arr=new int [][];  error
		//arr=new int [][3]; error
		arr=new int[3][];
		//arr[0]=22; error
		
		System.out.println(arr[0].length);
	}
}
