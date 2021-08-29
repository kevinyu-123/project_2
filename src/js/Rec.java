package js;

import java.util.Scanner;


public class Rec implements Recommend {
	Scanner scan = new Scanner(System.in);
	@Override
	public void name(String n) {
	String wname;
	System.out.println("저자명을 입력해 주세요 : 김진수, 진수, 김");
	wname = scan.next();
	switch(wname) {
	case "김진수" :
		System.out.println("김진수님의 책은 Java 입니다.");
		break;
	case "진수" : 
		System.out.println("진수님의 책은 C입니다.");
		break;
	case "김" : 
		System.out.println("김님의 책은 Pyton입니다.");
		break;
	}
}
	@Override
	public void writer(String w) {
		String boname;
		System.out.println("책 제목을 입력해 주세요 : Java, C, Python");
		boname = scan.next();
		switch(boname) {
		case "Java" : 
			System.out.println("Java의 저자는 김진수 입니다.");
			break;
		case "C" : 
			System.out.println("C의 저자는 진수 입니다.");
			break;
		case "Python" :
			System.out.println("Python의 저자는 김 입니다.");
			break;
		}
	}
	@Override
	public void list(String l) {
		System.out.println("List 입니다.");
		System.out.println("1. 김진수의 Java");
		System.out.println("2. 진수의 C");
		System.out.println("3. 김의 Pyton");
	}
}
