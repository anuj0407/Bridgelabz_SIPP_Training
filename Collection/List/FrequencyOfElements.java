package collection;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
	public static void main(String[] args) {
		String str[] = {"apple", "banana", "apple", "orange","apple", "banana", "apple", "orange"};
		Map<String , Integer> map = new HashMap<>();
		
		System.out.println("\nElement Frequencies:");
		for(int i=0;i<str.length;i++) {
			map.put(str[i],map.getOrDefault(str[i],0)+1);
			
		}
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
//		}
		System.out.print(map);
	}
}