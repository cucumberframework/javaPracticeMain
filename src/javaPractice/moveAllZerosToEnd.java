package javaPractice;
//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class moveAllZerosToEnd {
 public static void main(String[] args) {
     System.out.println("Try programiz.pro");
     
     //Input: [0, 1, 0, 3, 12] → Output: [1, 3, 12, 0, 0]
       List<Integer> listArr= new LinkedList<Integer>();
       List<Integer> listArrOfZero= new LinkedList<Integer>();
     Integer[] arr1={0, 1, 0, 3, 12};
     int length1=arr1.length;
             System.out.println(length1);

     for(int i=0;i<length1;i++){
         if(arr1[i]!=0){
            listArr.add(arr1[i]); 
         }else{
             listArrOfZero.add(arr1[i]);
         }
     }
      listArr.addAll(listArrOfZero);
     System.out.println(listArr);
 }
}