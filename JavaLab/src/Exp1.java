//
import java.util.*;
public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,size,flag = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size : ");
		size = sc.nextInt();
		System.out.println("Enter the elments of the array : ");
		int[] arr = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		
		for(int i =0;i<size;i++) {
			if(arr[i]==n) {
				flag=i+1;
			}
		}
		int sum = 0;
		for(int i =flag;i<size;i++) {
			sum+=arr[i];
		}
		int number = sum, reverse = 0;
		while(number!=0) {
			int remainder = number%10;
			reverse = reverse*10 + remainder;
			number = number/10;
		}
		
		System.out.println("Output : " + reverse );
		
		sc.close();
	}
 
}
