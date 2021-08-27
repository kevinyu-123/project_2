package hj;

public class acc implements account {
	private int mon = 1000;

	@Override
	public void show() {
		System.out.println("잔액은" + mon + "원 입니다.");
	}

	@Override
	public void deposit(int b) {
		mon+=b;
		System.out.println(b+"원 입금완료");
	}

	@Override
	public void withdraw(int a) {
		mon -=a;
		System.out.println(a + "원이 출금되었습니다.");
	}

	@Override
	public void list() {
		System.out.println("기능 선택: 1.계좌 보기 2.입금 3.출금");
	}

}
