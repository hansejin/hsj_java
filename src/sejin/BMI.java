package sejin;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int weight;
		double height;
		
		
		System.out.print("몸무게 입력 : ");
		weight=sc.nextInt();
		System.out.print("키 입력");
		height=sc.nextDouble();
		
		double bmi=weight/ Math.pow(height,2);
		
		if(bmi>30) {
				System.out.println("고도비만");
		}else if(bmi>25) {
			System.out.println("경도비만");
		}else if(bmi>23) {
			System.out.println("과제충");
		}else if(bmi>18.5) {
			System.out.println("정상");
		}else{
			System.out.println("저체중");
		}
		
	
		
	}

}
