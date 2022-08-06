package com.main;

public class Test2 {

	public static void main(String[] args) {
		int temp=0;
		int[] arr=new int[] {1,1,3,4,1,5,12,2,3,4,8,1};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
