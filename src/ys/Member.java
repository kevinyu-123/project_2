package ys;

import java.util.Scanner;

public class Member implements Ys_Interface {

	@Override
	public void display() {
		System.out.println("당신의 성향을 분석합니다.");
		System.out.println("가까이서 싸우는게 좋으면 1, 중간에서 싸우는게 좋으면 2, 멀리서 싸우는게 좋으면 3");
	}		

	@Override
	public void warrior() {
		System.out.println("전사의 주 무기는 칼, 도끼, 창 입니다.");
		System.out.println("전사의 체력은 200 입니다.");
	}

	@Override
	public void wizard() {
		System.out.println("마법사의 주 무기는 스태프, 완드 입니다.");
		System.out.println("마법사의 체력은 100 입니다.");
	}

	@Override
	public void archer() {
		System.out.println("궁수의 주 무기는 활, 석궁 입니다.");
		System.out.println("궁수의 체력은 150 입니다.");
	}
	
	
}
