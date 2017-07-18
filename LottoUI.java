package oop2_2;

import java.util.Arrays;
import java.util.Scanner;

public class LottoUI {
	
	LottoMachine machine;
	
	public LottoUI() {
		machine = new LottoMachine();
	}

	public void showUsage() {
		System.out.println("show usage");
	}

	public void runTask() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("run task");
		
		while(true) {
			
			System.out.println("insert coins");
			
			int money = Integer.parseInt(scanner.nextLine());
			
			System.out.println(money);
			
			for(int i =0; i <money/1000; i++) {
				LottoBall[] result = machine.select();
				System.out.println(Arrays.toString(result));
			}
			
			if(money == -1) {
				break;
			}
			
		}
		
	}

}
