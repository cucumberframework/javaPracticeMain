package javaPractice;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;

class duplicateFromIntegerArray {
	public static void main(String[] args) {
		System.out.println();
		int[] duplicateArray = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a : duplicateArray) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		System.out.println(map);
		Set<Integer> newSet = map.keySet();
		System.out.println(newSet);
		Iterator<Integer> it = newSet.iterator();
		while (it.hasNext()) {
			int indInt1 = it.next();
			if (map.get(indInt1) > 1) {
				System.out.println("Following is duplicate-->" + indInt1);

			}
		}
	}
}