package javaPractice;

import java.util.*;

public class sumOfIntegerToMatchTarget {

	public static void main(String[] args) {
		int [] inputArray = {1,1,2};
		int [] removedDuplicates = sumOfIntegerToMatchTarget.removeDuplicate(inputArray);
		System.out.println(removedDuplicates[0]+" "+removedDuplicates[1] );
	}
	
	public static int[] removeDuplicate(int[] toBeRemoved) {
		int length= toBeRemoved.length; 
		int flag=toBeRemoved[0];
		List<Integer> allInt= new ArrayList<Integer>();
		System.out.println(length);
		for(int a=1;a<length;a++) { 
			if(flag==toBeRemoved[a]) {
				allInt.add(toBeRemoved[a]); 
				flag=toBeRemoved[a];
			}else {
				allInt.add(toBeRemoved[a]);
			}
			System.out.println(allInt);
		}
		return  new int[] {1,2};
	}
	
	
}
