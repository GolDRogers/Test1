package com.main;


public class Test5 {

	public static void main(String[] args) {
		
		int[] arr=new int[] {0,0,5,1,3,0,1,0};
		Test5 t=new Test5();
		t.fzero(arr);
		t.bzero(arr);
		
		
	}
	
	private void fzero(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}
		}
		
		while(count<arr.length-1) {
			arr[count]=0;
			count++;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	private void bzero(int[] arr) {
		int count=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count--;
			}
		}
		
		while(count>=0) {
			arr[count]=0;
			count--;
		}
		System.out.println("=================================\n");
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
}
