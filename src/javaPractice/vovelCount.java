package javaPractice;


//Use this editor to write, compile and run your Java code online

public class vovelCount {
 public static void main(String[] args) {
     
     //Count vowels and consonants in a string
 String str="athis eis iname orahul uobe";
 char[] ch=str.toCharArray();
 int count=0;
 for(char ch1:ch){
     if(ch1=='a' || ch1=='e' ||ch1=='i' ||ch1=='o' ||ch1=='u'){
         count++;
     }
     
 }
 System.out.print("Count-->"+count);
 }
 
}