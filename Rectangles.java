package basic;

import java.util.Scanner;

public class Rectangles {
	
	
	public int result(int[] a) {
		
		if(a[0] < a[4] && a[4] < a[2]) {
			
			return 1;		
		}
		else {
			return 0;
		}
	}
	public static void main(String args[]) {
		
		int a[] ;
		
		a = new int[8];
		Rectangles rectangles = new Rectangles();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 8 values");
			for(int i=0; i< 8;i++) {
				
				a[i] = sc.nextInt();
								
			}
		System.out.println(rectangles.result(a)); 
		
	}
}
