package ys;

import mainPage.*;

public class Member implements Ys_Interface {

	@Override
	public void display() {
		System.out.println("보여줍니다.");
	}
	@Override
	public void memberSave() {
		System.out.println("저장합니다.");
	}
}

public class Main {

	public static void main(String[] args) {
		Ys_Interface yi = new Member();
		yi.display();
	}

}
