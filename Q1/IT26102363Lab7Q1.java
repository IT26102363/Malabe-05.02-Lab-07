import java.util.Scanner;

public class  IT26102363Lab7Q1 {

    public static void main(String[] args) {
		
		int marks[] = new int[4];
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		
		for(int count=0; count<4; count++){
			System.out.print("Enter Subject Mark " + (count+1) + ": ");
			marks[count] = input.nextInt();
		}
		
		for(int count=0; count<4; count++){
			sum=sum+marks[count];
		}
		
		System.out.println();
		
		double avg=sum/4.0;
		System.out.println("Average is : " + avg);
		
		if(avg<=100&&avg>=75){
			System.out.print("Overall Grade is : Distinction");
		}
		
		else if(avg<=74&&avg>=50){
			System.out.print("Overall Grade is : Credit");
		}
		
		else if(avg<=49&&avg>=0){
			System.out.print("Overall Grade is : Fail");
		}
		
		else{
			System.out.print("Enter valid marks");
		}
		
    }
}