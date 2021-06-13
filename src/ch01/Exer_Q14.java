package ch01;

import java.util.Scanner;

public class Exer_Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형을 출력합니다.\n단 수 : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("*****");
		}
	}
}
