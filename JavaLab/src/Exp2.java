import java.util.*;
public class Exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number, sum=0;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a number : ");
		 number = sc.nextInt();
		 for(int i=0;i<=number;i++) {
			 if(i%2!=0) {
				 sum+=i;
			 }
		 }
		 System.out.println("Output : " + sum);
		 
		 sc.close();

	}

}
