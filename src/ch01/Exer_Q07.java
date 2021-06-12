package ch01;

import java.util.Scanner;

public class Exer_Q07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			System.out.print(i == 1 ? i : " + " + i);
		}
		System.out.print(" = " + sum);
	}
}
