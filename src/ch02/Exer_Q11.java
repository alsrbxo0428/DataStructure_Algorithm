package ch02;

import java.util.Scanner;

public class Exer_Q11 {
	
	public static int[][] mdays = {//각 달의 일수
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};//mdays
	
	public static int isLeap(int year) {//서기 year년은 윤년인가?(윤년 : 1/평년 : 0)
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}//isLeap
	
	int y;	//년
	int m;	//월(1 ~ 12)
	int d;	//일(1 ~ 31)
		
	Exer_Q11(int y, int m, int d) {//주어진 날짜로 설정
		this.y = y;
		this.m = m;
		this.d = d;
	}//생성자
	
	//n일 뒤의 날짜를 반환
	Exer_Q11 after(int n) {
		return null;
	}
	
	//n일 앞의 날짜를 반환
	Exer_Q11 before(int n) {
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = sc.nextInt();
		System.out.print("월：");
		int m = sc.nextInt();
		System.out.print("일：");
		int d = sc.nextInt();
		
		Exer_Q11 date = new Exer_Q11(y, m, d);
		
		System.out.print("몇 일 앞/뒤의 날짜를 구할까요? : ");
		int n = sc.nextInt();
		
		Exer_Q11 d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);
		
		Exer_Q11 d2 = date.before(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
	}
}
