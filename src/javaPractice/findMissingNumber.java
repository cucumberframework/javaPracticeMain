package javaPractice;



//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class findMissingNumber {
 public static void main(String[] args) {
     //Input: [1, 2, 3, 5] → Output: 4
Integer [] arr= {1, 2, 3, 5};
//System.out.println(arr[0]);
//System.out.println(arr.length);
int initialInteger=arr[0];
int lastElement= arr[arr.length-1];
System.out.println(initialInteger);
System.out.println(lastElement);
Map<Integer, Integer> map= new LinkedHashMap<>();
for(Integer intInd:arr){
 map.put(intInd,1);
}
//System.out.print(map);

for(int j=initialInteger;j<=lastElement;j++){
 if(!map.containsKey(j)){
     System.out.println("Missing Number is--> "+j);
 }
}


 }
}