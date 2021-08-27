package mainPage;

import java.util.Scanner;

import ys.Member;
import ys.Ys_Interface;
import hj.acc;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 원하는 기능 만들어서 넣기
		 */
		Scanner scan = new Scanner(System.in);
		int sel;
		System.out.println("기능 선택");
		System.out.println("1.조은별 2.한영수 3.김기범 4.김진수 5.유현준");
		sel = scan.nextInt();
		switch (sel) {
		case 1:
			break;
		case 2:
			Ys_Interface yi = new Member();
			yi.display();
			sel = scan.nextInt();
			switch (sel) {
			case 1:
				yi.warrior();
				break;
			case 2:
				yi.archer();
				break;
			case 3:
				yi.wizard();
				break;
			}
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			acc mon = new acc();
			mon.list();
			sel = scan.nextInt();
			switch (sel) {
			case 1:
				mon.show();
				break;
			case 2:
				System.out.print("넣을 금액 입력: ");
				int money = scan.nextInt();
				mon.deposit(money);
				break;
			case 3:
				System.out.print("뽑을 금액 입력: ");
				money = scan.nextInt();
				mon.withdraw(money);
				break;
			}
			break;
		}

	}
}
