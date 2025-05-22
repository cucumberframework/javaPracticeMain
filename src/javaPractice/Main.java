package javaPractice;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
 
 public static void main(String[] args) {
String str= "swiss";
char[] ch= str.toCharArray();
Map<Character, Integer> ch1=Main.returnCharacter(ch);
//System.out.print(ch1);
Set<Character> keys=ch1.keySet();
for(char charKey:keys){
 if(ch1.get(charKey)==1){
     System.out.print(charKey);
     break;
 }
}
 }
 
 public static Map<Character,Integer> returnCharacter(char [] inputChar){ 
     Map<Character, Integer> map= new HashMap<Character,Integer>();
     int count =1;
     
     int len= inputChar.length;
     //System.out.print(len);
     for(Character chInd:inputChar){
         if(!map.containsKey(chInd)){
             map.put(chInd,count);
         }else{
             map.put(chInd,map.get(chInd)+1);
         }
     }
   return map;  
}
}
