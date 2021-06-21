package ch02;

import java.util.Scanner;

public class Exer_Q11 {
	public static class YMD {
		int y;	//년
		int m;	//월(1 ~ 12)
		int d;	//일(1 ~ 31)
		
		YMD(int y, int m, int d) {//주어진 날짜로 설정
			this.y = y;
			this.m = m;
			this.d = d;
		}//생성자
		
		//n일 뒤의 날짜를 반환
		YMD after(int n) {
			if(n < 0) before(-n);
			
			YMD temp = new YMD(this.y, this.m, this.d);
			
			temp.d += n;
			
			while(temp.d > mdays[isLeap(temp.y)][temp.m-1]) {
				temp.d -= mdays[isLeap(temp.y)][temp.m-1];
				if(++temp.m > 12) {
					temp.y++;
					temp.m = 1;
				}
			}
			
			return temp;
		}
		
		//n일 앞의 날짜를 반환
		YMD before(int n) {
			if(n < 0) after(-n);
			
			YMD temp = new YMD(this.y, this.m, this.d);
			
			temp.d -= n;
			
			while(temp.d < 1) {
				if(--temp.m < 1) {
					temp.y--;
					temp.m = 12;
				}
				temp.d += mdays[isLeap(temp.y)][temp.m-1];
			}
			
			return temp;
		}
	}
	
	public static int[][] mdays = {//각 달의 일수
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};//mdays
	
	public static int isLeap(int year) {//서기 year년은 윤년인가?(윤년 : 1/평년 : 0)
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}//isLeap
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = sc.nextInt();
		System.out.print("월：");
		int m = sc.nextInt();
		System.out.print("일：");
		int d = sc.nextInt();
		
		YMD date = new YMD(y, m, d);
		
		System.out.print("몇 일 앞/뒤의 날짜를 구할까요? : ");
		int n = sc.nextInt();
		
		YMD d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);
		
		YMD d2 = date.before(n);
		System.out.printf("%d일 전의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
	}
}
