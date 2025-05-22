package javaPractice;

public class secondLargest {

	public static void main(String[] args) {
		int[] arr = { 110, 80, 50, 20, 10 };
		int findSecondLargest = secondLargest.number(arr);
		System.out.println("SecondLargest Number is-->" + findSecondLargest);
	}

	public static Integer number(int[] arrayAsInput) {
		int arrayLength= arrayAsInput.length;
		int max=0; 
		for(int a=0;a<=arrayLength-1;a++) {
			System.out.println(arrayAsInput[a]);
			System.out.println(arrayAsInput[a+1]);
			if(arrayAsInput[a]>arrayAsInput[a+1] && arrayAsInput[a]>max) {
				max=arrayAsInput[a]; 
				System.out.println("Max number is-->"+max);
			}else {
				max=arrayAsInput[a+1];
				System.out.println("Max-->"+max);
			}
		}
		return max;
	}
}
