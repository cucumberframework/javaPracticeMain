package javaPractice;


import java.util.*;
class reverseString{
        public static void main(String[] args) {
String str= "swiss i need to reverse each word";
child1.reverseWord(str);
}
}

class parent1 {
    private static void metA(){
        System.out.print("No arg");
    }
    private static void metA(String A){
        System.out.print("One Arg arg");
    }
}

class child1 extends parent1{
public static void reverseWord(String str){
    //swiss i need to reverse each word
    String[] strArr= str.split(" ");
    for(String indStr:strArr){
        System.out.print(" ");
        for(int i=indStr.length()-1;i>=0;i--){
            System.out.print(indStr.charAt(i));
        }
    }
}

}



