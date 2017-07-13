package sejin;

import java.util.Scanner;

public class Donut {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("r1 입력:");
		int r1=scanner.nextInt();
		System.out.print("r2 입력:");
		int r2=scanner.nextInt();
		
		double result=Math.PI*Math.pow(r1, 2)-Math.PI*Math.pow(r2, 2);
		result=r1<r2?Math.abs(result):result;
		
		System.out.println(result);
		
		
		
	}

}
