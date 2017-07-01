package SixThree;

import java.util.Scanner;

//main class
public class SixThree {
	
	//method to serach the element present inthe array or not by implementing bineary serach tech
	public static int search(int[] array,int ele){
		int start =0;
		int end = array.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(ele==array[mid]){
				System.out.println(ele+" is present in the array at :"+mid+" index");
				return 1;
			}
			if(ele<array[mid]){
				end=mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return 0;
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//created the array 
		int[] array ={2,4,6,8,10,12,14,16,18,20,21,26,27,28,29,45,48,50,61,67,70,99,100};
		
		//scanner class object created is used to take user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element to be searched");
		int element = sc.nextInt();
		//calling the search method by passing the array and element to be searched as a parameter
		int a =search(array,element);
		if(a == 0){
			System.out.println("Element not found");
		}
		sc.close();
		
		
	}

}
