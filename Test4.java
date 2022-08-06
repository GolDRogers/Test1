package com.main;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		map.put("e", 1);
		map.put("d", 2);
		map.put("c", 3);
		map.put("b", 4);
		map.put("a", 5);
		 Test4 t=new Test4();
		 t.byStreams(map);
		 t.bytreemap(map);
		 t.bylist(map);
		
	}
	
	private void byStreams(Map<String, Integer> map) {
		Map<String, Integer> sortedmap=map.entrySet().stream().sorted((i1,i2)->i1.getKey().compareTo(i2.getKey())).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
				(e1,e2)->e1,LinkedHashMap::new));
		
		System.out.println(sortedmap);
	}
	
	private void bytreemap(Map<String, Integer> map) {
		Map<String, Integer> tree=new TreeMap<>(map);
		System.out.println(tree);
	}
	
	private void bylist(Map<String, Integer> map) {
		List<Entry<String, Integer>> sortedlist=new LinkedList<>(map.entrySet());
		Collections.sort(sortedlist,(i1,i2)->i1.getValue ()-i2.getValue());
		System.out.println(sortedlist);
	}

}
