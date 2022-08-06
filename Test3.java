package com.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		int[] arr=new int[] {1,1,3,4,1,5,12,2,3,4,8,1};
		//  int[] freq=new int{4,-1,2,2,-1,1,1,1,-1,-1,1,-1};
		Test3 t=new Test3();
		t.freqarray(arr);
		t.freqmap(arr);
		t.maxint(arr);
	}

	private void maxint(int[] arr){
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		int max=list.stream().max(Comparator.reverseOrder()).get();
		System.out.println(max+"\n");
	}

	private void freqarray(int[] arr) {
		int[] freq=new int[arr.length];
		System.out.println(arr);
		Arrays.sort(arr);
		int pos=-1;

		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					freq[j]=pos;
					count++;
				}
			}

			if(freq[i]!=pos) {
				freq[i]=count; 
			}
		}

		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=pos) {
				System.out.println(arr[i]+" freq = "+freq[i]);
			}
		}
	}
	
	private void freqmap(int[]arr) {
		Map<Integer, Integer> hm=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println("=========================================\n");
		Set<Integer> keys=hm.keySet();
		for (Integer key : keys) {
			System.out.println(key+"  Freq = "+hm.get(key));
		}
	}

}
