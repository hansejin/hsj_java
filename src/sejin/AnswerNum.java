package sejin;

import java.util.Scanner;

public class AnswerNum {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (;;) {
			
			System.out.println("너가 생각한 숫자 맞아? h/l/c");
			String answer = scanner.nextLine();
			
			switch (answer) {
			case "h":

				break;
			case "l":

				break;

			default:
				System.out.println("ok");
				break;
			}

		}

	}
}
//100>>1 
