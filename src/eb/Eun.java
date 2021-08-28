package eb;


import java.util.Scanner;

//id와passwd가 일치하면 로그인하고 로그아웃

public class Eun implements Jo {
	public String id;
	public String pw;
	@Override
	public void login() {
		System.out.println("로그인 되었습니다.");

	}

	@Override
	public void logout() {
		System.out.println("로그아웃 되었습니다.");

	}


}