package mainPage;

import java.util.Scanner;

import ys.Member;
import ys.Ys_Interface;
import hj.acc;
import js.Rec;
import eb.Eun;
import eb.Jo;

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
			Eun eb = new Eun();
			Scanner in = new Scanner(System.in);
			System.out.println("아이디와 비밀번호가 일치하면 로그인 됩니다 \n --예) 아이디:12 비번:12");

			while(true) {
			System.out.print("아이디 : ");
			eb.id=in.next();
			System.out.print("비밀번호 : ");
			eb.pw=in.next();
			if(eb.id.equals(eb.pw)) {
				eb.login(); break;
			}else {
				System.out.println("오류");
			}
			}
			System.out.println("로그아웃하시려면 0을 누르세요");
			if(in.nextInt()==0)
				eb.logout();
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
		int num;
		Rec bo = new Rec();
		while(true) {
			System.out.println("기능을 선택하세요");
			System.out.println("1.저자명으로 찾기 2.책 이름으로 찾기 3.리스트 보기 4.종료");
			num=scan.nextInt();
			if(num == 1) {
				bo.name(null);
			}if(num == 2) {
				bo.writer(null);
			}else if(num == 3) {
				bo.list(null);
			}
			else if(num == 4){
				System.out.println("종료 되었습니다.");
				break;
			} 
		}
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

