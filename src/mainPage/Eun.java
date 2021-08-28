package mainPage;


import java.util.Scanner;

//id와passwd가 일치하면 로그인하고 로그아웃
interface i {
	public void login();

	public void logout();
}

class Eun implements i {
	String id;
	String pw;

	@Override
	public void login() {
		System.out.println("로그인 되었습니다.");

	}

	@Override
	public void logout() {
		System.out.println("로그아웃 되었습니다.");

	}


}