package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class anagram{ 
public static void main(String[] args){ 
    String str1="listen";
    String str2="1silent"; 
    boolean flag=true;
    char[] arr1= str1.toCharArray(); 
    Map<Character, Integer> map= new HashMap<Character, Integer>();
    for(char ch:arr1) {
    	if(!map.containsKey(ch)) {
    		map.put(ch, 1);
    	}
    }
    
    
    System.out.println(arr1);
    System.out.println(arr1[0]);
    int size= str2.length();
    System.out.println(size);
    for(int i=0;i<size;i++){
        if(map.containsKey(str2.charAt(i))){
        	System.out.println("anagram");

        flag=true;

        }else {
        	System.out.println("Not an anagram");
        	flag=false;
        	System.out.println("Not anagram");
        	break;
        }
    }

}
}