package javaPractice;
class A {
 private static void metA(){
     System.out.print("No arg");
 }
 private static void metA(String A){
     System.out.print("One Arg arg");
 }
}

class B extends A{
public static void reverseWord(String str){
 System.out.print(str);
}

}
class main1{
     public static void main(String[] args) {
String str= "swiss i need to reverse each word";
B.reverseWord(str);
}
}


