import java.util.Scanner;

public class  IT26102363Lab7Q1B {

    public static void main(String[] args) {
		
		double avg;
		int sum;
		
		Scanner input = new Scanner(System.in);
		
		for(int i=1; i<=3; i++){
			System.out.println("Student " + i);
			System.out.print("Enter Marks: ");
			
			int m1 = input.nextInt();
			int m2 = input.nextInt();
			int m3 = input.nextInt();
			int m4 = input.nextInt();
			
			sum=m1+m2+m3+m4;
			avg= sum/4.0;
			
			System.out.println("Average is : " + avg);
			
			if(avg<=100&&avg>=75){
				System.out.println("Overall Grade is : Distinction");
			}
		
			else if(avg<=74&&avg>=50){
				System.out.println("Overall Grade is : Credit");
			}
		
			else if(avg<=49&&avg>=0){
				System.out.println("Overall Grade is : Fail");
			}
		
			else{
				System.out.println("Enter valid marks");
			}
			
			System.out.println();
		
		}
	}
}