package oop2_2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LottoMachine {

	LottoBall[] balls;

	public LottoMachine() {
		balls = new LottoBall[45];

		IntStream.range(1, 46).forEach(x -> {
			balls[x - 1] = new LottoBall(x);
		});
	}

	public LottoBall[] select() {
		LottoBall[] result = new LottoBall[6];
		int len = balls.length;

		for (int i = 0; i < 6; i++) {

			int idx = (int) (Math.random() * len);

			LottoBall last = balls[len - 1];
			LottoBall temp = balls[idx];

			balls[idx] = last;
			balls[len - 1] = temp;

			len--;
		}

		
		System.arraycopy(balls, 39, result, 0, 6);

		return result;

	}

}
