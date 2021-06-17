package ch02;

import java.util.Scanner;

public class Exer_Q9 {
	public static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};//mdays
	
	public static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}//isLeap
	
	public static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i = 1; i < m; i++) {
			days += mdays[isLeap(y)][i-1];
		}
		return days;
	}//dayOfYear
	
	public static int leftDayOfYear(int y, int m, int d) {
		int days = mdays[isLeap(y)][m-1] - d;
		
		for(int i = m; i < 12; i++) {
			days += mdays[isLeap(y)][i];
		}
		
		return days;
	}//leftDayOfYear
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 겨오가 일수를 구합니다.");
		
		do {
			System.out.print("년 : "); int year = sc.nextInt();
			System.out.print("월 : "); int month = sc.nextInt();
			System.out.print("일 : "); int day = sc.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			System.out.printf("그 해 남은 일수는 %d일입니다.\n", leftDayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1.예 / 0.아니오) : ");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
