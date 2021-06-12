package ch01;

import java.util.Scanner;

public class Exer_Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 1; n > 0; i++) {
			n /= 10;
			cnt = i;
		}
		System.out.println("그 수는 " + cnt + "자리입니다.");
	}
}