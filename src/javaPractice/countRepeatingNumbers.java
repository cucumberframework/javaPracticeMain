package javaPractice;



//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class countRepeatingNumbers {
 public static void main(String[] args) {
     int[] nums = {2, 2, 1, 1, 2, 2, 2};
     test t =new test();
     t.intCalculation(nums);
 }
}

class test{
 public void intCalculation(int[] arr){
     System.out.print(arr);
     int count=1;
     int length1=arr.length;
         System.out.println("Lenght-->"+length1);

     Map<Integer, Integer> map= new LinkedHashMap<Integer,Integer>();
     for(int indInt:arr){
         if(map.containsKey(indInt)){
             map.put(indInt,map.get(indInt)+1);
         }else{
             map.put(indInt,count);
         }
     }
 System.out.println(map);
 Set<Integer> set1=map.keySet();
     //System.out.println(set1);
     Iterator<Integer> it= set1.iterator();
     while(it.hasNext()){
         int one=it.next();
         if(length1/2<map.get(one)){
             System.out.println("Integer repeating more than the n -->"+one);
         }
     }
 }
}