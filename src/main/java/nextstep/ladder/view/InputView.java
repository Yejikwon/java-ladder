package nextstep.ladder.view;

import java.util.Scanner;

public class InputView {
	private static final Scanner sc = new Scanner(System.in);

	public static String inputUsers() {
		System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요.)");
		return sc.nextLine();
	}

	public static int inputHeight() {
		System.out.println("최대 사다리 높이는 몇 개 인가요?");
		return sc.nextInt();
	}
}
