package sejin;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int weight;
		double height;
		
		
		System.out.print("������ �Է� : ");
		weight=sc.nextInt();
		System.out.print("Ű �Է�");
		height=sc.nextDouble();
		
		double bmi=weight/ Math.pow(height,2);
		
		if(bmi>30) {
				System.out.println("����");
		}else if(bmi>25) {
			System.out.println("�浵��");
		}else if(bmi>23) {
			System.out.println("������");
		}else if(bmi>18.5) {
			System.out.println("����");
		}else{
			System.out.println("��ü��");
		}
		
	
		
	}

}
