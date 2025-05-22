package javaPractice;


	import java.util.*;

	class firstNonRepeatingCharacter {
	    public static void main(String[] args) {
	String str="swiss";
	firstNonRepeatingCharacter.firstChar(str);
	    }
	    public static void firstChar(String inputStr){
	        char[] arr=inputStr.toCharArray();
	        int count=1;
	        Map<Character, Integer> map= new HashMap<Character,Integer>();
	        for(char ch1:arr){
	            if(!map.containsKey(ch1)){
	                map.put(ch1,count);
	            }else{
	                map.put(ch1,map.get(ch1)+1);
	            }
	        }
	        System.out.print(map);
	       Set<Character> keys= map.keySet();
	      Iterator<Character> it= keys.iterator();
	       while(it.hasNext()) {
	    	   Character ch= it.next();
	    	   if(map.get(ch)==1) {
	    		   System.out.println(ch);
	    		   break;
	    	   }
	       }
	       }
	    }

